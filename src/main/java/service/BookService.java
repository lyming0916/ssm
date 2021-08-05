package service;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;


public interface BookService {
    //����һ��Book
    int addBook(Books book);

    //����idɾ��һ��Book
    int deleteBookById(@Param("bookId") int id);

    //����Book
    int updateBook(Books books);

    //����id��ѯ,����һ��Book
    Books queryBookById(@Param("bookId") int id);

    //��ѯȫ��Book,����list����
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);
}