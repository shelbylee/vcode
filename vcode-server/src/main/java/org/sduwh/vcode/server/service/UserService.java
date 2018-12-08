package org.sduwh.vcode.server.service;

import org.sduwh.vcode.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private MongoTemplate mongoTemplate;

    @Autowired
    public UserService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void create(User user) {
        if (user != null) {
            mongoTemplate.insert(user);
        }
    }

    public User query(String id) {
        return mongoTemplate.findById(id, User.class);
    }
}
