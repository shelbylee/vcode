package org.sduwh.vcode.channel;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
@SuppressWarnings("WeakerAccess")
public class RedisConfig {
    public static String host;
    public static int port;
    public static String channelJudge;
    public static String channelRemoteJudge;

    static {
        var props = new Properties();
        try {
            var stream = RedisConfig.class.getClassLoader().getResourceAsStream("redis.properties");
            if (stream != null) {
                props.load(stream);
            }
        } catch (Exception e) {
            log.error("Failed to load redis.properties", e);
        }

        host = props.getProperty("redis.host");
        port = Integer.parseInt(props.getProperty("redis.port"));
        channelJudge = props.getProperty("redis.channel.judge");
        channelRemoteJudge = props.getProperty("redis.channel.remote-judge");
    }
}
