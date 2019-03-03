package org.sduwh.vcode.data.mapper;

import org.apache.ibatis.annotations.*;
import org.sduwh.vcode.data.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (" +
            "    email, username, password" +
            ") VALUES (" +
            "    #{email}, #{username}, #{password}" +
            ")")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(User user);

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at"),
    })
    User select(@Param("id") Long id);

    @Select("SELECT * FROM user ORDER BY created_at ASC")
    @Results({
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at"),
    })
    List<User> list();
}
