package org.sduwh.vcode.server.config;

import lombok.extern.slf4j.Slf4j;
import org.sduwh.vcode.channel.RedisConfig;

import java.util.Properties;

@Slf4j
public class ServerConfig {
    public static int port;

    static {
        var props = new Properties();
        try {
            var stream = RedisConfig.class.getClassLoader().getResourceAsStream("server.properties");
            if (stream != null) {
                props.load(stream);
            }
        } catch (Exception e) {
            log.error("Failed to load server.properties", e);
        }
        port = Integer.parseInt(props.getProperty("server.port"));
    }
}
