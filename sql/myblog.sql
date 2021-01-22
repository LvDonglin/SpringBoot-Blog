/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 80021
Source Host           : 39.98.58.240:3306
Source Database       : myblog

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2021-01-22 14:12:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `user_id` int DEFAULT NULL,
  `author` varchar(255) NOT NULL COMMENT '作者姓名',
  `flag` varchar(255) DEFAULT NULL COMMENT '标记是否原创',
  `title` varchar(255) NOT NULL COMMENT '文章标题',
  `description` text COMMENT '文章描述',
  `cover_url` varchar(255) DEFAULT NULL COMMENT '文章封面图片url',
  `content` text COMMENT '文章内容',
  `update_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创作发布时间',
  `type_id` int DEFAULT NULL,
  `views` int DEFAULT NULL COMMENT '文章浏览量',
  `like_count` int DEFAULT '0',
  `commentable` bit(1) DEFAULT NULL COMMENT '是否开启评论   1：开启评论    0：关闭评论',
  `published` bit(1) DEFAULT NULL COMMENT '是否开启发布',
  `recommend` bit(1) DEFAULT NULL COMMENT '是否推荐：1：推荐   0：不推荐',
  `comment_count` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `blog_id` int DEFAULT NULL COMMENT '博客id',
  `nickname` varchar(255) NOT NULL COMMENT '昵称',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `content` text COMMENT '评论内容',
  `create_time` datetime DEFAULT NULL,
  `admin_comment` bit(1) DEFAULT NULL COMMENT '是否为管理员评论',
  `parent_id` int NOT NULL COMMENT '父级评论id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment_01
-- ----------------------------
DROP TABLE IF EXISTS `comment_01`;
CREATE TABLE `comment_01` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `parent_comment_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for friend_link
-- ----------------------------
DROP TABLE IF EXISTS `friend_link`;
CREATE TABLE `friend_link` (
  `id` int NOT NULL AUTO_INCREMENT,
  `blog_name` varchar(255) DEFAULT NULL,
  `blog_address` varchar(255) DEFAULT NULL,
  `picture_url` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `admin_message` bit(1) DEFAULT NULL,
  `parent_message_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `id` int NOT NULL AUTO_INCREMENT,
  `picture_url` varchar(255) DEFAULT NULL,
  `picture_description` varchar(255) DEFAULT NULL,
  `picture_name` varchar(255) DEFAULT NULL,
  `picture_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_blog
-- ----------------------------
DROP TABLE IF EXISTS `tb_blog`;
CREATE TABLE `tb_blog` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `title` varchar(60) DEFAULT NULL COMMENT '博客标题',
  `author` varchar(60) DEFAULT NULL COMMENT '博客作者',
  `content` mediumtext COMMENT '博客内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `avatar` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` int DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
