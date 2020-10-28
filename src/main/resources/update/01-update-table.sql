-- ----------------------------
-- v2.3.1
-- ----------------------------

-- 调整商品相关字段可为空
ALTER TABLE `t_fetch_goods_record` MODIFY `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额';
ALTER TABLE `t_fetch_record` MODIFY `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额';
ALTER TABLE `t_save_record` MODIFY `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额';
ALTER TABLE `t_save_goods_record` MODIFY `t_paid` double(11,2) DEFAULT NULL COMMENT '实付金额';
ALTER TABLE `t_fetch_record` MODIFY `t_other_cost` double(11,2) DEFAULT NULL COMMENT '其他费用';
ALTER TABLE `t_fetch_record` MODIFY `t_other_cost` double(11,2) DEFAULT NULL COMMENT '其他费用';
ALTER TABLE `t_save_goods_record` MODIFY `t_price` double(8,2) DEFAULT NULL COMMENT '单价';
ALTER TABLE `t_fetch_goods_record` MODIFY `t_price` double(8,2) DEFAULT NULL COMMENT '单价';

-- 商品表新增单价字段
ALTER TABLE `t_goods` ADD `t_price` double(8,2) DEFAULT NULL COMMENT '单价';

-- 出库单表表顾客id/交货联系人/交货方id字段可为空
ALTER TABLE `t_fetch_record` MODIFY COLUMN `t_customId` int(11) unsigned DEFAULT NULL COMMENT '顾客id';
ALTER TABLE `t_fetch_record` MODIFY COLUMN `t_receiver` varchar(20) DEFAULT NULL COMMENT '交货联系人';
ALTER TABLE `t_fetch_record` MODIFY COLUMN `t_receivedId` int(11) unsigned DEFAULT NULL COMMENT '交货方id';