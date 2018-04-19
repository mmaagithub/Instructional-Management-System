/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : xscjgl2

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-19 14:45:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tea_id` int(8) NOT NULL,
  `tea_password` varchar(15) DEFAULT NULL,
  `tea_name` varchar(15) DEFAULT NULL,
  `tea_age` int(2) DEFAULT NULL,
  `tea_sex` varchar(5) DEFAULT NULL,
  `tea_type` varchar(8) DEFAULT NULL,
  `tea_tel` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
