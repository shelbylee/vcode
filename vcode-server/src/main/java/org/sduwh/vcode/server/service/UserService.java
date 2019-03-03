package org.sduwh.vcode.server.service;

import io.grpc.stub.StreamObserver;
import org.sduwh.vcode.server.proto.*;

public class UserService extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        super.login(request, responseObserver);
    }

    @Override
    public void register(RegisterRequest request, StreamObserver<RegisterResponse> responseObserver) {
        super.register(request, responseObserver);
    }
}
