package com.example.springboot_blog.myblog.service;

import com.example.springboot_blog.myblog.entity.Type;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service
 * @ClassName: TypeService
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 20:12
 * @Version: 1.0
 */
public interface TypeService {

    //新增保存分类
    int saveType(Type type);

    //根据id查询分类
    Type getType(Integer id);

    //查询所有分类
    List<Type> getAllType();

    //根据分类名称查询分类
    Type getTypeByName(String name);

    //编辑修改分类
    int updateType(Type type);

    //删除分类
    void deleteType(Integer id);

    //查询所有分类
    List<Type>getAllTypeAndBlog();
}
