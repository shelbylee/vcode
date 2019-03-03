package org.sduwh.vcode.data.mapper;

import org.apache.ibatis.annotations.*;
import org.sduwh.vcode.data.model.Problem;

import java.util.List;

@Mapper
public interface ProblemMapper {
    @Insert("INSERT INTO problem (" +
            "    user_id, title, time_limit, memory_limit, description" +
            ") VALUES (" +
            "    #{userId}, #{title}, #{timeLimit}, #{memoryLimit}, #{description}" +
            ")")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(Problem problem);

    @Update("UPDATE problem SET" +
            "    user_id = #{userId}" +
            "    title = #{title}," +
            "    time_limit = #{timeLimit}," +
            "    memory_limit = #{memoryLimit}," +
            "    description = #{description}" +
            "WHERE" +
            "    id = #{id}")
    void update(Problem problem);

    @Select("SELECT * FROM problem WHERE id = #{id}")
    @Results({
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at"),
    })
    Problem select();

    @Select("SELECT * FROM problem ORDER BY created_at ASC")
    @Results({
            @Result(property = "createdAt", column = "created_at"),
            @Result(property = "updatedAt", column = "updated_at"),
    })
    List<Problem> list(long offset, long limit);
}
