package org.sduwh.vcode.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/problem")
public class ProblemController {
    @GetMapping
    public String list(Model model) {
        return "problem-list";
    }

    @GetMapping("/{id}")
    public String detail(Model model) {
        return "problem";
    }
}
