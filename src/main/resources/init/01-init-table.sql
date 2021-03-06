

CREATE TABLE `t_save_record` (
`t_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
`t_odd` varchar(255) NOT NULL COMMENT '单号',
`t_warehouseId` int(11) NOT NULL COMMENT '仓库',
`t_discount` float(11,0) NOT NULL DEFAULT 1.0 COMMENT '折扣',
`t_paid` double(11,0) NOT NULL DEFAULT 0.00 COMMENT '实付金额',
`t_remark` varchar(255) NULL COMMENT '备注',
`t_photo` longtext NULL COMMENT '图片',
`t_supplierId` int(255) NOT NULL COMMENT '供应商id',
`t_type` varchar(11) NOT NULL COMMENT '入库类型',
`t_create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (`t_id`) 
)
COMMENT = '入库单表';

CREATE TABLE `t_save_goods` (
`t_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
`t_recordId` int(255) NOT NULL COMMENT '入库表id',
`t_name` varchar(255) NOT NULL COMMENT '商品名',
`t_price` double(10,2) NOT NULL COMMENT '单价',
`t_discount` float(10,0) NOT NULL DEFAULT 1.0 COMMENT '折扣',
`t_paid` double(10,2) NOT NULL COMMENT '实付金额',
`t_num` int NOT NULL COMMENT '数量',
`t_size` varchar(255) NOT NULL COMMENT '规格',
`t_type` varchar(11) NOT NULL COMMENT '入库类型',
PRIMARY KEY (`t_id`) 
)
COMMENT = '入库商品表';

CREATE TABLE `t_supplier` (
`t_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
`t_name` varchar(255) NOT NULL COMMENT '供应商名称',
`t_leader` varchar(255) NULL COMMENT '负责人',
`t_discount` float(11,0) NOT NULL COMMENT '折扣',
`t_mobilPhone` varchar(255) NULL COMMENT '手机号',
`t_phone` varchar(255) NULL COMMENT '电话号',
`t_mail` varchar(255) NULL COMMENT '邮箱',
`t_fax` varchar(255) NULL COMMENT '传真号码',
`t_website` varchar(255) NULL COMMENT '网址',
`t_addr` varchar(255) NULL COMMENT '地区 ,分割',
`t_addrDetail` varchar(255) NULL COMMENT '详细地址',
`t_bank` varchar(255) NULL COMMENT '开户银行',
`t_bank_account` varchar(255) NULL COMMENT '银行账号',
`t_bank_accountName` varchar(255) NULL COMMENT '银行账户名',
`t_sort` int(255) NULL COMMENT '排序字段',
`t_remark` varchar(255) NULL COMMENT '备注',
PRIMARY KEY (`t_id`) 
)
COMMENT = '供应商表';

CREATE TABLE `t_fetch_record` (
`t_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
`t_warehouseId` int(11) NOT NULL COMMENT '仓库',
`t_odd` varchar(255) NOT NULL COMMENT '单号',
`t_discount` float(11,0) NOT NULL DEFAULT 1.0 COMMENT '折扣',
`t_other_cost` double(11,0) NULL COMMENT '其他费用',
`t_other_costName` varchar(255) NULL COMMENT '其他费用名称',
`t_paid` double(11,0) NOT NULL COMMENT '实收金额',
`t_salesman` varchar(255) NULL COMMENT '销售员',
`t_deliverWay` varchar(255) NULL COMMENT '发货方式',
`t_remake` varchar(255) NULL COMMENT '备注',
`t_photo` longtext NULL COMMENT '图片',
`t_type` varchar(11) NOT NULL COMMENT '出库类型',
`t_customId` int(255) NOT NULL COMMENT '顾客id',
`t_create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`t_state` int(2) NOT NULL DEFAULT '1' COMMENT '订单状态',
PRIMARY KEY (`t_id`) 
)
COMMENT = '出库单表';

