package com.example.springboot_blog.myblog.service.Impl;

import com.example.springboot_blog.myblog.dao.PictureDao;
import com.example.springboot_blog.myblog.entity.Picture;
import com.example.springboot_blog.myblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service.Impl
 * @ClassName: PictureServiceImpl
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/3 11:25
 * @Version: 1.0
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;

    @Override
    public List<Picture> listPicture() {
        return pictureDao.listPicture();
    }

    @Override
    public int savePicture(Picture picture) {
        return pictureDao.savePicture(picture);
    }

    @Override
    public Picture getPicture(Integer id) {
        return pictureDao.getPicture(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureDao.updatePicture(picture);
    }

    @Override
    public void deletePicture(Integer id) {
        pictureDao.deletePicture(id);
    }
}
