package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 王雪刚
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv  = new ModelAndView();
        mv.addObject("data","SpringBoot打包为jar");
        mv.setViewName("main");
        return mv;
    }
}
