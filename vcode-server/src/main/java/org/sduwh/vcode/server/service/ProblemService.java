package org.sduwh.vcode.server.service;

import org.sduwh.vcode.server.model.Problem;
import org.sduwh.vcode.server.model.ProblemListItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {
    private MongoTemplate mongoTemplate;

    @Autowired
    public ProblemService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void create(Problem problem) {
        if (problem != null) {
            mongoTemplate.insert(problem);
        }
    }

    public Problem query(String id) {
        return mongoTemplate.findById(id, Problem.class);
    }

    public List<ProblemListItem> queryList() {
        return mongoTemplate.findAll(ProblemListItem.class);
    }
}
