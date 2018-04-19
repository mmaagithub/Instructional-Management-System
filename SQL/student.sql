/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : xscjgl2

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-19 14:45:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` int(8) NOT NULL,
  `stu_password` varchar(15) DEFAULT NULL,
  `stu_name` varchar(15) DEFAULT NULL,
  `stu_age` varchar(5) DEFAULT NULL,
  `stu_sex` varchar(5) DEFAULT NULL,
  `stu_tel` varchar(8) DEFAULT NULL,
  `stu_class` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
