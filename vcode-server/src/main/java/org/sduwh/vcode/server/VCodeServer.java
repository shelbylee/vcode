package org.sduwh.vcode.server;

import io.grpc.ServerBuilder;
import org.sduwh.vcode.server.config.ServerConfig;
import org.sduwh.vcode.server.service.ProblemService;
import org.sduwh.vcode.server.service.UserService;

public class VCodeServer {
    public static void main(String[] args) throws Exception {
        var server = ServerBuilder.forPort(ServerConfig.port)
                .addService(new UserService())
                .addService(new ProblemService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
