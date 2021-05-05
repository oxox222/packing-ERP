-- 2021/05/03
-- 新增报单表
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
-- 新增报单商品表
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
-- 新增报单出库单关联表
DROP TABLE IF EXISTS `t_declaration_fetch`;
CREATE TABLE `t_declaration_fetch` (
    `t_declarationId` int(11) UNSIGNED NOT NULL COMMENT '报单表id',
    `t_fetchId` int(11) UNSIGNED NOT NULL COMMENT '出库单id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='报单出库单关联表';


-- 2021/04/17
-- 出库单商品表 增加手提袋数量,外箱数量,鞋套数量
ALTER TABLE `t_fetch_goods_record` ADD COLUMN `t_reticule` int(11) unsigned DEFAULT 0 COMMENT '手提袋数量';
ALTER TABLE `t_fetch_goods_record` ADD COLUMN `t_shoecover` int(11) unsigned DEFAULT 0 COMMENT '鞋套数量';
ALTER TABLE `t_fetch_goods_record` ADD COLUMN `t_container` int(11) unsigned DEFAULT 0 COMMENT '外箱数量';
-- 出库单表 增加已收金额字段
ALTER TABLE `t_fetch_record` ADD COLUMN `t_accept_paid` double(11,2) DEFAULT NULL COMMENT '已收金额';
-- 商品表 增加是否需要手提袋,是否需要鞋套,外箱容量字段
ALTER TABLE `t_goods` ADD COLUMN `t_reticule_state` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '是否需要手提袋';
ALTER TABLE `t_goods` ADD COLUMN `t_shoecover_state` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否需要鞋套';
ALTER TABLE `t_goods` ADD COLUMN `t_container_size` int(11) unsigned DEFAULT NULL COMMENT '外箱容量';


-- 2021/04/12
-- 出库单表,入库单表odd字段设置为唯一
alter table `t_save_record` add unique(`t_odd`);
alter table `t_fetch_record` add unique(`t_odd`);


-- 2021/04/03
-- 新增出入库单关联表
DROP TABLE IF EXISTS t_fetch_save_record;
CREATE TABLE `t_fetch_save_record`(
    `t_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `t_fetch_id` int(11) DEFAULT NULL COMMENT '出库单id',
    `t_save_id` int(11) DEFAULT NULL COMMENT '入库单id',
    PRIMARY KEY (`t_id`),
    KEY `idx_fetch_id` (`t_fetch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='出入库单关联表';