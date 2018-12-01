package org.sduwh.vcode.server.service;

import org.sduwh.vcode.server.model.Problem;
import org.sduwh.vcode.server.model.ProblemListItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService extends MongoService<Problem> {
    private MongoTemplate mongo;

    @Autowired
    public ProblemService(MongoTemplate mongo) {
        super(mongo);
    }

    public List<ProblemListItem> queryList(int skip, int limit) {
        Query query = new Query(Criteria.where(""));
        return mongo.find(query, ProblemListItem.class);
    }
}
