package org.sduwh.vcode.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.sduwh.vcode.server.mapper")
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class);
    }
}
