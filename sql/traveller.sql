/*
Navicat MySQL Data Transfer

Source Server         : LocalHost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : happycardata

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-09-24 01:38:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for v_comments
-- ----------------------------
DROP TABLE IF EXISTS `v_comments`;
CREATE TABLE `v_comments` (
`id`  int(10) NOT NULL AUTO_INCREMENT ,
`author`  int(10) NULL DEFAULT NULL ,
`content`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL ,
`postdate`  datetime NULL DEFAULT NULL ,
`scenceid`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='针对scence的短评留言'
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of v_comments
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for v_country
-- ----------------------------
DROP TABLE IF EXISTS `v_country`;
CREATE TABLE `v_country` (
`id`  smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT ,
`name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`flag`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`updatetime`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of v_country
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for v_essays
-- ----------------------------
DROP TABLE IF EXISTS `v_essays`;
CREATE TABLE `v_essays` (
`id`  int(10) NOT NULL AUTO_INCREMENT ,
`author`  int(10) NULL DEFAULT NULL ,
`content`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL ,
`postdate`  datetime NULL DEFAULT NULL ,
`scenceid`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='针对scence的唱片介绍、游记'
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of v_essays
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for v_images
-- ----------------------------
DROP TABLE IF EXISTS `v_images`;
CREATE TABLE `v_images` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`poster`  int(11) NULL DEFAULT NULL ,
`scenceid`  int(11) NULL DEFAULT NULL ,
`info`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '简介' ,
`updatedate`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='针对scence的图片资源'
AUTO_INCREMENT=27

;

-- ----------------------------
-- Records of v_images
-- ----------------------------
BEGIN;
INSERT INTO `v_images` VALUES ('1', '11.jpg', '1', '1', null, '2015-09-16 22:45:43'), ('2', '12.jpg', '1', '1', null, '2015-09-16 22:45:43'), ('3', '13.jpg', '1', '1', null, '2015-09-16 22:45:43'), ('4', '21.jpg', '1', '2', null, '2015-09-16 22:45:43'), ('5', '22.jpg', '1', '2', null, '2015-09-16 22:45:43'), ('6', '23.jpg', '1', '2', null, '2015-09-16 22:45:43'), ('7', '31.jpg', '1', '3', null, '2015-09-16 22:45:43'), ('8', '71.jpg', '1', '7', null, '2015-09-16 22:45:43'), ('9', '72.jpg', '1', '7', null, '2015-09-16 22:45:43'), ('10', '73.jpg', '1', '7', null, '2015-09-16 22:45:43'), ('11', '131.jpg', '1', '13', null, '2015-09-16 22:45:43'), ('12', '132.jpg', '1', '13', null, '2015-09-16 22:45:43'), ('13', '133.jpg', '1', '13', null, '2015-09-16 22:45:43'), ('14', '171.jpg', '1', '17', null, '2015-09-16 22:45:43'), ('15', '172.jpg', '1', '17', null, '2015-09-16 22:45:43'), ('16', '173.jpg', '1', '17', null, '2015-09-16 22:45:43'), ('17', '32.jpg', '1', '3', null, '2015-09-16 22:45:43'), ('18', '33.jpg', '1', '3', null, '2015-09-16 22:45:43'), ('19', '33.jpg', '1', '4', '', '2015-09-16 22:45:43'), ('20', '33.jpg', '1', '5', '', '2015-09-16 22:45:43'), ('21', '33.jpg', '1', '6', '', '2015-09-16 22:45:43'), ('22', '131.jpg', '1', '8', '', '2015-09-16 22:45:43'), ('23', '131.jpg', '1', '9', '', '2015-09-16 22:45:43'), ('24', '131.jpg', '1', '10', '', '2015-09-16 22:45:43'), ('25', '22.jpg', '1', '11', '', '2015-09-16 22:45:43'), ('26', '22.jpg', '1', '12', '', '2015-09-16 22:45:43');
COMMIT;

-- ----------------------------
-- Table structure for v_scences
-- ----------------------------
DROP TABLE IF EXISTS `v_scences`;
CREATE TABLE `v_scences` (
`id`  int(10) NOT NULL AUTO_INCREMENT ,
`name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`address`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`hearts`  int(8) NULL DEFAULT 0 COMMENT '热度、点赞' ,
`country`  smallint(5) NOT NULL ,
`info`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL ,
`regdate`  datetime NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=18

;

-- ----------------------------
-- Records of v_scences
-- ----------------------------
BEGIN;
INSERT INTO `v_scences` VALUES ('1', '日月潭', '中国台湾', '0', '12', '<p>Aliquam ante ipsum, maximus in orci ut, blandit aliquam ipsum. Phasellus sed tortor non magna lobortis faucibus. Mauris pharetra convallis urna, eu porttitor velit pretium eget. Vestibulum vehicula quis felis eget imperdiet. Sed vulputate tincidunt facilisis. Morbi eu suscipit dolor. Quisque nec turpis quis ante gravida placerat non at turpis. Phasellus tincidunt nisi eget posuere porta.</p><br>\r\n				<span class=\"single-page-quote single-page-quote-left\">\r\n					<p>Lorem ipsum dolor sit,\r\n						<br>\r\n					consectetur adipiscing elit.</p>\r\n				</span>\r\n				<div class=\"clear-right\">\r\n					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In risus neque, semper sed congue eget, ultricies et tortor. Duis lorem libero, dapibus lacinia tellus id, pulvinar rutrum diam. Cras tempor lectus quis erat facilisis, a commodo mi volutpat. Sed vitae libero libero. Vestibulum non leo lobortis, placerat est a, laoreet mauris. Aenean vitae erat interdum, dignissim tellus quis, pellentesque libero. Nullam feugiat magna non justo sodales mattis. Phasellus mattis velit justo, non hendrerit felis tincidunt vitae. In at mi finibus, finibus sem dictum, convallis libero. In condimentum euismod nunc id dapibus. Praesent sagittis posuere felis et viverra. Mauris eros dui, malesuada nec risus nec, placerat porta sem. Suspendisse id quam in ante lobortis fringilla. Aenean euismod ante eget auctor fringilla. Morbi consequat ut felis a scelerisque. Aliquam purus sem, rutrum sit amet ligula a, tristique porttitor mauris.</p><br>\r\n				</div>\r\n				<p>Cras sit amet mi eros. Pellentesque auctor, massa at laoreet lobortis, mi lorem commodo enim, non mollis arcu erat ac augue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris maximus enim in mauris ornare bibendum. Cras bibendum, nibh non interdum lacinia, sem augue convallis nibh, sit amet eleifend lacus felis quis turpis. Suspendisse potenti.</p><br>\r\n				<div class=\"clear-both\">\r\n					<img class=\"blog-grid-img-v1\" src=\"http://htmlstream.com/preview/unify-v1.8/Blog/assets/img/masonry/img2.jpg\" alt=\"\">\r\n					<p>Proin laoreet massa vitae pulvinar accumsan. Aenean auctor ipsum mauris, et sodales odio tristique non. Quisque eget diam a mi condimentum ullamcorper imperdiet sed urna. Pellentesque cursus convallis blandit. Mauris lorem eros, consequat et rutrum id, vestibulum quis felis. Proin non mollis eros. Curabitur vel laoreet mauris.</p><br>\r\n				</div>', '2015-09-12 22:44:13'), ('2', '五台山', '中国陕西', '0', '1', '顺治出家之谜', '2015-09-10 22:44:20'), ('3', '黄山', '中国安徽', '0', '1', '一生痴绝处，无梦到徽州', '2015-09-09 22:44:26'), ('4', '杭州西湖', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('5', '嵩山', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('6', '泰山', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('7', '桂林山水', '中国贵州', '0', '4', '桂林山水甲天下', '2015-09-10 22:44:32'), ('8', '衡山', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('9', '恒山', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('10', '玄武湖', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('11', '华山', '中国浙江', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('12', '鼓浪屿', '中国福建厦门', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45'), ('13', '龙虎山', '中国江西', '0', '6', '道教祖庭', '2015-09-01 22:44:39'), ('17', '宏村', '中国安徽', '0', '7', '那杭州美景盖世无双，西湖岸奇花异草四季清香，那春游苏堤桃红柳绿 夏赏荷花映满了池塘，那秋观明月如同碧水，冬看瑞雪铺满了山岗', '2015-09-11 22:44:45');
COMMIT;

-- ----------------------------
-- Table structure for v_users
-- ----------------------------
DROP TABLE IF EXISTS `v_users`;
CREATE TABLE `v_users` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`nickname`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' ,
`name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`email`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`phone`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`picture`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`password`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`birthdate`  date NULL DEFAULT NULL ,
`enabled`  bit(1) NULL DEFAULT NULL ,
`info`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL ,
`country`  int(255) NULL DEFAULT NULL COMMENT '所属国家' ,
`regdate`  datetime(6) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=13

;

-- ----------------------------
-- Records of v_users
-- ----------------------------
BEGIN;
INSERT INTO `v_users` VALUES ('1', 'Steve', 'JOBS', 'stive.jobs@apple.com', '0033 1 23 45 67 89', '1.jpg', 'steve', null, '', null, '0', null), ('2', 'Bill', 'GATES', 'bill.gates@microsoft.com', '0033 1 23 45 67 89', '2.jpg', 'bill', null, '', null, '0', null), ('3', 'Mark', 'ZUCKERBERG', 'mark.zuckerberg@facebook.com', '0033 1 23 45 67 89', '3.jpg', 'zuckerberg', null, '', null, '0', null), ('4', 'Tim', 'COOK', 'tim.cook@apple.com', '0033 1 23 45 67 89', '4.jpg', 'cook', null, '', null, '0', null), ('5', 'Larry', 'Page', 'larry.page@gmail.com', '0033 1 23 45 67 89', '5.jpg', 'page', null, '', null, '0', null), ('6', 'Sergey', 'Brin', 'sergey.brin@gmail.com', '0033 1 23 45 67 89', '6.jpg', 'brin', null, '', null, '0', null), ('7', 'Larry', 'ELLISON', 'larry.ellison@oracle.com', '0033 1 23 45 67 89', '7.jpg', 'ellison', null, '', null, '0', null), ('8', 'Jeff', 'BEZOS', 'jeff.bezos@amazon.com', '0033 1 23 45 67 89', '8.jpg', 'bezos', null, '', null, '0', null), ('9', 'Paul', 'ALLEN', 'paul.allen@microsoft.com', '0033 1 23 45 67 89', '9.jpg', 'allen', null, '', null, '0', null), ('10', 'Steve', 'BALLMER', 'steve.ballmer@microsoft.com', '0033 1 23 45 67 89', '10.jpg', 'ballmer', null, '', null, '0', null), ('11', 'Jack', 'DORSEY', 'jack.dorsey@twitter.com', '0033 1 23 45 67 89', '11.jpg', 'dorsey', null, '', null, '0', null), ('12', 'Matt', 'MULLENWEG', 'matt.mullenweg@wordpress.com', '0033 1 23 45 67 89', '12.jpg', 'mullenweg', null, '', null, '0', null);
COMMIT;

-- ----------------------------
-- Auto increment value for v_comments
-- ----------------------------
ALTER TABLE `v_comments` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for v_country
-- ----------------------------
ALTER TABLE `v_country` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for v_essays
-- ----------------------------
ALTER TABLE `v_essays` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for v_images
-- ----------------------------
ALTER TABLE `v_images` AUTO_INCREMENT=27;

-- ----------------------------
-- Auto increment value for v_scences
-- ----------------------------
ALTER TABLE `v_scences` AUTO_INCREMENT=18;

-- ----------------------------
-- Auto increment value for v_users
-- ----------------------------
ALTER TABLE `v_users` AUTO_INCREMENT=13;
