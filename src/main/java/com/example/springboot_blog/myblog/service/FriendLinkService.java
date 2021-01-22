package com.example.springboot_blog.myblog.service;

import com.example.springboot_blog.myblog.entity.FriendLink;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service
 * @ClassName: FriendLinkService
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/7 10:23
 * @Version: 1.0
 */
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink();

    //友链新增
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
