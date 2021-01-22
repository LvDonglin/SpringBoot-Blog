package com.example.springboot_blog.myblog.entity.queryVo;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity.queryVo
 * @ClassName: ShowBlog
 * @Author: 吕东霖
 * @Description: 编辑修改文章实体类
 * @Date: 2020/12/2 21:15
 * @Version: 1.0
 */
@Data
public class ShowBlog {

    private Integer id;

    private String flag;

    private String title;

    private String content;

    private Long typeId;

    private String coverUrl;

    private String description;

    private boolean published;

    private boolean commentable;

    private boolean recommend;

    private Date updateTime;
}