CREATE TABLE `t_warehouse` (
`t_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
`t_name` varchar(255) NOT NULL COMMENT '仓库名称',
`t_leader` varchar(255) NOT NULL COMMENT '负责人',
`t_sort` int(255) NULL COMMENT '排序',
`t_remark` varchar(255) NULL COMMENT '备注',
`t_status` tinyint(255) NOT NULL DEFAULT 1 COMMENT '是否启用',
PRIMARY KEY (`t_id`) 
)
COMMENT = '仓库表';

CREATE TABLE `t_fetch_goods` (
`t_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '主键',
`t_recordId` int(255) NOT NULL COMMENT '入库表id',
`t_name` varchar(255) NOT NULL COMMENT '商品名',
`t_price` double(10,2) NOT NULL COMMENT '单价',
`t_discount` float(10,0) NOT NULL DEFAULT 1.0 COMMENT '折扣',
`t_paid` double(10,2) NOT NULL COMMENT '实付金额',
`t_num` int NOT NULL COMMENT '数量',
`t_size` varchar(255) NOT NULL COMMENT '规格',
`t_type` varchar(11) NOT NULL COMMENT '出库类型',
PRIMARY KEY (`t_id`) 
)
COMMENT = '商品表';

CREATE TABLE `t_dictionary` (
`t_type` varchar(255) NULL COMMENT '字典类型',
`t_code` varchar(255) NULL COMMENT '字典值',
`t_name` varchar(255) NULL COMMENT '字典名称',
`t_description` varchar(255) NULL COMMENT '字典描述'
)
COMMENT = '字典表';

CREATE TABLE `t_custom` (
    `t_id` int(255) NOT NULL COMMENT '主键',
    `t_name` varchar(255) NOT NULL COMMENT '客户名称',
    `t_contacts` varchar(255) NULL COMMENT '联系人',
    `t_mobilPhone` varchar(255) NULL COMMENT '联系人手机号码',
    `t_customType` int(11) NULL COMMENT '客户分类',
    `t_status` tinyint(11) NOT NULL DEFAULT 1 COMMENT '是否启用',
    `t_discount` float(11,0) NULL DEFAULT 1 COMMENT '折扣',
    `t_salesmanId` int(255) NULL COMMENT '所属销售员',
    `t_phone` varchar(255) NULL COMMENT '电话',
    `t_mail` varchar(255) NULL COMMENT '邮箱',
    `t_fax` varchar(255) NULL COMMENT '传真',
    `t_addr` varchar(255) NULL COMMENT '地区',
    `t_addrDetail` varchar(255) NULL COMMENT '详细地址',
    `t_deliverWay` varchar(255) NULL COMMENT '发货方式',
    `t_bank` varchar(255) NULL COMMENT '开户银行',
    `t_bankAccountName` varchar(255) NULL COMMENT '银行账户',
    `t_bankAccount` varchar(255) NULL COMMENT '银行账号',
    `t_sort` int(255) NULL COMMENT '排序',
    `t_remark` varchar(255) NULL COMMENT '备注',
    PRIMARY KEY (`t_id`)
)
COMMENT = '客户表';

-- 用户表 --
CREATE TABLE `t_user` (
    `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `userName` varchar(255) NOT NULL COMMENT '用户名',
    `password` varchar(255) NOT NULL COMMENT '密码',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `last_login_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后登录时间',
    PRIMARY KEY (`uid`),
    KEY index_userName(`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 角色表 --
CREATE TABLE `t_role` (
    `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` VARCHAR(255) NOT NULL COMMENT '角色',
    PRIMARY KEY (`rid`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT '角色表';

-- 权限表 --
CREATE TABLE `t_permission` (
    `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` VARCHAR(255) NOT NULL DEFAULT '权限',
    `url` varchar(255) DEFAULT NULL COMMENT '路径',
    PRIMARY KEY (`pid`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT '权限表';

-- 用户角色关系表 --
CREATE TABLE `t_user_role` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `uid` int(11) NOT NULL COMMENT '用户表uid',
    `rid` int(11) NOT NULL COMMENT '角色表rid',
    PRIMARY KEY (`id`),
    KEY index_uid(`uid`),
    KEY index_rid(`rid`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT '用户角色关系表';

-- 角色权限关系表 --
CREATE TABLE `t_role_permission` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `rid` int(11) NOT NULL COMMENT '角色表rid',
    `pid` int(11) NOT NULL COMMENT '权限表uid',
    PRIMARY KEY (`id`),
    KEY index_rid(`rid`),
    KEY index_uid(`pid`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT '角色权限关系表';



