package com.example.springboot_blog.myblog.service.Impl;

import com.example.springboot_blog.myblog.dao.BlogDao;
import com.example.springboot_blog.myblog.entity.Blog;
import com.example.springboot_blog.myblog.entity.queryVo.*;
import com.example.springboot_blog.myblog.hander.NotFoundException;
import com.example.springboot_blog.myblog.service.BlogService;
import com.example.springboot_blog.myblog.util.MarkdownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service.Impl
 * @ClassName: BlogServiceImp
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/1 10:17
 * @Version: 1.0
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public int saveBlog(Blog blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        return blogDao.saveBlog(blog);
    }

    @Override
    public List<BlogQuery> getAllBlog() {
        return blogDao.getAllBlogQuery();
    }

    //删除博客
    @Override
    public void deleteBlog(Integer id) {
        blogDao.deleteBlog(id);
    }

    //查询编辑修改的文章
    @Override
    public ShowBlog getBlogById(Integer id) {
        return blogDao.getBlogById(id);
    }

    //编辑修改文章
    @Override
    public int updateBlog(ShowBlog showBlog) {
        showBlog.setUpdateTime(new Date());
        return blogDao.updateBlog(showBlog);
    }

    //搜索博客管理列表
    @Override
    public List<BlogQuery> getBlogBySearch(SearchBlog searchBlog) {
        return blogDao.searchByTitleAndType(searchBlog);
    }




    //查询首页最新博客列表信息
    @Override
    public List<FirstPageBlog> getAllFirstPageBlog() {
        return blogDao.getFirstPageBlog();
    }

    //查询首页最新推荐信息
    @Override
    public List<RecommendBlog> getRecommendedBlog() {
        List<RecommendBlog> allRecommendBlog = blogDao.getAllRecommendBlog();
        return allRecommendBlog;
    }

    //搜索博客列表
    @Override
    public List<FirstPageBlog> getSearchBlog(String query) {
        return blogDao.getSearchBlog(query);
    }

    //统计博客总数
    @Override
    public Integer getBlogTotal() {
        return blogDao.getBlogTotal();
    }

    //统计访问总数
    @Override
    public Integer getBlogViewTotal() {
        return blogDao.getBlogViewTotal();
    }

    //统计评论总数
    @Override
    public Integer getBlogCommentTotal() {
        return blogDao.getBlogCommentTotal();
    }

    @Override
    public int updateLikeCount(Integer id) {
        return blogDao.updateLikeCount(id);
    }

    //统计留言总数
    @Override
    public Integer getBlogMessageTotal() {
        return blogDao.getBlogMessageTotal();
    }

    @Override
    public DetailedBlog getDetailedBlog(Integer id) {
        DetailedBlog detailedBlog = blogDao.getDetailedBlog(id);
        if (detailedBlog == null) {
            throw new NotFoundException("该博客不存在");
        }
        String content = detailedBlog.getContent();
        detailedBlog.setContent(MarkdownUtils.markdownToHtmlExtensions(content));
        //文章访问数量自增
        blogDao.updateViews(id);
        //文章评论数量更新
        blogDao.getCommentCountById(id);
        return detailedBlog;
    }

    //分类页面查询
    @Override
    public List<FirstPageBlog> getByTypeId(Integer typeId) {
        return blogDao.getByTypeId(typeId);
    }

}
