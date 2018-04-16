/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : db_exam

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2018-04-16 21:48:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_exam_answer
-- ----------------------------
DROP TABLE IF EXISTS `tbl_exam_answer`;
CREATE TABLE `tbl_exam_answer` (
  `id` varchar(40) NOT NULL COMMENT '关联id',
  `uuid` varchar(40) NOT NULL COMMENT '唯一标识',
  `exam_answer` varchar(4000) NOT NULL COMMENT '答案',
  `exam_msg` varchar(4000) NOT NULL COMMENT '答案解析',
  `select_number` tinyint(4) NOT NULL COMMENT '选择次数',
  `create_time` date NOT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  `create_user_id` varchar(40) NOT NULL COMMENT '创建用户id',
  `update_user_id` varchar(40) DEFAULT NULL COMMENT '更新用户id',
  `state` varchar(2) NOT NULL COMMENT '删除状态',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `select_number` (`select_number`),
  KEY `state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_exam_answer
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `tbl_exam_info`;
CREATE TABLE `tbl_exam_info` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '试题iD',
  `uuid` varchar(40) NOT NULL COMMENT '唯一标识',
  `separate_id` varchar(40) NOT NULL COMMENT '分表id',
  `exam_question` varchar(4000) NOT NULL COMMENT '问题题目',
  `exam_level` tinyint(3) unsigned NOT NULL COMMENT '难度等级',
  `exam_type` varchar(40) NOT NULL COMMENT '试题类型',
  `exam_answer_id` varchar(40) NOT NULL COMMENT '试题答案对应iD',
  `exam_true` varchar(40) NOT NULL COMMENT '正确答案id',
  `exam_score` tinyint(4) NOT NULL COMMENT '这题分数',
  `exam_use_num` tinyint(4) NOT NULL COMMENT '使用次数吧',
  `create_time` date NOT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  `create_user_id` varchar(40) NOT NULL COMMENT '创建用户id',
  `update_user_id` varchar(40) DEFAULT NULL COMMENT '更新用户id',
  `state` varchar(2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `separate_id` (`separate_id`),
  KEY `exam_level` (`exam_level`),
  KEY `exam_answer_id` (`exam_answer_id`),
  KEY `exam_true` (`exam_true`),
  KEY `exam_score` (`exam_score`),
  KEY `state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_exam_info
-- ----------------------------
