-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm2i051
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssm2i051`
--

/*!40000 DROP DATABASE IF EXISTS `ssm2i051`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm2i051` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm2i051`;

--
-- Table structure for table `aixinrenshi`
--

DROP TABLE IF EXISTS `aixinrenshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aixinrenshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `touxiang` longtext COMMENT '头像',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1672389528034 DEFAULT CHARSET=utf8 COMMENT='爱心人士';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aixinrenshi`
--

LOCK TABLES `aixinrenshi` WRITE;
/*!40000 ALTER TABLE `aixinrenshi` DISABLE KEYS */;
INSERT INTO `aixinrenshi` VALUES (11,'2022-12-30 08:33:01','账号1','123456','姓名1','男',1,'upload/aixinrenshi_touxiang1.jpg','13823888881'),(12,'2022-12-30 08:33:01','账号2','123456','姓名2','男',2,'upload/aixinrenshi_touxiang2.jpg','13823888882'),(13,'2022-12-30 08:33:01','账号3','123456','姓名3','男',3,'upload/aixinrenshi_touxiang3.jpg','13823888883'),(14,'2022-12-30 08:33:01','账号4','123456','姓名4','男',4,'upload/aixinrenshi_touxiang4.jpg','13823888884'),(15,'2022-12-30 08:33:01','账号5','123456','姓名5','男',5,'upload/aixinrenshi_touxiang5.jpg','13823888885'),(16,'2022-12-30 08:33:01','账号6','123456','姓名6','男',6,'upload/aixinrenshi_touxiang6.jpg','13823888886'),(17,'2022-12-30 08:33:01','账号7','123456','姓名7','男',7,'upload/aixinrenshi_touxiang7.jpg','13823888887'),(18,'2022-12-30 08:33:01','账号8','123456','姓名8','男',8,'upload/aixinrenshi_touxiang8.jpg','13823888888'),(1672389528033,'2022-12-30 08:38:48','11','11','陈雨','女',32,'upload/1672389606166.jpg','13613613688');
/*!40000 ALTER TABLE `aixinrenshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baoxiushenqing`
--

DROP TABLE IF EXISTS `baoxiushenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baoxiushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `loudongmingcheng` varchar(200) DEFAULT NULL COMMENT '楼栋名称',
  `sushemingcheng` varchar(200) DEFAULT NULL COMMENT '宿舍名称',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `baoxiuyuanyin` longtext COMMENT '报修原因',
  `houqingonghao` varchar(200) DEFAULT NULL COMMENT '后勤工号',
  `houqinxingming` varchar(200) DEFAULT NULL COMMENT '后勤姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `baoxiushijian` date DEFAULT NULL COMMENT '报修时间',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391551664 DEFAULT CHARSET=utf8 COMMENT='报修申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baoxiushenqing`
--

LOCK TABLES `baoxiushenqing` WRITE;
/*!40000 ALTER TABLE `baoxiushenqing` DISABLE KEYS */;
INSERT INTO `baoxiushenqing` VALUES (181,'2022-12-30 08:33:02','楼栋名称1','宿舍名称1','物品名称1','报修原因1','后勤工号1','后勤姓名1','手机1','2022-12-30','是',''),(182,'2022-12-30 08:33:02','楼栋名称2','宿舍名称2','物品名称2','报修原因2','后勤工号2','后勤姓名2','手机2','2022-12-30','是',''),(183,'2022-12-30 08:33:02','楼栋名称3','宿舍名称3','物品名称3','报修原因3','后勤工号3','后勤姓名3','手机3','2022-12-30','是',''),(184,'2022-12-30 08:33:02','楼栋名称4','宿舍名称4','物品名称4','报修原因4','后勤工号4','后勤姓名4','手机4','2022-12-30','是',''),(185,'2022-12-30 08:33:02','楼栋名称5','宿舍名称5','物品名称5','报修原因5','后勤工号5','后勤姓名5','手机5','2022-12-30','是',''),(186,'2022-12-30 08:33:02','楼栋名称6','宿舍名称6','物品名称6','报修原因6','后勤工号6','后勤姓名6','手机6','2022-12-30','是',''),(187,'2022-12-30 08:33:02','楼栋名称7','宿舍名称7','物品名称7','报修原因7','后勤工号7','后勤姓名7','手机7','2022-12-30','是',''),(188,'2022-12-30 08:33:02','楼栋名称8','宿舍名称8','物品名称8','报修原因8','后勤工号8','后勤姓名8','手机8','2022-12-30','是',''),(1672391551663,'2022-12-30 09:12:31','芳草地','清清宿舍','物品名称','报修原因','33','张永','13513513579','2022-12-30','是','回复内容');
/*!40000 ALTER TABLE `baoxiushenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baoxiuzhuangtai`
--

DROP TABLE IF EXISTS `baoxiuzhuangtai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baoxiuzhuangtai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `loudongmingcheng` varchar(200) DEFAULT NULL COMMENT '楼栋名称',
  `sushemingcheng` varchar(200) DEFAULT NULL COMMENT '宿舍名称',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `weixiujincheng` varchar(200) NOT NULL COMMENT '维修进程',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391644259 DEFAULT CHARSET=utf8 COMMENT='报修状态';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baoxiuzhuangtai`
--

LOCK TABLES `baoxiuzhuangtai` WRITE;
/*!40000 ALTER TABLE `baoxiuzhuangtai` DISABLE KEYS */;
INSERT INTO `baoxiuzhuangtai` VALUES (191,'2022-12-30 08:33:02','楼栋名称1','宿舍名称1','物品名称1','维修中'),(192,'2022-12-30 08:33:02','楼栋名称2','宿舍名称2','物品名称2','维修中'),(193,'2022-12-30 08:33:02','楼栋名称3','宿舍名称3','物品名称3','维修中'),(194,'2022-12-30 08:33:02','楼栋名称4','宿舍名称4','物品名称4','维修中'),(195,'2022-12-30 08:33:02','楼栋名称5','宿舍名称5','物品名称5','维修中'),(196,'2022-12-30 08:33:02','楼栋名称6','宿舍名称6','物品名称6','维修中'),(197,'2022-12-30 08:33:02','楼栋名称7','宿舍名称7','物品名称7','维修中'),(198,'2022-12-30 08:33:02','楼栋名称8','宿舍名称8','物品名称8','维修中'),(1672391644258,'2022-12-30 09:14:03','芳草地','清清宿舍','物品名称','已修好');
/*!40000 ALTER TABLE `baoxiuzhuangtai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ertongxinxi`
--

DROP TABLE IF EXISTS `ertongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ertongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ertongxingming` varchar(200) DEFAULT NULL COMMENT '儿童姓名',
  `ertongzhaopian` longtext COMMENT '儿童照片',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `aihao` varchar(200) DEFAULT NULL COMMENT '爱好',
  `ertongziliao` longtext COMMENT '儿童资料',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390246976 DEFAULT CHARSET=utf8 COMMENT='儿童信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ertongxinxi`
