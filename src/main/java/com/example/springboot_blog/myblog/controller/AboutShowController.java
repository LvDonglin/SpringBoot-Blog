package com.example.springboot_blog.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: AboutShowController
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/4 19:23
 * @Version: 1.0
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
