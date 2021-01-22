package com.example.springboot_blog.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: User
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 10:31
 * @Version: 1.0
 */
@Data
public class User {
    private Integer id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    private Date createTime;
    private Date updateTime;
}
