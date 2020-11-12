-- ----------------------------
-- v2.3.2
-- ----------------------------

-- 新增商品关联表
DROP TABLE IF EXISTS `t_goods_form`;
CREATE TABLE `t_goods_form` (
    `t_origin_goodId` int(11) unsigned NOT NULL COMMENT '源商品',
    `t_form_goodId` int(11) unsigned NOT NULL COMMENT '关联商品'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='关联商品表';