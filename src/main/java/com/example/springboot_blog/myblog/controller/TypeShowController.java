package com.example.springboot_blog.myblog.controller;

import com.example.springboot_blog.myblog.entity.Type;
import com.example.springboot_blog.myblog.entity.queryVo.FirstPageBlog;
import com.example.springboot_blog.myblog.service.BlogService;
import com.example.springboot_blog.myblog.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: TypeShowController
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/4 19:12
 * @Version: 1.0
 */
@Controller
public class TypeShowController {

    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

    //    分页查询分类
    @GetMapping("/types/{id}")
    public String types(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, @PathVariable Integer id, Model model) {
        List<Type> types = typeService.getAllTypeAndBlog();

        //id为-1表示从首页导航栏点击进入分类页面
        if (id == -1) {
            id = types.get(0).getId();
        }
        model.addAttribute("types", types);
        List<FirstPageBlog> blogs = blogService.getByTypeId(id);

        PageHelper.startPage(pageNum, 10000);
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(blogs);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("activeTypeId", id);
        return "types";
    }

}