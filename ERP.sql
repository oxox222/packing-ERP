
CREATE DATABASE IF NOT EXISTS erp;
USE erp;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for t_warehouse
-- ----------------------------
DROP TABLE IF EXISTS `t_warehouse`;
CREATE TABLE `t_warehouse` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_name` varchar(20) NOT NULL COMMENT '仓库名称',
    `t_leader` varchar(20) NOT NULL COMMENT '负责人',
    `t_leader_phone` varchar(20) DEFAULT NULL COMMENT '负责人联系方式',
    `t_sort` tinyint(3) unsigned NOT NULL DEFAULT 1 COMMENT '排序 根据sort的大小倒序排序 默认1',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否启用  1启用, 0不启用',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='仓库表';

-- ----------------------------
-- Table structure for t_custom
-- ----------------------------
DROP TABLE IF EXISTS `t_custom`;
CREATE TABLE `t_custom` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_name` varchar(20) NOT NULL COMMENT '客户名称',
    `t_leader` varchar(20) DEFAULT NULL COMMENT '负责人',
    `t_leader_phone` varchar(20) DEFAULT NULL COMMENT '负责人联系方式',
    `t_status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否启用 1启用, 0不启用',
    `t_phone` varchar(20) DEFAULT NULL COMMENT '电话',
    `t_mail` varchar(20) DEFAULT NULL COMMENT '邮箱',
    `t_fax` varchar(20) DEFAULT NULL COMMENT '传真',
    `t_addr` varchar(50) DEFAULT NULL COMMENT '地区',
    `t_addr_detail` varchar(50) DEFAULT NULL COMMENT '详细地址',
    `t_bank` varchar(10) DEFAULT NULL COMMENT '开户银行',
    `t_bank_account_name` varchar(10) DEFAULT NULL COMMENT '银行账户名称',
    `t_bank_account` varchar(20) DEFAULT NULL COMMENT '银行账号',
    `t_sort` tinyint(3) unsigned NOT NULL DEFAULT 1 COMMENT '排序 根据sort的大小倒序排序 默认1',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='客户表';

-- ----------------------------
-- Table structure for t_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `t_dictionary`;
CREATE TABLE `t_dictionary` (
    `t_type` varchar(7) NOT NULL COMMENT '字典类型',
    `t_code` varchar(3) NOT NULL COMMENT '字典值',
    `t_name` varchar(10) NOT NULL COMMENT '字典名称',
    `t_description` varchar(10) DEFAULT NULL COMMENT '字典描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='字典表';

-- ----------------------------
-- Table structure for t_fetch_record
-- ----------------------------
DROP TABLE IF EXISTS `t_fetch_record`;
CREATE TABLE `t_fetch_record` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_odd` varchar(20) NOT NULL COMMENT '单号',
    `t_discount` float(3,2) NOT NULL DEFAULT '1.00' COMMENT '折扣',
    `t_other_cost` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '其他费用',
    `t_other_cost_name` varchar(20) DEFAULT NULL COMMENT '其他费用名称',
    `t_paid` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '实收金额',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_customId` int(11) unsigned NOT NULL COMMENT '顾客id',
    `t_signer` varchar(20) DEFAULT NULL COMMENT '签收人',
    `t_receiver` varchar(20) NOT NULL COMMENT '交货联系人',
    `t_receiver_phone` varchar(20) DEFAULT NULL COMMENT '交货联系人联系方式',
    `t_receivedId` int(11) unsigned NOT NULL COMMENT '交货方id',
    `t_received_address` varchar(50) DEFAULT NULL COMMENT '交货地址',
    `t_received_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '交货时间',
    `t_deal_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开单时间',
    `t_state` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '订单状态',
    `t_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`t_id`),
    KEY `idx_customId` (`t_customId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='出库单表';

-- ----------------------------
-- Table structure for t_save_record
-- ----------------------------
DROP TABLE IF EXISTS `t_save_record`;
CREATE TABLE `t_save_record` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_odd` varchar(20) DEFAULT NULL COMMENT '单号',
    `t_discount` float(3,2) NOT NULL DEFAULT '1.00' COMMENT '折扣',
    `t_paid` double(9,2) NOT NULL DEFAULT '0.00' COMMENT '实付金额',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_supplierId` int(11) unsigned DEFAULT NULL COMMENT '供应商id',
    `t_signer` varchar(20) DEFAULT NULL COMMENT '签收人',
    `t_received_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '收货时间',
    `t_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`t_id`),
    KEY `idx_supplierId` (`t_supplierId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='入库单表';

-- ----------------------------
-- Table structure for t_file
-- ----------------------------
DROP TABLE IF EXISTS `t_file`;
CREATE TABLE `t_file` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_url` varchar(255) DEFAULT NULL COMMENT '地址',
    `t_origin_name` varchar(20) DEFAULT NULL COMMENT '原文件名',
    `t_new_name` varchar(20) DEFAULT NULL COMMENT '现文件名',
    `t_suffix_name` varchar(20) DEFAULT NULL COMMENT '后缀名',
    `t_file_type` tinyint(1) unsigned DEFAULT NULL COMMENT '文件类型 1图片2Excel3word9其他',
    `t_origin_type` tinyint(1) unsigned DEFAULT NULL COMMENT '对应所属类型 1出库单 2入库单3商品',
    `t_origin_id` int(11) unsigned DEFAULT NULL COMMENT '对应所属主键',
    `t_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='文件表';

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_name` varchar(20) NOT NULL COMMENT '商品名',
    `t_size` varchar(10) DEFAULT NULL COMMENT '规格',
    `t_goods_type` tinyint(1) unsigned DEFAULT NULL COMMENT '商品类型,详情见字典表',
    `t_brand` varchar(20) NOT NULL COMMENT '商标名称',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='商品表';

-- ----------------------------
-- Table structure for t_repertory
-- ----------------------------
CREATE Table `t_repertory` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_goodsId` int(11) NOT NULL COMMENT '商品表id',
    `t_warehouseId` int(11) unsigned NOT NULL COMMENT '仓库表id',
    `t_num` int(255) unsigned NOT NULL COMMENT '库存数量',
    PRIMARY KEY (`t_id`),
    KEY `idx_goodsId` (`t_goodsId`),
    KEY `idx_warehouseId` (`t_warehouseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='库存表';

-- ----------------------------
-- Table structure for t_save_goods_record
-- ----------------------------
DROP TABLE IF EXISTS `t_save_goods_record`;
CREATE TABLE `t_save_goods_record` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_goodsId` int(11) unsigned NOT NULL COMMENT '商品id',
    `t_num` int(255) unsigned NOT NULL COMMENT '数量',
    `t_price` double(9,2) NOT NULL DEFAULT '0.00' COMMENT '单价',
    `t_discount` float(3,2) NOT NULL DEFAULT '1.00' COMMENT '折扣',
    `t_paid` double(9,2) NOT NULL DEFAULT '0.00' COMMENT '实付金额',
    PRIMARY KEY (`t_id`),
    KEY `idx_goodsId` (`t_goodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='入库商品记录表';

-- ----------------------------
-- Table structure for t_fetch_goods_record
-- ----------------------------
DROP TABLE IF EXISTS `t_fetch_goods_record`;
CREATE TABLE `t_fetch_goods_record` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_goodsId` int(11) unsigned NOT NULL COMMENT '商品id',
    `t_num` int(255) unsigned NOT NULL COMMENT '数量',
    `t_price` double(9,2) NOT NULL DEFAULT '0.00' COMMENT '单价',
    `t_discount` float(3,2) NOT NULL DEFAULT '1.00' COMMENT '折扣',
    `t_paid` double(9,2) NOT NULL DEFAULT '0.00' COMMENT '实付金额',
    PRIMARY KEY (`t_id`),
    KEY `idx_goodsId` (`t_goodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='出库商品记录表';

-- ----------------------------
-- Table structure for t_supplier
-- ----------------------------
DROP TABLE IF EXISTS `t_supplier`;
CREATE TABLE `t_supplier` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_name` varchar(20) NOT NULL COMMENT '供应商名称',
    `t_leader` varchar(10) DEFAULT NULL COMMENT '负责人',
    `t_leader_phone` varchar(20) DEFAULT NULL COMMENT '负责人手机号',
    `t_phone` varchar(20) DEFAULT NULL COMMENT '电话号',
    `t_mail` varchar(20) DEFAULT NULL COMMENT '邮箱',
    `t_fax` varchar(20) DEFAULT NULL COMMENT '传真号码',
    `t_website` varchar(20) DEFAULT NULL COMMENT '网址',
    `t_addr` varchar(50) DEFAULT NULL COMMENT '地区 ,分割',
    `t_addr_detail` varchar(50) DEFAULT NULL COMMENT '详细地址',
    `t_bank` varchar(20) DEFAULT NULL COMMENT '开户银行',
    `t_bank_account` varchar(50) DEFAULT NULL COMMENT '银行账号',
    `t_bank_accountName` varchar(20) DEFAULT NULL COMMENT '银行账户名',
    `t_sort` tinyint(3) unsigned NOT NULL DEFAULT 1 COMMENT '排序 根据sort的大小倒序排序 默认1',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='供应商表';

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
    `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `userName` varchar(20) NOT NULL COMMENT '用户名',
    `password` varchar(20) NOT NULL COMMENT '密码',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `last_login_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后登录时间',
    PRIMARY KEY (`uid`),
    KEY `idx_name` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `uid` int(11) NOT NULL COMMENT '用户表uid',
    `rid` int(11) NOT NULL COMMENT '角色表rid',
    PRIMARY KEY (`id`),
    KEY `idx_uid` (`uid`),
    KEY `idx_rid` (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
    `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` varchar(20) NOT NULL DEFAULT '权限',
    `url` varchar(50) DEFAULT NULL COMMENT '路径',
    PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
    `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` varchar(20) NOT NULL COMMENT '角色',
    PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for t_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `rid` int(11) NOT NULL COMMENT '角色表rid',
    `pid` int(11) NOT NULL COMMENT '权限表uid',
    PRIMARY KEY (`id`),
    KEY `idx_uid` (`pid`),
    KEY `idx_rid` (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关系表';

SET FOREIGN_KEY_CHECKS = 1;

