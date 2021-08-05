package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import pojo.Ren;
import service.BookService;
import service.RenService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @Resource(name = "bookService")
    private BookService bookService;
    @Resource(name = "renService")
    private RenService renService;

    @RequestMapping("/allBook")
    public String allBook(Model model) {
            List<Books> list = bookService.queryAllBook();
            model.addAttribute("list", list);
            return "allBook";
    }

    @RequestMapping("/login")
    public String login(Model model, Ren ren){
        String password=renService.Password(ren.getId());
        if(ren.getPassword().equals(password)) {
            return "redirect:/allBook";
        }
        else {
            model.addAttribute("error","用户或者密码不正确");
            return "login";
        }
    }

    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books book) {
        bookService.addBook(book);
        return "redirect:/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model,int id) {
        Books book=bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook( Books book) {
        bookService.updateBook(book);
        return "redirect:/allBook";
    }
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/allBook";
    }

    @RequestMapping("/queryBookByName")
    public String queryBookByName(Model model,String bookName){
        Books book=bookService.queryBookByName(bookName);
        List<Books> list=new ArrayList<>();
        list.add(book);
        if(book==null) {
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}
