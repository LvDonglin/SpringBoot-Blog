package com.example.springboot_blog.myblog.dao;

import com.example.springboot_blog.myblog.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.dao
 * @ClassName: MessageDao
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/4 20:11
 * @Version: 1.0
 */
@Mapper
@Repository
public interface MessageDao {

    //添加一个评论
    int saveMessage(Message message);

    //查询父级评论
    List<Message> findByParentIdNull(@Param("ParentId") Integer ParentId);

    //查询一级回复
    List<Message> findByParentIdNotNull(@Param("id") Integer id);

    //查询二级以及所有子集回复
    List<Message> findByReplayId(@Param("childId") Integer childId);

    //删除评论
    void deleteMessage(Integer id);

}
