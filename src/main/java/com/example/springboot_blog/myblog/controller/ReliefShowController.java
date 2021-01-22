package com.example.springboot_blog.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: ReliefShowController
 * @Author: 吕东霖
 * @Description: 免责声明
 * @Date: 2020/12/7 17:13
 * @Version: 1.0
 */
@Controller
public class ReliefShowController {
    @GetMapping("/relief")
    public String about() {
        return "relief";
    }
}
