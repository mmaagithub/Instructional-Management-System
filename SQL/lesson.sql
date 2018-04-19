/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : xscjgl2

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-19 14:45:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for lesson
-- ----------------------------
DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson` (
  `lesson_id` int(4) NOT NULL,
  `lesson_name` varchar(8) DEFAULT NULL,
  `teach_id` int(11) DEFAULT NULL,
  `teach_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`lesson_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