--

LOCK TABLES `ertongxinxi` WRITE;
/*!40000 ALTER TABLE `ertongxinxi` DISABLE KEYS */;
INSERT INTO `ertongxinxi` VALUES (41,'2022-12-30 08:33:02','儿童姓名1','upload/ertongxinxi_ertongzhaopian1.jpg,upload/ertongxinxi_ertongzhaopian2.jpg,upload/ertongxinxi_ertongzhaopian3.jpg','女',1,'爱好1','儿童资料1'),(42,'2022-12-30 08:33:02','儿童姓名2','upload/ertongxinxi_ertongzhaopian2.jpg,upload/ertongxinxi_ertongzhaopian3.jpg,upload/ertongxinxi_ertongzhaopian4.jpg','女',2,'爱好2','儿童资料2'),(43,'2022-12-30 08:33:02','儿童姓名3','upload/ertongxinxi_ertongzhaopian3.jpg,upload/ertongxinxi_ertongzhaopian4.jpg,upload/ertongxinxi_ertongzhaopian5.jpg','女',3,'爱好3','儿童资料3'),(44,'2022-12-30 08:33:02','儿童姓名4','upload/ertongxinxi_ertongzhaopian4.jpg,upload/ertongxinxi_ertongzhaopian5.jpg,upload/ertongxinxi_ertongzhaopian6.jpg','女',4,'爱好4','儿童资料4'),(45,'2022-12-30 08:33:02','儿童姓名5','upload/ertongxinxi_ertongzhaopian5.jpg,upload/ertongxinxi_ertongzhaopian6.jpg,upload/ertongxinxi_ertongzhaopian7.jpg','女',5,'爱好5','儿童资料5'),(46,'2022-12-30 08:33:02','儿童姓名6','upload/ertongxinxi_ertongzhaopian6.jpg,upload/ertongxinxi_ertongzhaopian7.jpg,upload/ertongxinxi_ertongzhaopian8.jpg','女',6,'爱好6','儿童资料6'),(47,'2022-12-30 08:33:02','儿童姓名7','upload/ertongxinxi_ertongzhaopian7.jpg,upload/ertongxinxi_ertongzhaopian8.jpg,upload/ertongxinxi_ertongzhaopian9.jpg','女',7,'爱好7','儿童资料7'),(48,'2022-12-30 08:33:02','儿童姓名8','upload/ertongxinxi_ertongzhaopian8.jpg,upload/ertongxinxi_ertongzhaopian9.jpg,upload/ertongxinxi_ertongzhaopian10.jpg','女',8,'爱好8','儿童资料8'),(1672390246975,'2022-12-30 08:50:46','小明','upload/1672390220890.jpg','男',6,'踢足球','<p>儿童资料</p>');
/*!40000 ALTER TABLE `ertongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `houqinrenyuan`
--

DROP TABLE IF EXISTS `houqinrenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `houqinrenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `houqingonghao` varchar(200) NOT NULL COMMENT '后勤工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `houqinxingming` varchar(200) NOT NULL COMMENT '后勤姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhaopian` longtext COMMENT '照片',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `houqingonghao` (`houqingonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391310520 DEFAULT CHARSET=utf8 COMMENT='后勤人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `houqinrenyuan`
--

LOCK TABLES `houqinrenyuan` WRITE;
/*!40000 ALTER TABLE `houqinrenyuan` DISABLE KEYS */;
INSERT INTO `houqinrenyuan` VALUES (31,'2022-12-30 08:33:02','后勤工号1','123456','后勤姓名1','男','upload/houqinrenyuan_zhaopian1.jpg','13823888881'),(32,'2022-12-30 08:33:02','后勤工号2','123456','后勤姓名2','男','upload/houqinrenyuan_zhaopian2.jpg','13823888882'),(33,'2022-12-30 08:33:02','后勤工号3','123456','后勤姓名3','男','upload/houqinrenyuan_zhaopian3.jpg','13823888883'),(34,'2022-12-30 08:33:02','后勤工号4','123456','后勤姓名4','男','upload/houqinrenyuan_zhaopian4.jpg','13823888884'),(35,'2022-12-30 08:33:02','后勤工号5','123456','后勤姓名5','男','upload/houqinrenyuan_zhaopian5.jpg','13823888885'),(36,'2022-12-30 08:33:02','后勤工号6','123456','后勤姓名6','男','upload/houqinrenyuan_zhaopian6.jpg','13823888886'),(37,'2022-12-30 08:33:02','后勤工号7','123456','后勤姓名7','男','upload/houqinrenyuan_zhaopian7.jpg','13823888887'),(38,'2022-12-30 08:33:02','后勤工号8','123456','后勤姓名8','男','upload/houqinrenyuan_zhaopian8.jpg','13823888888'),(1672391310519,'2022-12-30 09:08:30','33','33','张永','男','upload/1672391404564.jpg','13513513579');
/*!40000 ALTER TABLE `houqinrenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huodong`
--

DROP TABLE IF EXISTS `huodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongmingcheng` varchar(200) NOT NULL COMMENT '活动名称',
  `huodongtupian` longtext COMMENT '活动图片',
  `huodongneirong` longtext COMMENT '活动内容',
  `jubanshijian` date NOT NULL COMMENT '举办时间',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390527013 DEFAULT CHARSET=utf8 COMMENT='活动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huodong`
--

LOCK TABLES `huodong` WRITE;
/*!40000 ALTER TABLE `huodong` DISABLE KEYS */;
INSERT INTO `huodong` VALUES (61,'2022-12-30 08:33:02','活动名称1','upload/huodong_huodongtupian1.jpg,upload/huodong_huodongtupian2.jpg,upload/huodong_huodongtupian3.jpg','活动内容1','2022-12-30',1,1),(62,'2022-12-30 08:33:02','活动名称2','upload/huodong_huodongtupian2.jpg,upload/huodong_huodongtupian3.jpg,upload/huodong_huodongtupian4.jpg','活动内容2','2022-12-30',2,2),(63,'2022-12-30 08:33:02','活动名称3','upload/huodong_huodongtupian3.jpg,upload/huodong_huodongtupian4.jpg,upload/huodong_huodongtupian5.jpg','活动内容3','2022-12-30',3,3),(64,'2022-12-30 08:33:02','活动名称4','upload/huodong_huodongtupian4.jpg,upload/huodong_huodongtupian5.jpg,upload/huodong_huodongtupian6.jpg','活动内容4','2022-12-30',4,4),(65,'2022-12-30 08:33:02','活动名称5','upload/huodong_huodongtupian5.jpg,upload/huodong_huodongtupian6.jpg,upload/huodong_huodongtupian7.jpg','活动内容5','2022-12-30',5,5),(66,'2022-12-30 08:33:02','活动名称6','upload/huodong_huodongtupian6.jpg,upload/huodong_huodongtupian7.jpg,upload/huodong_huodongtupian8.jpg','活动内容6','2022-12-30',6,6),(67,'2022-12-30 08:33:02','活动名称7','upload/huodong_huodongtupian7.jpg,upload/huodong_huodongtupian8.jpg,upload/huodong_huodongtupian9.jpg','活动内容7','2022-12-30',7,7),(68,'2022-12-30 08:33:02','活动名称8','upload/huodong_huodongtupian8.jpg,upload/huodong_huodongtupian9.jpg,upload/huodong_huodongtupian10.jpg','活动内容8','2022-12-30',8,8),(1672390527012,'2022-12-30 08:55:26','跳绳比赛','upload/1672390416862.png','<p>我院开展\"阳光点燃生命,运动成就未来\"趣味跳绳比赛</p>','2022-12-31',0,0);
/*!40000 ALTER TABLE `huodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `juanzengxinxi`
--

DROP TABLE IF EXISTS `juanzengxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `juanzengxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `juanzengbianhao` varchar(200) DEFAULT NULL COMMENT '捐赠编号',
  `juanzengmingcheng` varchar(200) NOT NULL COMMENT '捐赠名称',
  `juanzengleixing` varchar(200) DEFAULT NULL COMMENT '捐赠类型',
  `juanzengshuliang` int(11) NOT NULL COMMENT '捐赠数量',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `juanzengshijian` date DEFAULT NULL COMMENT '捐赠时间',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `juanzengbianhao` (`juanzengbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1672389992605 DEFAULT CHARSET=utf8 COMMENT='捐赠信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juanzengxinxi`
--

LOCK TABLES `juanzengxinxi` WRITE;
/*!40000 ALTER TABLE `juanzengxinxi` DISABLE KEYS */;
INSERT INTO `juanzengxinxi` VALUES (141,'2022-12-30 08:33:02','1111111111','捐赠名称1','物资',1,'账号1','姓名1','手机号1','2022-12-30','是',''),(142,'2022-12-30 08:33:02','2222222222','捐赠名称2','物资',2,'账号2','姓名2','手机号2','2022-12-30','是',''),(143,'2022-12-30 08:33:02','3333333333','捐赠名称3','物资',3,'账号3','姓名3','手机号3','2022-12-30','是',''),(144,'2022-12-30 08:33:02','4444444444','捐赠名称4','物资',4,'账号4','姓名4','手机号4','2022-12-30','是',''),(145,'2022-12-30 08:33:02','5555555555','捐赠名称5','物资',5,'账号5','姓名5','手机号5','2022-12-30','是',''),(146,'2022-12-30 08:33:02','6666666666','捐赠名称6','物资',6,'账号6','姓名6','手机号6','2022-12-30','是',''),(147,'2022-12-30 08:33:02','7777777777','捐赠名称7','物资',7,'账号7','姓名7','手机号7','2022-12-30','是',''),(148,'2022-12-30 08:33:02','8888888888','捐赠名称8','物资',8,'账号8','姓名8','手机号8','2022-12-30','是',''),(1672389992604,'2022-12-30 08:46:32','1672389967217','衣服','物资',10,'11','陈雨','13613613688','2022-12-30','是','捐赠物品已收到,感谢您的爱心支持');
/*!40000 ALTER TABLE `juanzengxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lingyanghouxu`
--

DROP TABLE IF EXISTS `lingyanghouxu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lingyanghouxu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `yuangongdianhua` varchar(200) DEFAULT NULL COMMENT '员工电话',
  `duijieriqi` date DEFAULT NULL COMMENT '对接日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391277268 DEFAULT CHARSET=utf8 COMMENT='领养后续';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lingyanghouxu`
--

LOCK TABLES `lingyanghouxu` WRITE;
/*!40000 ALTER TABLE `lingyanghouxu` DISABLE KEYS */;
INSERT INTO `lingyanghouxu` VALUES (211,'2022-12-30 08:33:02','账号1','姓名1','手机号1','员工工号1','员工姓名1','员工电话1','2022-12-30'),(212,'2022-12-30 08:33:02','账号2','姓名2','手机号2','员工工号2','员工姓名2','员工电话2','2022-12-30'),(213,'2022-12-30 08:33:02','账号3','姓名3','手机号3','员工工号3','员工姓名3','员工电话3','2022-12-30'),(214,'2022-12-30 08:33:02','账号4','姓名4','手机号4','员工工号4','员工姓名4','员工电话4','2022-12-30'),(215,'2022-12-30 08:33:02','账号5','姓名5','手机号5','员工工号5','员工姓名5','员工电话5','2022-12-30'),(216,'2022-12-30 08:33:02','账号6','姓名6','手机号6','员工工号6','员工姓名6','员工电话6','2022-12-30'),(217,'2022-12-30 08:33:02','账号7','姓名7','手机号7','员工工号7','员工姓名7','员工电话7','2022-12-30'),(218,'2022-12-30 08:33:02','账号8','姓名8','手机号8','员工工号8','员工姓名8','员工电话8','2022-12-30'),(1672391277267,'2022-12-30 09:07:56','11','陈雨','13613613688','22','李莉','13713713799','2022-12-30');
/*!40000 ALTER TABLE `lingyanghouxu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lingyangliucheng`
--

DROP TABLE IF EXISTS `lingyangliucheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lingyangliucheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shenqing` varchar(200) DEFAULT NULL COMMENT '申请',
  `shencha` varchar(200) DEFAULT NULL COMMENT '审查',
  `dengji` varchar(200) DEFAULT NULL COMMENT '登记',
  `tupian` longtext COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672392331236 DEFAULT CHARSET=utf8 COMMENT='领养流程';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lingyangliucheng`
--

LOCK TABLES `lingyangliucheng` WRITE;
/*!40000 ALTER TABLE `lingyangliucheng` DISABLE KEYS */;
INSERT INTO `lingyangliucheng` VALUES (81,'2022-12-30 08:33:02','申请1','审查1','登记1','upload/lingyangliucheng_tupian1.jpg,upload/lingyangliucheng_tupian2.jpg,upload/lingyangliucheng_tupian3.jpg'),(82,'2022-12-30 08:33:02','申请2','审查2','登记2','upload/lingyangliucheng_tupian2.jpg,upload/lingyangliucheng_tupian3.jpg,upload/lingyangliucheng_tupian4.jpg'),(83,'2022-12-30 08:33:02','申请3','审查3','登记3','upload/lingyangliucheng_tupian3.jpg,upload/lingyangliucheng_tupian4.jpg,upload/lingyangliucheng_tupian5.jpg'),(84,'2022-12-30 08:33:02','申请4','审查4','登记4','upload/lingyangliucheng_tupian4.jpg,upload/lingyangliucheng_tupian5.jpg,upload/lingyangliucheng_tupian6.jpg'),(85,'2022-12-30 08:33:02','申请5','审查5','登记5','upload/lingyangliucheng_tupian5.jpg,upload/lingyangliucheng_tupian6.jpg,upload/lingyangliucheng_tupian7.jpg'),(86,'2022-12-30 08:33:02','申请6','审查6','登记6','upload/lingyangliucheng_tupian6.jpg,upload/lingyangliucheng_tupian7.jpg,upload/lingyangliucheng_tupian8.jpg'),(87,'2022-12-30 08:33:02','申请7','审查7','登记7','upload/lingyangliucheng_tupian7.jpg,upload/lingyangliucheng_tupian8.jpg,upload/lingyangliucheng_tupian9.jpg'),(88,'2022-12-30 08:33:02','申请8','审查8','登记8','upload/lingyangliucheng_tupian8.jpg,upload/lingyangliucheng_tupian9.jpg,upload/lingyangliucheng_tupian10.jpg'),(1672392331235,'2022-12-30 09:25:30','向领养登记机关提交申请书证件和材料','登记机关受理申请后,对多少人情况驾校全面审查','审查后符合标准的,登记机关在受理登记申请30日内,办理收养登记','upload/1672392326397.jpg');
/*!40000 ALTER TABLE `lingyangliucheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lingyangshenqing`
--

DROP TABLE IF EXISTS `lingyangshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lingyangshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ertongxingming` varchar(200) DEFAULT NULL COMMENT '儿童姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `shenqingfujian` longtext COMMENT '申请附件',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672389750859 DEFAULT CHARSET=utf8 COMMENT='领养申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lingyangshenqing`
--

LOCK TABLES `lingyangshenqing` WRITE;
/*!40000 ALTER TABLE `lingyangshenqing` DISABLE KEYS */;
INSERT INTO `lingyangshenqing` VALUES (121,'2022-12-30 08:33:02','儿童姓名1','性别1','年龄1','','账号1','姓名1','手机号1','2022-12-30','是',''),(122,'2022-12-30 08:33:02','儿童姓名2','性别2','年龄2','','账号2','姓名2','手机号2','2022-12-30','是',''),(123,'2022-12-30 08:33:02','儿童姓名3','性别3','年龄3','','账号3','姓名3','手机号3','2022-12-30','是',''),(124,'2022-12-30 08:33:02','儿童姓名4','性别4','年龄4','','账号4','姓名4','手机号4','2022-12-30','是',''),(125,'2022-12-30 08:33:02','儿童姓名5','性别5','年龄5','','账号5','姓名5','手机号5','2022-12-30','是',''),(126,'2022-12-30 08:33:02','儿童姓名6','性别6','年龄6','','账号6','姓名6','手机号6','2022-12-30','是',''),(127,'2022-12-30 08:33:02','儿童姓名7','性别7','年龄7','','账号7','姓名7','手机号7','2022-12-30','是',''),(128,'2022-12-30 08:33:02','儿童姓名8','性别8','年龄8','','账号8','姓名8','手机号8','2022-12-30','是',''),(1672389750858,'2022-12-30 08:42:30','儿童姓名1','女','1','upload/1672389741720.docx','11','陈雨','13613613688','2022-12-30','是','回复内容');
/*!40000 ALTER TABLE `lingyangshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loudong`
--

DROP TABLE IF EXISTS `loudong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loudong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `loudongmingcheng` varchar(200) NOT NULL COMMENT '楼栋名称',
  `ruzhurenshu` int(11) NOT NULL COMMENT '入住人数',
  `loudongdizhi` varchar(200) DEFAULT NULL COMMENT '楼栋地址',
  `loudongjianjie` longtext COMMENT '楼栋简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390778884 DEFAULT CHARSET=utf8 COMMENT='楼栋';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loudong`
--

LOCK TABLES `loudong` WRITE;
/*!40000 ALTER TABLE `loudong` DISABLE KEYS */;
INSERT INTO `loudong` VALUES (101,'2022-12-30 08:33:02','楼栋名称1',1,'楼栋地址1','楼栋简介1'),(102,'2022-12-30 08:33:02','楼栋名称2',2,'楼栋地址2','楼栋简介2'),(103,'2022-12-30 08:33:02','楼栋名称3',3,'楼栋地址3','楼栋简介3'),(104,'2022-12-30 08:33:02','楼栋名称4',4,'楼栋地址4','楼栋简介4'),(105,'2022-12-30 08:33:02','楼栋名称5',5,'楼栋地址5','楼栋简介5'),(106,'2022-12-30 08:33:02','楼栋名称6',6,'楼栋地址6','楼栋简介6'),(107,'2022-12-30 08:33:02','楼栋名称7',7,'楼栋地址7','楼栋简介7'),(108,'2022-12-30 08:33:02','楼栋名称8',8,'楼栋地址8','楼栋简介8'),(1672390778883,'2022-12-30 08:59:38','芳草地',30,'福利院南','楼栋介绍');
/*!40000 ALTER TABLE `loudong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `content` longtext NOT NULL COMMENT '留言内容',
  `cpicture` longtext COMMENT '留言图片',
  `reply` longtext COMMENT '回复内容',
  `rpicture` longtext COMMENT '回复图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672389803230 DEFAULT CHARSET=utf8 COMMENT='在线留言';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (241,'2022-12-30 08:33:02',1,'用户名1','upload/messages_avatarurl1.jpg','留言内容1','upload/messages_cpicture1.jpg','回复内容1','upload/messages_rpicture1.jpg'),(242,'2022-12-30 08:33:02',2,'用户名2','upload/messages_avatarurl2.jpg','留言内容2','upload/messages_cpicture2.jpg','回复内容2','upload/messages_rpicture2.jpg'),(243,'2022-12-30 08:33:02',3,'用户名3','upload/messages_avatarurl3.jpg','留言内容3','upload/messages_cpicture3.jpg','回复内容3','upload/messages_rpicture3.jpg'),(244,'2022-12-30 08:33:02',4,'用户名4','upload/messages_avatarurl4.jpg','留言内容4','upload/messages_cpicture4.jpg','回复内容4','upload/messages_rpicture4.jpg'),(245,'2022-12-30 08:33:02',5,'用户名5','upload/messages_avatarurl5.jpg','留言内容5','upload/messages_cpicture5.jpg','回复内容5','upload/messages_rpicture5.jpg'),(246,'2022-12-30 08:33:02',6,'用户名6','upload/messages_avatarurl6.jpg','留言内容6','upload/messages_cpicture6.jpg','回复内容6','upload/messages_rpicture6.jpg'),(247,'2022-12-30 08:33:02',7,'用户名7','upload/messages_avatarurl7.jpg','留言内容7','upload/messages_cpicture7.jpg','回复内容7','upload/messages_rpicture7.jpg'),(248,'2022-12-30 08:33:02',8,'用户名8','upload/messages_avatarurl8.jpg','留言内容8','upload/messages_cpicture8.jpg','回复内容8','upload/messages_rpicture8.jpg'),(1672389803229,'2022-12-30 08:43:22',1672389528033,'11','','66666','upload/1672389795103.jpg','已收到','upload/1672392540366.jpg');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` longtext NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672392646750 DEFAULT CHARSET=utf8 COMMENT='公益广告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (231,'2022-12-30 08:33:02','有梦想，就要努力去实现','不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。','upload/news_picture1.jpg','<p>不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?</p><p>你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。其实，我已经厌倦了你这样说说而已的把戏，我觉得就算我告诉你如何去做，你也不会照做，因为你根本什么都不做。</p><p>真正有行动力的人不需要别人告诉他如何做，因为他已经在做了。就算碰到问题，他也会自己想办法，自己动手去解决或者主动寻求可以帮助他的人，而不是等着别人为自己解决问题。</p><p>首先要学习独立思考。花一点时间想一下自己喜欢什么，梦想是什么，不要别人说想环游世界，你就说你的梦想是环游世界。</p><p>很多人说现实束缚了自己，其实在这个世界上，我们一直都可以有很多选择，生活的决定权也—直都在自己手上，只是我们缺乏行动力而已。</p><p>如果你觉得安于现状是你想要的，那选择安于现状就会让你幸福和满足;如果你不甘平庸，选择一条改变、进取和奋斗的道路，在这个追求的过程中，你也一样会感到快乐。所谓的成功，即是按照自己想要的生活方式生活。最糟糕的状态，莫过于当你想要选择一条不甘平庸、改变、进取和奋斗的道路时，却以一种安于现状的方式生活，最后抱怨自己没有得到想要的人生。</p><p>因为喜欢，你不是在苦苦坚持，也因为喜欢，你愿意投入时间、精力，长久以往，获得成功就是自然而然的事情。</p>'),(234,'2022-12-30 08:33:02','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(235,'2022-12-30 08:33:02','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(236,'2022-12-30 08:33:02','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(237,'2022-12-30 08:33:02','Leave未必是一种痛苦','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture7.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(238,'2022-12-30 08:33:02','坚持才会成功','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture8.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(1672392646749,'2022-12-30 09:30:46','爱心公益广告','广告简介','upload/1672392635796.jpg','<p>广告内容</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipu`
--

DROP TABLE IF EXISTS `shipu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shipu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shipumingcheng` varchar(200) NOT NULL COMMENT '食谱名称',
  `shipufengmian` longtext NOT NULL COMMENT '食谱封面',
  `shipujieshao` longtext COMMENT '食谱介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390706778 DEFAULT CHARSET=utf8 COMMENT='食谱';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipu`
--

LOCK TABLES `shipu` WRITE;
/*!40000 ALTER TABLE `shipu` DISABLE KEYS */;
INSERT INTO `shipu` VALUES (71,'2022-12-30 08:33:02','食谱名称1','upload/shipu_shipufengmian1.jpg,upload/shipu_shipufengmian2.jpg,upload/shipu_shipufengmian3.jpg','食谱介绍1'),(72,'2022-12-30 08:33:02','食谱名称2','upload/shipu_shipufengmian2.jpg,upload/shipu_shipufengmian3.jpg,upload/shipu_shipufengmian4.jpg','食谱介绍2'),(73,'2022-12-30 08:33:02','食谱名称3','upload/shipu_shipufengmian3.jpg,upload/shipu_shipufengmian4.jpg,upload/shipu_shipufengmian5.jpg','食谱介绍3'),(74,'2022-12-30 08:33:02','食谱名称4','upload/shipu_shipufengmian4.jpg,upload/shipu_shipufengmian5.jpg,upload/shipu_shipufengmian6.jpg','食谱介绍4'),(75,'2022-12-30 08:33:02','食谱名称5','upload/shipu_shipufengmian5.jpg,upload/shipu_shipufengmian6.jpg,upload/shipu_shipufengmian7.jpg','食谱介绍5'),(76,'2022-12-30 08:33:02','食谱名称6','upload/shipu_shipufengmian6.jpg,upload/shipu_shipufengmian7.jpg,upload/shipu_shipufengmian8.jpg','食谱介绍6'),(77,'2022-12-30 08:33:02','食谱名称7','upload/shipu_shipufengmian7.jpg,upload/shipu_shipufengmian8.jpg,upload/shipu_shipufengmian9.jpg','食谱介绍7'),(78,'2022-12-30 08:33:02','食谱名称8','upload/shipu_shipufengmian8.jpg,upload/shipu_shipufengmian9.jpg,upload/shipu_shipufengmian10.jpg','食谱介绍8'),(1672390706777,'2022-12-30 08:58:26','蔬菜沙拉','upload/1672390697018.webp','食谱介绍');
/*!40000 ALTER TABLE `shipu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672389621864 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1672389621863,'2022-12-30 08:40:21',1672389528033,41,'ertongxinxi','儿童姓名1','upload/ertongxinxi_ertongzhaopian1.jpg','1',NULL,NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushe`
--

DROP TABLE IF EXISTS `sushe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `loudongmingcheng` varchar(200) NOT NULL COMMENT '楼栋名称',
  `susheweizhi` varchar(200) DEFAULT NULL COMMENT '宿舍位置',
  `sushemingcheng` varchar(200) NOT NULL COMMENT '宿舍名称',
  `susherenshu` int(11) NOT NULL COMMENT '宿舍人数',
  `sushepeizhi` longtext COMMENT '宿舍配置',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390849339 DEFAULT CHARSET=utf8 COMMENT='宿舍';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushe`
--

LOCK TABLES `sushe` WRITE;
/*!40000 ALTER TABLE `sushe` DISABLE KEYS */;
INSERT INTO `sushe` VALUES (111,'2022-12-30 08:33:02','楼栋名称1','宿舍位置1','宿舍名称1',1,'宿舍配置1'),(112,'2022-12-30 08:33:02','楼栋名称2','宿舍位置2','宿舍名称2',2,'宿舍配置2'),(113,'2022-12-30 08:33:02','楼栋名称3','宿舍位置3','宿舍名称3',3,'宿舍配置3'),(114,'2022-12-30 08:33:02','楼栋名称4','宿舍位置4','宿舍名称4',4,'宿舍配置4'),(115,'2022-12-30 08:33:02','楼栋名称5','宿舍位置5','宿舍名称5',5,'宿舍配置5'),(116,'2022-12-30 08:33:02','楼栋名称6','宿舍位置6','宿舍名称6',6,'宿舍配置6'),(117,'2022-12-30 08:33:02','楼栋名称7','宿舍位置7','宿舍名称7',7,'宿舍配置7'),(118,'2022-12-30 08:33:02','楼栋名称8','宿舍位置8','宿舍名称8',8,'宿舍配置8'),(1672390849338,'2022-12-30 09:00:48','芳草地','宿舍位置','清清宿舍',6,'配备有热水器');
/*!40000 ALTER TABLE `sushe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushefenpei`
--

DROP TABLE IF EXISTS `sushefenpei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushefenpei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `loudongmingcheng` varchar(200) DEFAULT NULL COMMENT '楼栋名称',
  `sushemingcheng` varchar(200) DEFAULT NULL COMMENT '宿舍名称',
  `ertongxingming` varchar(200) NOT NULL COMMENT '儿童姓名',
  `chuangweihao` varchar(200) DEFAULT NULL COMMENT '床位号',
  `fenpeiriqi` date DEFAULT NULL COMMENT '分配日期',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390905750 DEFAULT CHARSET=utf8 COMMENT='宿舍分配';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushefenpei`
--

LOCK TABLES `sushefenpei` WRITE;
/*!40000 ALTER TABLE `sushefenpei` DISABLE KEYS */;
INSERT INTO `sushefenpei` VALUES (201,'2022-12-30 08:33:02','楼栋名称1','宿舍名称1','儿童姓名1','床位号1','2022-12-30','备注1'),(202,'2022-12-30 08:33:02','楼栋名称2','宿舍名称2','儿童姓名2','床位号2','2022-12-30','备注2'),(203,'2022-12-30 08:33:02','楼栋名称3','宿舍名称3','儿童姓名3','床位号3','2022-12-30','备注3'),(204,'2022-12-30 08:33:02','楼栋名称4','宿舍名称4','儿童姓名4','床位号4','2022-12-30','备注4'),(205,'2022-12-30 08:33:02','楼栋名称5','宿舍名称5','儿童姓名5','床位号5','2022-12-30','备注5'),(206,'2022-12-30 08:33:02','楼栋名称6','宿舍名称6','儿童姓名6','床位号6','2022-12-30','备注6'),(207,'2022-12-30 08:33:02','楼栋名称7','宿舍名称7','儿童姓名7','床位号7','2022-12-30','备注7'),(208,'2022-12-30 08:33:02','楼栋名称8','宿舍名称8','儿童姓名8','床位号8','2022-12-30','备注8'),(1672390905749,'2022-12-30 09:01:45','芳草地','清清宿舍','小明','3','2022-12-30','分配备注');
/*!40000 ALTER TABLE `sushefenpei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushewupin`
--

DROP TABLE IF EXISTS `sushewupin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushewupin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `loudongmingcheng` varchar(200) DEFAULT NULL COMMENT '楼栋名称',
  `sushemingcheng` varchar(200) DEFAULT NULL COMMENT '宿舍名称',
  `wupinmingcheng` varchar(200) NOT NULL COMMENT '物品名称',
  `wupinshuliang` int(11) DEFAULT NULL COMMENT '物品数量',
  `wupinjianjie` varchar(200) DEFAULT NULL COMMENT '物品简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391113718 DEFAULT CHARSET=utf8 COMMENT='宿舍物品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushewupin`
--

LOCK TABLES `sushewupin` WRITE;
/*!40000 ALTER TABLE `sushewupin` DISABLE KEYS */;
INSERT INTO `sushewupin` VALUES (151,'2022-12-30 08:33:02','楼栋名称1','宿舍名称1','物品名称1',1,'物品简介1'),(152,'2022-12-30 08:33:02','楼栋名称2','宿舍名称2','物品名称2',2,'物品简介2'),(153,'2022-12-30 08:33:02','楼栋名称3','宿舍名称3','物品名称3',3,'物品简介3'),(154,'2022-12-30 08:33:02','楼栋名称4','宿舍名称4','物品名称4',4,'物品简介4'),(155,'2022-12-30 08:33:02','楼栋名称5','宿舍名称5','物品名称5',5,'物品简介5'),(156,'2022-12-30 08:33:02','楼栋名称6','宿舍名称6','物品名称6',6,'物品简介6'),(157,'2022-12-30 08:33:02','楼栋名称7','宿舍名称7','物品名称7',7,'物品简介7'),(158,'2022-12-30 08:33:02','楼栋名称8','宿舍名称8','物品名称8',8,'物品简介8'),(1672391113717,'2022-12-30 09:05:12','芳草地','清清宿舍','物品名称',5,'物品简介');
/*!40000 ALTER TABLE `sushewupin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1672389528033,'11','aixinrenshi','爱心人士','iv75g9e3r5d7jw5360vtk6tzbo69hejb','2022-12-30 08:38:52','2022-12-30 10:33:43'),(2,1672390066591,'22','yuangong','员工','tzoj69h5pfyzuichsdavob9352hywf3m','2022-12-30 08:47:53','2022-12-30 10:32:42'),(3,1672391310519,'33','houqinrenyuan','后勤人员','5bf9xnpunynidbw6psn7z88p91kvijri','2022-12-30 09:08:36','2022-12-30 10:13:52'),(4,1,'admin','users','管理员','kn95sv0u7wkusd8lm42m1kum3r22ppg4','2022-12-30 09:14:43','2022-12-30 10:14:43');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2022-12-30 08:33:02');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wuzi`
--

DROP TABLE IF EXISTS `wuzi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wuzi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wuzimingcheng` varchar(200) DEFAULT NULL COMMENT '物资名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `wuzimiaoshu` varchar(200) DEFAULT NULL COMMENT '物资描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391173315 DEFAULT CHARSET=utf8 COMMENT='物资';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wuzi`
--

LOCK TABLES `wuzi` WRITE;
/*!40000 ALTER TABLE `wuzi` DISABLE KEYS */;
INSERT INTO `wuzi` VALUES (161,'2022-12-30 08:33:02','物资名称1',1,'物资描述1'),(162,'2022-12-30 08:33:02','物资名称2',2,'物资描述2'),(163,'2022-12-30 08:33:02','物资名称3',3,'物资描述3'),(164,'2022-12-30 08:33:02','物资名称4',4,'物资描述4'),(165,'2022-12-30 08:33:02','物资名称5',5,'物资描述5'),(166,'2022-12-30 08:33:02','物资名称6',6,'物资描述6'),(167,'2022-12-30 08:33:02','物资名称7',7,'物资描述7'),(168,'2022-12-30 08:33:02','物资名称8',8,'物资描述8'),(1672391173314,'2022-12-30 09:06:12','被子',5,'物资描述');
/*!40000 ALTER TABLE `wuzi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wuzicaigou`
--

DROP TABLE IF EXISTS `wuzicaigou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wuzicaigou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wuzimingcheng` varchar(200) DEFAULT NULL COMMENT '物资名称',
  `caigoushuliang` varchar(200) DEFAULT NULL COMMENT '采购数量',
  `houqingonghao` varchar(200) DEFAULT NULL COMMENT '后勤工号',
  `houqinxingming` varchar(200) DEFAULT NULL COMMENT '后勤姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391456275 DEFAULT CHARSET=utf8 COMMENT='物资采购';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wuzicaigou`
--

LOCK TABLES `wuzicaigou` WRITE;
/*!40000 ALTER TABLE `wuzicaigou` DISABLE KEYS */;
INSERT INTO `wuzicaigou` VALUES (171,'2022-12-30 08:33:02','物资名称1','采购数量1','后勤工号1','后勤姓名1','手机1'),(172,'2022-12-30 08:33:02','物资名称2','采购数量2','后勤工号2','后勤姓名2','手机2'),(173,'2022-12-30 08:33:02','物资名称3','采购数量3','后勤工号3','后勤姓名3','手机3'),(174,'2022-12-30 08:33:02','物资名称4','采购数量4','后勤工号4','后勤姓名4','手机4'),(175,'2022-12-30 08:33:02','物资名称5','采购数量5','后勤工号5','后勤姓名5','手机5'),(176,'2022-12-30 08:33:02','物资名称6','采购数量6','后勤工号6','后勤姓名6','手机6'),(177,'2022-12-30 08:33:02','物资名称7','采购数量7','后勤工号7','后勤姓名7','手机7'),(178,'2022-12-30 08:33:02','物资名称8','采购数量8','后勤工号8','后勤姓名8','手机8'),(1672391450469,'2022-12-30 09:10:49','物资名称1','5','33','张永','13513513579'),(1672391456274,'2022-12-30 09:10:55','物资名称2','10','33','张永','13513513579');
/*!40000 ALTER TABLE `wuzicaigou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yigongshenqing`
--

DROP TABLE IF EXISTS `yigongshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yigongshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shoujihao` varchar(200) DEFAULT NULL COMMENT '手机号',
  `shenqingziliao` longtext COMMENT '申请资料',
  `shenqingmiaoshu` longtext COMMENT '申请描述',
  `shenqingshijian` date DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672389959850 DEFAULT CHARSET=utf8 COMMENT='义工申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yigongshenqing`
--

LOCK TABLES `yigongshenqing` WRITE;
/*!40000 ALTER TABLE `yigongshenqing` DISABLE KEYS */;
INSERT INTO `yigongshenqing` VALUES (131,'2022-12-30 08:33:02','账号1','姓名1','手机号1','','申请描述1','2022-12-30','是',''),(132,'2022-12-30 08:33:02','账号2','姓名2','手机号2','','申请描述2','2022-12-30','是',''),(133,'2022-12-30 08:33:02','账号3','姓名3','手机号3','','申请描述3','2022-12-30','是',''),(134,'2022-12-30 08:33:02','账号4','姓名4','手机号4','','申请描述4','2022-12-30','是',''),(135,'2022-12-30 08:33:02','账号5','姓名5','手机号5','','申请描述5','2022-12-30','是',''),(136,'2022-12-30 08:33:02','账号6','姓名6','手机号6','','申请描述6','2022-12-30','是',''),(137,'2022-12-30 08:33:02','账号7','姓名7','手机号7','','申请描述7','2022-12-30','是',''),(138,'2022-12-30 08:33:02','账号8','姓名8','手机号8','','申请描述8','2022-12-30','是',''),(1672389959849,'2022-12-30 08:45:59','11','陈雨','13613613688','upload/1672389944234.docx','<p>申请原因</p>','2022-12-30','是','回复内容');
/*!40000 ALTER TABLE `yigongshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) NOT NULL COMMENT '员工工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yuangongxingming` varchar(200) NOT NULL COMMENT '员工姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhaopian` longtext COMMENT '照片',
  `yuangongdianhua` varchar(200) DEFAULT NULL COMMENT '员工电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1672390066592 DEFAULT CHARSET=utf8 COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (21,'2022-12-30 08:33:02','员工工号1','123456','员工姓名1','男','upload/yuangong_zhaopian1.jpg','13823888881'),(22,'2022-12-30 08:33:02','员工工号2','123456','员工姓名2','男','upload/yuangong_zhaopian2.jpg','13823888882'),(23,'2022-12-30 08:33:02','员工工号3','123456','员工姓名3','男','upload/yuangong_zhaopian3.jpg','13823888883'),(24,'2022-12-30 08:33:02','员工工号4','123456','员工姓名4','男','upload/yuangong_zhaopian4.jpg','13823888884'),(25,'2022-12-30 08:33:02','员工工号5','123456','员工姓名5','男','upload/yuangong_zhaopian5.jpg','13823888885'),(26,'2022-12-30 08:33:02','员工工号6','123456','员工姓名6','男','upload/yuangong_zhaopian6.jpg','13823888886'),(27,'2022-12-30 08:33:02','员工工号7','123456','员工姓名7','男','upload/yuangong_zhaopian7.jpg','13823888887'),(28,'2022-12-30 08:33:02','员工工号8','123456','员工姓名8','男','upload/yuangong_zhaopian8.jpg','13823888888'),(1672390066591,'2022-12-30 08:47:46','22','22','李莉','女','upload/1672390122901.jpeg','13713713799');
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuansuofengcai`
--

DROP TABLE IF EXISTS `yuansuofengcai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuansuofengcai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuansuomingcheng` varchar(200) NOT NULL COMMENT '院所名称',
  `yuansuotupian` longtext COMMENT '院所图片',
  `chuangbanshijian` date NOT NULL COMMENT '创办时间',
  `danweidizhi` varchar(200) NOT NULL COMMENT '单位地址',
  `fuwulinian` varchar(200) DEFAULT NULL COMMENT '服务理念',
  `huoderongyu` varchar(200) DEFAULT NULL COMMENT '获得荣誉',
  `fazhanlishi` longtext COMMENT '发展历史',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672391953566 DEFAULT CHARSET=utf8 COMMENT='院所风采';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuansuofengcai`
--

LOCK TABLES `yuansuofengcai` WRITE;
/*!40000 ALTER TABLE `yuansuofengcai` DISABLE KEYS */;
INSERT INTO `yuansuofengcai` VALUES (51,'2022-12-30 08:33:02','院所名称1','upload/yuansuofengcai_yuansuotupian1.jpg,upload/yuansuofengcai_yuansuotupian2.jpg,upload/yuansuofengcai_yuansuotupian3.jpg','2022-12-30','单位地址1','服务理念1','获得荣誉1','发展历史1'),(52,'2022-12-30 08:33:02','院所名称2','upload/yuansuofengcai_yuansuotupian2.jpg,upload/yuansuofengcai_yuansuotupian3.jpg,upload/yuansuofengcai_yuansuotupian4.jpg','2022-12-30','单位地址2','服务理念2','获得荣誉2','发展历史2'),(53,'2022-12-30 08:33:02','院所名称3','upload/yuansuofengcai_yuansuotupian3.jpg,upload/yuansuofengcai_yuansuotupian4.jpg,upload/yuansuofengcai_yuansuotupian5.jpg','2022-12-30','单位地址3','服务理念3','获得荣誉3','发展历史3'),(54,'2022-12-30 08:33:02','院所名称4','upload/yuansuofengcai_yuansuotupian4.jpg,upload/yuansuofengcai_yuansuotupian5.jpg,upload/yuansuofengcai_yuansuotupian6.jpg','2022-12-30','单位地址4','服务理念4','获得荣誉4','发展历史4'),(55,'2022-12-30 08:33:02','院所名称5','upload/yuansuofengcai_yuansuotupian5.jpg,upload/yuansuofengcai_yuansuotupian6.jpg,upload/yuansuofengcai_yuansuotupian7.jpg','2022-12-30','单位地址5','服务理念5','获得荣誉5','发展历史5'),(56,'2022-12-30 08:33:02','院所名称6','upload/yuansuofengcai_yuansuotupian6.jpg,upload/yuansuofengcai_yuansuotupian7.jpg,upload/yuansuofengcai_yuansuotupian8.jpg','2022-12-30','单位地址6','服务理念6','获得荣誉6','发展历史6'),(57,'2022-12-30 08:33:02','院所名称7','upload/yuansuofengcai_yuansuotupian7.jpg,upload/yuansuofengcai_yuansuotupian8.jpg,upload/yuansuofengcai_yuansuotupian9.jpg','2022-12-30','单位地址7','服务理念7','获得荣誉7','发展历史7'),(58,'2022-12-30 08:33:02','院所名称8','upload/yuansuofengcai_yuansuotupian8.jpg,upload/yuansuofengcai_yuansuotupian9.jpg,upload/yuansuofengcai_yuansuotupian10.jpg','2022-12-30','单位地址8','服务理念8','获得荣誉8','发展历史8'),(1672391953565,'2022-12-30 09:19:13','儿童福利院','upload/1672391899320.jpg','2020-01-01','地址','服务理念','获得荣誉','<p>发展历史</p>');
/*!40000 ALTER TABLE `yuansuofengcai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhengcefagui`
--

DROP TABLE IF EXISTS `zhengcefagui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhengcefagui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhengcemingcheng` varchar(200) NOT NULL COMMENT '政策名称',
  `zhengcetupian` longtext COMMENT '政策图片',
  `zhengceneirong` longtext COMMENT '政策内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1672392477851 DEFAULT CHARSET=utf8 COMMENT='政策法规';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhengcefagui`
--

LOCK TABLES `zhengcefagui` WRITE;
/*!40000 ALTER TABLE `zhengcefagui` DISABLE KEYS */;
INSERT INTO `zhengcefagui` VALUES (91,'2022-12-30 08:33:02','政策名称1','upload/zhengcefagui_zhengcetupian1.jpg,upload/zhengcefagui_zhengcetupian2.jpg,upload/zhengcefagui_zhengcetupian3.jpg','政策内容1','2022-12-30'),(92,'2022-12-30 08:33:02','政策名称2','upload/zhengcefagui_zhengcetupian2.jpg,upload/zhengcefagui_zhengcetupian3.jpg,upload/zhengcefagui_zhengcetupian4.jpg','政策内容2','2022-12-30'),(93,'2022-12-30 08:33:02','政策名称3','upload/zhengcefagui_zhengcetupian3.jpg,upload/zhengcefagui_zhengcetupian4.jpg,upload/zhengcefagui_zhengcetupian5.jpg','政策内容3','2022-12-30'),(94,'2022-12-30 08:33:02','政策名称4','upload/zhengcefagui_zhengcetupian4.jpg,upload/zhengcefagui_zhengcetupian5.jpg,upload/zhengcefagui_zhengcetupian6.jpg','政策内容4','2022-12-30'),(95,'2022-12-30 08:33:02','政策名称5','upload/zhengcefagui_zhengcetupian5.jpg,upload/zhengcefagui_zhengcetupian6.jpg,upload/zhengcefagui_zhengcetupian7.jpg','政策内容5','2022-12-30'),(96,'2022-12-30 08:33:02','政策名称6','upload/zhengcefagui_zhengcetupian6.jpg,upload/zhengcefagui_zhengcetupian7.jpg,upload/zhengcefagui_zhengcetupian8.jpg','政策内容6','2022-12-30'),(97,'2022-12-30 08:33:02','政策名称7','upload/zhengcefagui_zhengcetupian7.jpg,upload/zhengcefagui_zhengcetupian8.jpg,upload/zhengcefagui_zhengcetupian9.jpg','政策内容7','2022-12-30'),(98,'2022-12-30 08:33:02','政策名称8','upload/zhengcefagui_zhengcetupian8.jpg,upload/zhengcefagui_zhengcetupian9.jpg,upload/zhengcefagui_zhengcetupian10.jpg','政策内容8','2022-12-30'),(1672392477850,'2022-12-30 09:27:56','政策名称','upload/1672392391701.jpg','<p>2022年领养孩子最新政策内容</p>','2022-01-01');
/*!40000 ALTER TABLE `zhengcefagui` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-04 16:59:14
