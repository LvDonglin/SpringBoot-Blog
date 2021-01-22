package com.example.springboot_blog.myblog.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: Type
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 20:00
 * @Version: 1.0
 */
@Data
public class Type {
    private Integer id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
