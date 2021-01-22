package com.example.springboot_blog.myblog.service.Impl;

import com.example.springboot_blog.myblog.dao.FriendLinkDao;
import com.example.springboot_blog.myblog.entity.FriendLink;
import com.example.springboot_blog.myblog.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service.Impl
 * @ClassName: FriendLinkServiceImpl
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/7 10:24
 * @Version: 1.0
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService {

    @Autowired
    private FriendLinkDao friendLinkDao;

    @Override
    public List<FriendLink> listFriendLink() {
        return friendLinkDao.listFriendLink();
    }

    @Override
    public int saveFriendLink(FriendLink friendLink) {
        return friendLinkDao.saveFriendLink(friendLink);
    }

    @Override
    public FriendLink getFriendLinkByBlogaddress(String blogaddress) {
        return friendLinkDao.getFriendLinkByBlogaddress(blogaddress);
    }

    @Override
    public FriendLink getFriendLink(Integer id) {
        return friendLinkDao.getFriendLink(id);
    }

    @Override
    public int updateFriendLink(FriendLink friendLink) {
        return friendLinkDao.updateFriendLink(friendLink);
    }

    @Override
    public void deleteFriendLink(Integer id) {
        friendLinkDao.deleteFriendLink(id);
    }
}