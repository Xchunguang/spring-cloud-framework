/*
Navicat MySQL Data Transfer

Source Server         : 47.94.217.138
Source Server Version : 50719
Source Host           : 47.94.217.138:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-01-06 13:38:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `useraccount` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `balance` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xcg', 'xcg', 'xcg', '1');
INSERT INTO `user` VALUES ('2', '123', '123', '123', '123');
INSERT INTO `user` VALUES ('3', '456', '456', '456', '456');
