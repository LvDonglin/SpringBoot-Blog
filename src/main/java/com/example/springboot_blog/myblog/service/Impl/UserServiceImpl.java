package com.example.springboot_blog.myblog.service.Impl;

import com.example.springboot_blog.myblog.dao.UserDao;
import com.example.springboot_blog.myblog.entity.User;
import com.example.springboot_blog.myblog.service.UserService;
import com.example.springboot_blog.myblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service.Impl
 * @ClassName: UserServiceImpl
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 10:47
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
