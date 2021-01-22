package com.example.springboot_blog.myblog.service;

import com.example.springboot_blog.myblog.entity.Picture;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service
 * @ClassName: PictureService
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/3 11:23
 * @Version: 1.0
 */
public interface PictureService {

    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Integer id);

    //编辑修改相册
    int updatePicture(Picture picture);

    //删除照片
    void deletePicture(Integer id);

}