package com.example.task4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.Map;

@Controller
public class FirstController {

    @GetMapping("first")
    public String headers(@RequestHeader Map<String, String> headers, Model model) {
        model.addAttribute("headers", headers);
        return "hello";
    }

}
