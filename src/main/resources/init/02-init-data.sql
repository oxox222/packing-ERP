-- 权限控制
INSERT INTO `t_permission` VALUES (1, 'insert', '');
INSERT INTO `t_permission` VALUES (2, 'delete', '');
INSERT INTO `t_permission` VALUES (3, 'update', '');
INSERT INTO `t_permission` VALUES (4, 'select', '');

-- 新增用户
INSERT INTO `t_user`(`userName`, `password`) VALUES ('root', '123');
INSERT INTO `t_user`(`userName`, `password`) VALUES ('admin', '123');

-- 新增角色
INSERT INTO `t_role` VALUES(1, 'boss');
INSERT INTO `t_role` VALUES(2, 'admin');
INSERT INTO `t_role` VALUES(3, 'finance');
INSERT INTO `t_role` VALUES(4, 'staff');

-- 新增用户角色
INSERT INTO `t_user_role`(uid, rid) VALUES (1,1);
INSERT INTO `t_user_role`(uid, rid) VALUES (2,2);

-- 新增角色权限
INSERT INTO `t_role_permission`(rid, pid) VALUES (1,1);
INSERT INTO `t_role_permission`(rid, pid) VALUES (1,2);
INSERT INTO `t_role_permission`(rid, pid) VALUES (1,3);
INSERT INTO `t_role_permission`(rid, pid) VALUES (1,4);
INSERT INTO `t_role_permission`(rid, pid) VALUES (2,1);
INSERT INTO `t_role_permission`(rid, pid) VALUES (2,4);
