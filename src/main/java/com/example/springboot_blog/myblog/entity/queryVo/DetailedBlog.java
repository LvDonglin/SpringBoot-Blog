package com.example.springboot_blog.myblog.entity.queryVo;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity.queryVo
 * @ClassName: DetailedBlog
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/3 15:33
 * @Version: 1.0
 */
@Data
public class DetailedBlog {

    //博客信息
    private Long id;
    private String coverUrl;
    private String flag;
    private String title;
    private String content;
    private Integer views;
    private Integer commentCount;
    private Integer likeCount;
    private Date updateTime;
    private boolean commentable;
    private String nickname;
    private String avatar;
    //分类名称
    private String typeName;
}
