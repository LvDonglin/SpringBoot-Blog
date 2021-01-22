package com.example.springboot_blog.myblog.dao;

import com.example.springboot_blog.myblog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 评论持久层接口
 * @Date: Created in 9:21 2020/6/23
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
@Mapper
@Repository
public interface CommentDao {

    //查询父级评论
    List<Comment> findByBlogIdParentIdNull(@Param("blogId") Integer blogId, @Param("blogParentId") Integer blogParentId);

    //查询一级回复
    List<Comment> findByBlogIdParentIdNotNull(@Param("blogId") Integer blogId, @Param("id") Integer id);

    //查询二级回复
    List<Comment> findByBlogIdAndReplayId(@Param("blogId") Integer blogId,@Param("childId") Integer childId);

    //添加一个评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Integer id);

}
