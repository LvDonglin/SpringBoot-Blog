package com.example.springboot_blog.myblog.entity;

import lombok.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.entity
 * @ClassName: Comment
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 19:36
 * @Version: 1.0
 */
@Data
public class Comment {

    private Integer id;

    private Integer blogId;

    private String nickname;

    private String email;

    private String avatar;

    private String content;

    private Integer parentId;

    private Date createTime;

    private boolean adminComment;

    //回复评论
    private List<Comment> replyComments = new ArrayList<>();
    private Comment parentComment;
    private String parentNickname;
}
