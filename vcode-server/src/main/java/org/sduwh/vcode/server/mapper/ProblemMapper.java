package org.sduwh.vcode.server.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.sduwh.vcode.server.model.ProblemListItem;

import java.util.List;

public interface ProblemMapper {
    @Select("SELECT `id`, `title` FROM `problem`")
//    @Results({
//            @Result(property = "createdAt", column = "created_at"),
//            @Result(property = "updatedAt", column = "updated_at"),
//    })
    List<ProblemListItem> queryList();
}
