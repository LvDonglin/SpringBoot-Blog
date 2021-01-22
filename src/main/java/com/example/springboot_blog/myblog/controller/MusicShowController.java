package com.example.springboot_blog.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: MusicShowController
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/4 19:21
 * @Version: 1.0
 */
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}