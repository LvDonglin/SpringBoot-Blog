package com.example.springboot_blog.myblog.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: Blog
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 19:31
 * @Version: 1.0
 */
@Data
public class Blog {

    private Integer id;

    private  String author;

    private String title;

    private Integer commentCount;

    //标记是否原创
    private String flag;

    private String content;

    private String description;

    private String coverUrl;

    private Date createTime;

    private Date updateTime;

    private Integer views;

    private Integer likeCount;

    private boolean commentable;

    private boolean published;

    private boolean recommend;


    private Type type;
    private User user;
    private Integer typeId;
    private Integer userId;
    private List<Comment> comments = new ArrayList<>();
}
