package org.sduwh.vcode.server.service;

import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoService<T> {
    protected MongoTemplate mongo;

    public MongoService(MongoTemplate mongo) {
        this.mongo = mongo;
    }

    public void create(T t) {
        mongo.insert(t);
    }
}
