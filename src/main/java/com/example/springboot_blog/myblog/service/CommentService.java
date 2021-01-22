package com.example.springboot_blog.myblog.service;

import com.example.springboot_blog.myblog.entity.Comment;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service
 * @ClassName: CommentService
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/3 16:16
 * @Version: 1.0
 */
public interface CommentService {

    //根据博客id查询评论信息
    List<Comment> listCommentByBlogId(Integer blogId);

    //添加保存评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Comment comment,Integer id);
}
