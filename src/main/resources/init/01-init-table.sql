
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
    `t_odd` varchar(50) NOT NULL COMMENT '单号' unique,
    `t_warehouseId` int(11) unsigned NOT NULL COMMENT '仓库表id',
    `t_discount` float(3,2) NOT NULL DEFAULT '1.00' COMMENT '折扣',
    `t_other_cost` double(10,2) DEFAULT NULL COMMENT '其他费用',
    `t_other_cost_name` varchar(20) DEFAULT NULL COMMENT '其他费用名称',
    `t_paid` double(11,2) DEFAULT NULL COMMENT '应收金额',
    `t_accept_paid` double(11,2) DEFAULT NULL COMMENT '已收金额',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_customId` int(11) unsigned DEFAULT NULL COMMENT '顾客id',
    `t_signer` varchar(20) DEFAULT NULL COMMENT '签收人',
    `t_receiver` varchar(20) DEFAULT NULL COMMENT '交货联系人',
    `t_receiver_phone` varchar(20) DEFAULT NULL COMMENT '交货联系人联系方式',
    `t_receivedId` int(11) unsigned DEFAULT NULL COMMENT '交货方id',
    `t_received_address` varchar(50) DEFAULT NULL COMMENT '交货地址',
    `t_received_time` timestamp NULL DEFAULT NULL COMMENT '交货时间',
    `t_deal_time` timestamp NULL DEFAULT NULL COMMENT '开单时间',
    `t_state` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '订单状态 1备货中;2已发货;3已签收,4已收款,99已取消',
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
    `t_odd` varchar(50) DEFAULT NULL COMMENT '单号' unique,
    `t_warehouseId` int(11) unsigned NOT NULL COMMENT '仓库表id',
    `t_discount` float(3,2) NOT NULL DEFAULT '1.00' COMMENT '折扣',
    `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_supplierId` int(11) unsigned DEFAULT NULL COMMENT '供应商id',
    `t_signer` varchar(20) DEFAULT NULL COMMENT '签收人',
    `t_received_time` timestamp NULL DEFAULT NULL COMMENT '收货时间',
    `t_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`t_id`),
    KEY `idx_supplierId` (`t_supplierId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='入库单表';

-- ----------------------------
-- Table structure for t_fetch_save_record
-- ----------------------------
DROP TABLE IF EXISTS t_fetch_save_record;
CREATE TABLE `t_fetch_save_record`(
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_fetch_id` int(11) DEFAULT NULL COMMENT '出库单id',
    `t_save_id` int(11) DEFAULT NULL COMMENT '入库单id',
    PRIMARY KEY (`t_id`),
    KEY `idx_fetch_id` (`t_fetch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='出入库单关联表';

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
    `t_brand` varchar(20) DEFAULT NULL COMMENT '商标名称',
    `t_texture` varchar(50) DEFAULT NULL COMMENT '材质',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_price` double(8,2) DEFAULT NULL COMMENT '单价',
    `t_reticule_state` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '是否需要手提袋',
    `t_shoecover_state` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否需要鞋套',
    `t_container_size` int(11) unsigned DEFAULT NULL COMMENT '外箱容量',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='商品表';

-- ----------------------------
-- Table structure for t_goods_form
-- ----------------------------
DROP TABLE IF EXISTS `t_goods_form`;
CREATE TABLE `t_goods_form` (
    `t_origin_goodId` int(11) unsigned NOT NULL COMMENT '源商品',
    `t_form_goodId` int(11) unsigned NOT NULL COMMENT '关联商品'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='关联商品表';

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
   `t_recordId` int(11) unsigned NOT NULL COMMENT '入库单表id',
   `t_num` int(255) DEFAULT NULL COMMENT '数量',
   `t_price` double(8,2) DEFAULT NULL COMMENT '单价',
   `t_discount` float(3,2) DEFAULT '1.00' COMMENT '折扣',
   `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额',
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
    `t_recordId` int(11) unsigned NOT NULL COMMENT '出库单表id',
    `t_num` int(255) DEFAULT NULL COMMENT '数量',
    `t_price` double(8,2) DEFAULT NULL COMMENT '单价',
    `t_discount` float(3,2) DEFAULT '1.00' COMMENT '折扣',
    `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额',
    `t_reticule` int(11) unsigned DEFAULT 0 COMMENT '手提袋数量',
    `t_shoecover` int(11) unsigned DEFAULT 0 COMMENT '鞋套数量',
    `t_container` int(11) unsigned DEFAULT 0 COMMENT '外箱数量',
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

-- ----------------------------
-- Table structure for t_declaration
-- ----------------------------
DROP TABLE IF EXISTS `t_declaration`;
CREATE TABLE `t_declaration` (
    `t_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_customId` int(11) unsigned DEFAULT NULL COMMENT '顾客id',
    `t_receivedId` int(11) unsigned DEFAULT NULL COMMENT '交货方id',
    `t_receiver` VARCHAR(20) DEFAULT NULL COMMENT '收货联系人',
    `t_receiver_phone` VARCHAR(20) DEFAULT NULL COMMENT '收货联系人联系方式',
    `t_received_address` VARCHAR(50) DEFAULT NULL COMMENT '收货地址',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    `t_declaration_date` TIMESTAMP NULL DEFAULT NULL COMMENT '报单日期',
    `t_deliver_date` TIMESTAMP NULL DEFAULT NULL COMMENT '发货日期',
    `t_createId` int(11) unsigned NOT NULL COMMENT '创建人',
    `t_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `t_updateId` int(11) unsigned NOT NULL COMMENT '最后修改人',
    `t_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='报单表';

-- ----------------------------
-- Table structure for t_declaration_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_declaration_goods`;
CREATE TABLE `t_declaration_goods` (
    `t_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_goodsId` int(11) unsigned NOT NULL COMMENT '商品表id',
    `t_declarationId` int(11) unsigned NOT NULL COMMENT '报单表id',
    `t_num` int(255) unsigned DEFAULT NULL COMMENT '数量',
    `t_reticule` int(11) unsigned DEFAULT 0 COMMENT '手提袋数量',
    `t_shoecover` int(11) unsigned DEFAULT 0 COMMENT '鞋套数量',
    `t_container` int(11) unsigned DEFAULT 0 COMMENT '外箱数量',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='报单商品记录表';

-- ----------------------------
-- Table structure for t_declaration_fetch
-- ----------------------------
DROP TABLE IF EXISTS `t_declaration_fetch`;
CREATE TABLE `t_declaration_fetch` (
    `t_declarationId` int(11) UNSIGNED NOT NULL COMMENT '报单表id',
    `t_fetchId` int(11) UNSIGNED NOT NULL COMMENT '出库单id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='报单出库单关联表';

-- ----------------------------
-- Table structure for t_cancel_record
-- ----------------------------
DROP TABLE IF EXISTS `t_cancel_record`;
CREATE TABLE `t_cancel_record` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_custom_id` int(11) unsigned DEFAULT NULL COMMENT '顾客id',
    `t_cancel_person_id` int(11) unsigned DEFAULT NULL COMMENT '退货方id',
    `t_cancel_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '退货时间',
    `t_remark` varchar(255) DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='退货单表';

-- ----------------------------
-- Table structure for t_cancel_goods_record
-- ----------------------------
DROP TABLE IF EXISTS `t_cancel_goods_record`;
CREATE TABLE `t_cancel_goods_record` (
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_goods_id` int(11) unsigned NOT NULL COMMENT '商品id',
    `t_cancel_id` int(11) unsigned NOT NULL COMMENT '退货单表id',
    `t_num` int(255) DEFAULT NULL COMMENT '数量',
    `t_price` double(8,2) DEFAULT NULL COMMENT '单价',
    `t_reticule` int(11) unsigned DEFAULT 0 COMMENT '手提袋数量',
    `t_shoe_cover` int(11) unsigned DEFAULT 0 COMMENT '鞋套数量',
    `t_container` int(11) unsigned DEFAULT 0 COMMENT '外箱数量',
    PRIMARY KEY (`t_id`),
    KEY `idx_record_id` (`t_cancel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='退货商品记录表';

SET FOREIGN_KEY_CHECKS = 1;

