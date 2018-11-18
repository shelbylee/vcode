package org.sduwh.vcode.server.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.sduwh.vcode.server.model.problem.ProblemListItem;

import java.util.List;

public interface ProblemMapper {
    @Select("select * from `problem` limit #{limit} offset #{offset}")
    List<ProblemListItem> queryList(@Param("limit") int limit,
                                    @Param("offset") int offset);
}
