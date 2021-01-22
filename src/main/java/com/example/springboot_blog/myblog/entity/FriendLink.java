package com.example.springboot_blog.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: FriendLink
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/7 10:13
 * @Version: 1.0
 */
@Data
public class FriendLink {

    private Integer id;
    private String blogName;
    private String blogAddress;
    private String pictureUrl;
    private Date createTime;
}
