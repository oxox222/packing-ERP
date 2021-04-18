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