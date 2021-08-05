package dao;


import org.apache.ibatis.annotations.*;
import pojo.Books;

import java.util.List;

public interface BookMapper {
    //����һ��Book
    @Insert(" insert into books values (#{bookId},#{bookName},#{bookCounts},#{detail})")
    int addBook(Books book);

    //����idɾ��һ��Book
    @Delete("delete from books where bookId=#{bookId}")
    int deleteBookById(@Param("bookId") int id);

    //����Book
    @Update("update books set bookName = #{bookName},bookCounts = #{bookCounts},detail = #{detail} where bookId = #{bookId}")
    int updateBook(Books books);

    //����id��ѯ,����һ��Book
    @Select("select * from books where bookId=#{bookId}")
    Books queryBookById(@Param("bookId") int id);

    //��ѯȫ��Book,����list����
    @Select("select * from books")
    List<Books> queryAllBook();

    @Select("select * from books where bookName=#{bookName}")
    Books queryBookByName(String bookName);

}