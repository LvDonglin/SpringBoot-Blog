package com.example.springboot_blog.myblog.dao;

import com.example.springboot_blog.myblog.entity.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.dao
 * @ClassName: FriendLinkDao
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/7 10:17
 * @Version: 1.0
 */
@Mapper
@Repository
public interface FriendLinkDao {

    //查询友链管理列表
    List<FriendLink> listFriendLink();

    //新增友链
    int saveFriendLink(FriendLink friendLink);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //根据id查询友链
    FriendLink getFriendLink(Integer id);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Integer id);
}
