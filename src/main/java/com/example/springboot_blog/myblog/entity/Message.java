package com.example.springboot_blog.myblog.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: 留言实体类
 * @Author: ONESTAR
 * @Date: Created in 9:26 2020/3/26
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
@Data
public class Message {

    private Integer id;

    private String nickname;

    private String email;

    private String avatar;

    private String content;

    private Integer parentMessageId;

    private Date createTime;

    private boolean adminMessage;

    //回复评论
    private List<Message> replyMessages = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;
}
