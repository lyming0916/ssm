package dao;


import org.apache.ibatis.annotations.*;
import pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一个Book
    @Insert(" insert into books values (#{bookId},#{bookName},#{bookCounts},#{detail})")
    int addBook(Books book);

    //根据id删除一个Book
    @Delete("delete from books where bookId=#{bookId}")
    int deleteBookById(@Param("bookId") int id);

    //更新Book
    @Update("update books set bookName = #{bookName},bookCounts = #{bookCounts},detail = #{detail} where bookId = #{bookId}")
    int updateBook(Books books);

    //根据id查询,返回一个Book
    @Select("select * from books where bookId=#{bookId}")
    Books queryBookById(@Param("bookId") int id);

    //查询全部Book,返回list集合
    @Select("select * from books")
    List<Books> queryAllBook();

    @Select("select * from books where bookName=#{bookName}")
    Books queryBookByName(String bookName);

}