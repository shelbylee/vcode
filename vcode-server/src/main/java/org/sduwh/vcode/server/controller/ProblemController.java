package org.sduwh.vcode.server.controller;

import org.sduwh.vcode.server.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/problem")
public class ProblemController {
    @PostMapping
    public Response create() {
        return Response.success();
    }

    @GetMapping("/list")
    public Response list() {
        return Response.success();
    }
}
