import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Books;
import service.BookService;

public class A {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService= (BookService) context.getBean("bookService");
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
