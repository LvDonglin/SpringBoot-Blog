package com.example.springboot_blog.myblog.service.Impl;

import com.example.springboot_blog.myblog.dao.TypeDao;
import com.example.springboot_blog.myblog.entity.Type;
import com.example.springboot_blog.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.service.Impl
 * @ClassName: TypeServiceImpl
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 20:13
 * @Version: 1.0
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Transactional
    @Override
    public int saveType(Type type) {
        return typeDao.saveType(type);
    }

    @Transactional
    @Override
    public Type getType(Integer id) {
        return typeDao.getType(id);
    }

    @Transactional
    @Override
    public List<Type> getAllType() {
        return typeDao.getAllType();
    }

    @Override
    public Type getTypeByName(String name) {
        return typeDao.getTypeByName(name);
    }

    @Transactional
    @Override
    public int updateType(Type type) {
        return typeDao.updateType(type);
    }

    @Transactional
    @Override
    public void deleteType(Integer id) {
        typeDao.deleteType(id);
    }

    @Transactional
    @Override
    public List<Type> getAllTypeAndBlog() {
        return typeDao.getAllTypeAndBlog();
    }
}
