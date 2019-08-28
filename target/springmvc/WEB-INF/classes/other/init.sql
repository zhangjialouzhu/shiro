-- 初始化机构
INSERT INTO `sys_org` VALUES ('50835a495105434fa01e860bb9ee9236', '', 'ASONE平台', 0, '深圳市', NULL, '0', '0', '深圳市', NULL, NULL, NULL, NULL, '960339491@qq.com', NULL, NULL, NULL, '', '2017-3-10 15:43:58', '', '2017-3-10 15:44:00', NULL, '0');

-- 初始化角色
INSERT INTO `sys_role` VALUES ('ee18970834f74b96b405b522a04a3dac', '50835a495105434fa01e860bb9ee9236', 'ADMIN', 'admin', '0', '0', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:15:39', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:15:42', NULL, '0');

-- 初始化用户
INSERT INTO `sys_user` VALUES ('f175a4d7fcbc4f28ab14ed7e79ff7c96', '50835a495105434fa01e860bb9ee9236', 'admin', 'a66abb5684c45962d887564f08346e8d', '123456', 'asone', '960339491@qq.com', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '2017-3-10 16:03:16', '', '2017-3-10 16:03:20', NULL, '0');

-- 初始化菜单
INSERT INTO `sys_resource` VALUES ('f6b0f4900b56480da68ce683c374595b', '', '欢迎', 0, 'dashboard', 'dashboard', 'ion-android-home', '0', 'dashboard', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:55', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:58', NULL, '0');
INSERT INTO `sys_resource` VALUES ('04f8f1ad0a844ac8871909e58a43f414', '', '系统管理', 1, 'sys', 'sys', 'ion-gear-a', '0', 'sys', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:55', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:58', NULL, '0');
INSERT INTO `sys_resource` VALUES ('77abff557e3d4d60bd5ca2dcac45bced', '04f8f1ad0a844ac8871909e58a43f414', '用户管理', 2, 'user', 'user', 'ion-person', '0', 'user', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:55', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:58', NULL, '0');
INSERT INTO `sys_resource` VALUES ('f6fbe5e1b2b14f75b4f436f080f90422', '04f8f1ad0a844ac8871909e58a43f414', '角色管理', 3, 'role', 'role', 'ion-flag', '0', 'role', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:55', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:58', NULL, '0');
INSERT INTO `sys_resource` VALUES ('6ff2d7dc3bb84d8497014ded499d3c69', '04f8f1ad0a844ac8871909e58a43f414', '权限管理', 4, 'permission', 'permission', 'ion-locked', '0', 'permission', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:55', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:58', NULL, '0');
INSERT INTO `sys_resource` VALUES ('a398f2a4f0d74744ad8121919089f692', '04f8f1ad0a844ac8871909e58a43f414', '资源管理', 5, 'resource', 'resource', 'ion-navicon-round', '0', 'resource', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:55', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', '2017-3-21 17:18:58', NULL, '0');

-- 初始化权限
INSERT INTO `sys_role_org` VALUES ('a404cce529d9436a92882f15910ccd22', 'ee18970834f74b96b405b522a04a3dac', '50835a495105434fa01e860bb9ee9236');
INSERT INTO `sys_user_role` VALUES ('2a07cb8fa31842b4b3b810cbc1b39c36', 'f175a4d7fcbc4f28ab14ed7e79ff7c96', 'ee18970834f74b96b405b522a04a3dac');
INSERT INTO `sys_role_resource` VALUES ('e939549f84884d378e64c3e09c668829', 'ee18970834f74b96b405b522a04a3dac', 'f6b0f4900b56480da68ce683c374595b');
INSERT INTO `sys_role_resource` VALUES ('bfcc14a11d7f43a496b745f56a38c583', 'ee18970834f74b96b405b522a04a3dac', '04f8f1ad0a844ac8871909e58a43f414');
INSERT INTO `sys_role_resource` VALUES ('8edce4ad51194563a64d470103dd6456', 'ee18970834f74b96b405b522a04a3dac', '77abff557e3d4d60bd5ca2dcac45bced');
INSERT INTO `sys_role_resource` VALUES ('39dfdbd4e0be4adca56a325cd4df977e', 'ee18970834f74b96b405b522a04a3dac', 'f6fbe5e1b2b14f75b4f436f080f90422');
INSERT INTO `sys_role_resource` VALUES ('b90f4f94075d4abbacf8e8247c8e2e03', 'ee18970834f74b96b405b522a04a3dac', '6ff2d7dc3bb84d8497014ded499d3c69');
INSERT INTO `sys_role_resource` VALUES ('a66abb5684c45962d887564f08346e8d', 'ee18970834f74b96b405b522a04a3dac', 'a398f2a4f0d74744ad8121919089f692');