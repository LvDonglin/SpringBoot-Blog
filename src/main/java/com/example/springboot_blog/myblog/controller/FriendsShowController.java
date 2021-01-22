package com.example.springboot_blog.myblog.controller;

import com.example.springboot_blog.myblog.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.controller
 * @ClassName: FriendsShowController
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/7 12:24
 * @Version: 1.0
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) {
        model.addAttribute("friendlinks",friendLinkService.listFriendLink());
        return "friends";
    }

}