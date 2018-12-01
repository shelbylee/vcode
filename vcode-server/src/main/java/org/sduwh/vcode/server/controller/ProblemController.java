package org.sduwh.vcode.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.sduwh.vcode.server.model.Response;
import org.sduwh.vcode.server.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/problem")
public class ProblemController {
    private ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @PostMapping("/list")
    public Response list() {
        return Response.success();
    }

    @PostMapping("/create")
    public Response create() {
        return Response.success();
    }

    @PostMapping("/query/{id}")
    public Response query(@PathVariable("id") int id) {
        return Response.success(id);
    }

    @PostMapping("/update/{id}")
    public Response update(@PathVariable("id") int id) {
        return Response.success();
    }

    @PostMapping("/delete/{id}")
    public Response delete(@PathVariable("id") int id) {
        return Response.success();
    }
}
