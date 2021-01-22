package com.example.springboot_blog.myblog.controller;

import com.example.springboot_blog.myblog.entity.Blog;
import com.example.springboot_blog.myblog.entity.queryVo.DetailedBlog;
import com.example.springboot_blog.myblog.entity.queryVo.FirstPageBlog;
import com.example.springboot_blog.myblog.entity.queryVo.RecommendBlog;
import com.example.springboot_blog.myblog.service.BlogService;
import com.example.springboot_blog.myblog.util.IpUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: IndexController
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 9:57
 * @Version: 1.0
 */
@Controller
public class IndexController {
    @Autowired
    private BlogService blogService;

    private HashSet<String> set = new HashSet<>();

    //分页查询博客列表
    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, RedirectAttributes attributes){
        PageHelper.startPage(pageNum,6);
        List<FirstPageBlog> allFirstPageBlog = blogService.getAllFirstPageBlog();
        List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog();

        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(allFirstPageBlog);
        System.out.println("pageInfo:" +pageInfo);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("recommendedBlogs", recommendedBlog);
        return "index";
    }

    //搜索博客
    @PostMapping("/search")
    public String search(Model model,
                         @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum,
                         @RequestParam String query) {
        PageHelper.startPage(pageNum, 1000);
        List<FirstPageBlog> searchBlog = blogService.getSearchBlog(query);

        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(searchBlog);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("query", query);
        return "search";
    }

    //博客信息统计
    @GetMapping("/footer/blogmessage")
    public String blogMessage(Model model){
        int blogTotal = blogService.getBlogTotal();
        int blogViewTotal = blogService.getBlogViewTotal();
        int blogCommentTotal = blogService.getBlogCommentTotal();
        int blogMessageTotal = blogService.getBlogMessageTotal();

        model.addAttribute("blogTotal",blogTotal);
        model.addAttribute("blogViewTotal",blogViewTotal);
        model.addAttribute("blogCommentTotal",blogCommentTotal);
        model.addAttribute("blogMessageTotal",blogMessageTotal);
        return "index :: blogMessage";
    }

    //跳转博客详情页面
    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Integer id, Model model) {
        DetailedBlog detailedBlog = blogService.getDetailedBlog(id);
        model.addAttribute("blog", detailedBlog);
        return "blog";
    }

    // 修改点赞数
   /* @GetMapping("/like/{id}")
    public String likeBlog(@PathVariable Integer id, Model model,HttpServletRequest request){
        StringBuilder sb = new StringBuilder(Integer.toHexString(id));
        sb.append(IpUtils.getIpAddress(request));
        String temp = sb.toString();
        System.out.println("========>"+temp);
        boolean result = true;
        if (!set.contains(temp)){
            set.add(temp);
            blogService.updateLikeCount(id);
            result = false;
        }
        DetailedBlog detailedBlog = blogService.getDetailedBlog(id);
        model.addAttribute("blog", detailedBlog);
        model.addAttribute("result",result);
        return "blog";
    }*/
    @PostMapping("/like")
    public String post(Blog blog,  Model model,HttpServletRequest request) {
        Integer id = blog.getId();
        StringBuilder sb = new StringBuilder(Integer.toHexString(id));
        sb.append(IpUtils.getIpAddress(request));
        String temp = sb.toString();
        System.out.println("========>"+temp);
        boolean result = true;
        if (!set.contains(temp)){
            set.add(temp);
            blogService.updateLikeCount(id);
            result = false;
        }
        DetailedBlog detailedBlog = blogService.getDetailedBlog(id);
        model.addAttribute("blog", detailedBlog);
        model.addAttribute("result",result);
        return "blog :: blogShow";
    }

    @GetMapping("/ip")
    @ResponseBody
    public String printAddress(HttpServletRequest request){
        System.out.println("=============>"+IpUtils.getIpAddress(request));
        return IpUtils.getIpAddress(request);
    }
}
