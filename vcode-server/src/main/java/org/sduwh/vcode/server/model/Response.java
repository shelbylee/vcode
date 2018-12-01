package org.sduwh.vcode.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Response {
    private boolean success;
    private Object data;

    public static Response success() {
        return success(null);
    }

    public static Response success(Object data) {
        Response response = new Response();
        response.success = true;
        response.data = data;
        return response;
    }

    public static Response failed(String error) {
        Response response = new Response();
        response.success = false;
        response.data = error;
        return response;
    }
}
