package org.sduwh.vcode.server.service;

import org.sduwh.vcode.server.mapper.ProblemMapper;
import org.sduwh.vcode.server.model.problem.ProblemListItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {
    @Autowired
    private ProblemMapper problemMapper;

    public List<ProblemListItem> queryList(int limit, int offset) {
        return problemMapper.queryList(limit, offset);
    }
}
