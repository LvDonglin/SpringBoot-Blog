package com.example.springboot_blog.myblog.controller;

import com.example.springboot_blog.myblog.entity.queryVo.BlogQuery;
import com.example.springboot_blog.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: ArchiveShowController
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/4 19:19
 * @Version: 1.0
 */
@Controller
public class ArchiveShowController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/archives")
    public String archive(Model model){
        List<BlogQuery> blogs = blogService.getAllBlog();
        model.addAttribute("blogs", blogs);
        return "archives";
    }

}
