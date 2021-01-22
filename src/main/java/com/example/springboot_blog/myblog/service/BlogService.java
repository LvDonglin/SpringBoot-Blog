package com.example.springboot_blog.myblog.service;

import com.example.springboot_blog.myblog.entity.Blog;
import com.example.springboot_blog.myblog.entity.queryVo.*;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service
 * @ClassName: BlogService
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/1 10:17
 * @Version: 1.0
 */
public interface BlogService {
    //保存新增博客
    int saveBlog(Blog blog);

    //查询文章管理列表
    List<BlogQuery> getAllBlog();

    //删除博客
    void deleteBlog(Integer id);

    //查询编辑修改的文章
    ShowBlog getBlogById(Integer id);

    //编辑修改文章
    int updateBlog(ShowBlog showBlog);

    //搜索博客管理列表
    List<BlogQuery> getBlogBySearch(SearchBlog searchBlog);


    //点赞数更新
    int updateLikeCount(Integer id);

    //查询首页最新博客列表信息
    List<FirstPageBlog> getAllFirstPageBlog();

    //查询首页最新推荐信息
    List<RecommendBlog> getRecommendedBlog();

    //搜索博客列表
    List<FirstPageBlog> getSearchBlog(String query);

    //统计博客总数
    Integer getBlogTotal();

    //统计访问总数
    Integer getBlogViewTotal();

    //统计评论总数
    Integer getBlogCommentTotal();

    //统计留言总数
    Integer getBlogMessageTotal();



    //查询博客详情
    DetailedBlog getDetailedBlog(Integer id);


    //根据TypeId查询博客列表，显示在分类页面
    List<FirstPageBlog> getByTypeId(Integer typeId);

}
