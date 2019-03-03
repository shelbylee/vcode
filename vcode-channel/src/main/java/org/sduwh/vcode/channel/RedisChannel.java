package org.sduwh.vcode.channel;

import com.google.gson.Gson;
import redis.clients.jedis.Jedis;

import java.util.List;

@SuppressWarnings("WeakerAccess")
public class RedisChannel<T> implements Channel<T> {
    private static final int POP_TIMEOUT = 0;

    private String topic;
    private Jedis jedis;
    private Class<T> clazz;
    private Gson gson = new Gson();

    public RedisChannel(String topic, Class<T> clazz) {
        this.topic = topic;
        this.jedis = new Jedis(RedisConfig.host, RedisConfig.port);
        this.clazz = clazz;
    }

    @Override
    public void produce(T t) {
        String json = gson.toJson(t);
        jedis.rpush(topic, json);
    }

    @Override
    public T consume() {
        List<String> r = jedis.blpop(POP_TIMEOUT, topic);
        if (r.size() != 2) {
            return null;
        }
        return gson.fromJson(r.get(1), clazz);
    }
}
