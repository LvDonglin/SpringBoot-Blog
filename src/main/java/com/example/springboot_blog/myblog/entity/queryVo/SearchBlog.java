package com.example.springboot_blog.myblog.entity.queryVo;

import lombok.Data;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity.queryVo
 * @ClassName: SearchBlog
 * @Author: 吕东霖
 * @Description: 搜索博客管理列表
 * @Date: 2020/12/2 21:33
 * @Version: 1.0
 */
@Data
public class SearchBlog {

    private String title;
    private Integer typeId;

}
