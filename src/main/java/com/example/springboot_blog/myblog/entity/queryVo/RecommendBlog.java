package com.example.springboot_blog.myblog.entity.queryVo;

import lombok.Data;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity.queryVo
 * @ClassName: RecommendBlog
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/3 13:16
 * @Version: 1.0
 */
@Data
public class RecommendBlog {

    private Integer id;
    private String title;
    private String coverUrl;
    private boolean recommend;
}
