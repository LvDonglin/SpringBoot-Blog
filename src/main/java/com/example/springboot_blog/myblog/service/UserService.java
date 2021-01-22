package com.example.springboot_blog.myblog.service;

import com.example.springboot_blog.myblog.entity.User;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service
 * @ClassName: UserService
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 10:46
 * @Version: 1.0
 */
public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
