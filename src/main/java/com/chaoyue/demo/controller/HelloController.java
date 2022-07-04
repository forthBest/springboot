package com.chaoyue.demo.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","Hello , SpringBoot!!!");
        request.setAttribute("key","first param");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("nextparam");
        request.setAttribute("key2",strings);
        mv.setViewName("index.jsp");
        return mv;
    }

}
