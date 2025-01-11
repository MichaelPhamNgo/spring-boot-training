package com.example.jspdemo.controller;

import com.example.jspdemo.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JspDemoController {

    @GetMapping("/test-scriptlet")
    public String testScriptlet(Model model) {
        model.addAttribute("name", "jack");
        return "scriptingElementsDemo";
    }

    @GetMapping("/test-include-directive")
    public String testIncludeDirective() {
        return "includeDirectiveDemo";
    }

    @GetMapping("/test-include-action")
    public String testIncludeJspAction() {
        return "includeJspActionDemo";
    }

    @GetMapping("/test-jstl")
    public String testJstl(Model model) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 19));
        studentList.add(new Student("Bob", 21));
        studentList.add(new Student("Jordan", 23));
        model.addAttribute("students", studentList);
        return "JstlDemo";
    }
}
