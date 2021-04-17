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