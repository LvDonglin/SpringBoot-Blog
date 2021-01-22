package com.example.springboot_blog.myblog.dao;

import com.example.springboot_blog.myblog.entity.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.dao
 * @ClassName: PictureDao
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/12/3 11:06
 * @Version: 1.0
 */
@Mapper
@Repository
public interface PictureDao {

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
