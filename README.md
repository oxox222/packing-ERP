# 进销存软件

## 2.3.9
1.新增修改出库单状态接口
2.新增登出,获取用户信息接口
3.修改订单号方法
4.新增取消订单接口
5.新增退货功能

## 2.3.8
1.单号格式优化
2.接口优化
3.修改session过期时间

## 2.3.7
1.新增根据id查询出库单详情接口

## 2.3.6
1.新增一个不分页的出库单查询接口
2.供应商/客户/仓库/货物，新增和编辑时，做已存在判断提示

## 2.3.5
1.新增报单功能模块
2.新增手提袋,鞋套,外箱信息
3.新增报单功能

## 2.3.4
1.修改编辑接口bug,入库单查询bug
2.新增出入库关联表
3.新增关联出库单管理入库单功能
4.修改出库/入库表odd字段为unique

## 2.3.3
1.新增redis缓存
2.新增自动生成单号功能
3.新增接口(新增出库单时自动填充入库单信息)

## 2.3.2
1. 新增关联商品功能(新增,编辑,查询)

## 2.3.1
1. 商品表新增单价字段
2. 价格相关字段设置可为空
3. 出库单表表顾客id/交货联系人/交货方id字段可为空
4. 增加上传文件功能
5.出库单查询增加交货方名称字段

## 2.2.3
1. 数据库字段内容支持清空
2. 出入库查询修改
3. 创建库存统计视图
4. maven profiles分环境打包

## 2.2.2
1. 库存量查询修改

## 2.2.1
1. 增加shiro过滤器:禁止未登录请求自动跳转jsp,返回json.

## 2.1.1
1. erp系统改造:仓库管理改造,客户管理改造,供应商管理改造
2. 数据库语句更新

## 1.1.3
1. 添加增加商品功能
2. 商品图片上传
3. 修改商品表结构

## 1.1.2
1. 新增shiro权限控制模块
2. 修改登录方式为shiro
3. 增加用户表,角色表,权限表,用户角色表,角色权限表
4. 登出

## 1.1.1
1. 配置swagger2 自动生成接口文档
2. 添加索引

## 1.1.0
1. 项目构建
2. 添加登录模块
3. 添加查询字典功能
4. 添加供应商管理接口,客户管理接口,修改结果返回格式
5. 添加库存管理功能
6. 新增删除接口(后续可考虑改为软删除)