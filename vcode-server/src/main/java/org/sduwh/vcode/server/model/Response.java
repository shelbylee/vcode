package org.sduwh.vcode.server.model;

import lombok.Data;

@Data
public class Response {
    private boolean success;
    private Object data;

    public static Response success() {
        return success(null);
    }

    public static Response success(Object data) {
        var response = new Response();
        response.success = true;
        response.data = data;
        return response;
    }

    public static Response failed(String error) {
        var response = new Response();
        response.success = false;
        response.data = error;
        return response;
    }
}
