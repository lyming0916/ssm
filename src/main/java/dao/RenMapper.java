package dao;

import org.apache.ibatis.annotations.Select;

public interface RenMapper {
    @Select("select Password from ren where Id=#{Id}")
    String Password(String Id);
}
