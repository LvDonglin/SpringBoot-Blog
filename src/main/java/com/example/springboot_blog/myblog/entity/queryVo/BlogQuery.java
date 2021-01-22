package com.example.springboot_blog.myblog.entity.queryVo;

import com.example.springboot_blog.myblog.entity.Type;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: BlogQuery
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/1 10:20
 * @Version: 1.0
 */
@Data
public class BlogQuery {

    private Integer id;
    private String flag;
    private String title;
    private Date updateTime;
    private Boolean published;
    private Integer typeId;
    private Type type;
}
