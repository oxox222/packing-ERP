-- ----------------------------
-- v2.3.3
-- ----------------------------
-- 修改入库单表和出库单表单号字段大小
ALTER TABLE t_save_record MODIFY COLUMN `t_odd` varchar(50) DEFAULT NULL COMMENT '单号';
ALTER TABLE t_fetch_record MODIFY COLUMN `t_odd` varchar(50) DEFAULT NULL COMMENT '单号';
