package com.example.springboot_blog.myblog.entity;

import lombok.Data;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: Picture
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 19:41
 * @Version: 1.0
 */
@Data
public class Picture {

    private Integer id;

    private String pictureUrl;

    private String pictureDescription;

    private String pictureName;

    private String pictureTime;
}
