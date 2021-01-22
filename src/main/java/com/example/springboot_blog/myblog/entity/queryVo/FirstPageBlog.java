package com.example.springboot_blog.myblog.entity.queryVo;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 首页博客信息实体类
 * @Date: Created in 9:39 2020/6/19
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
@Data
public class FirstPageBlog {

    //博客信息
    private Integer id;
    private String title;
    private String coverUrl;
    private Integer views;
    private Integer commentCount;
    private Integer likeCount;
    private Date updateTime;
    private Date createTime;
    private String description;


    //分类名称
    private String typeName;

    //用户名
    private String nickname;
    //用户头像
    private String avatar;

}
