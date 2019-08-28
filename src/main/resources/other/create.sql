

drop table if exists sys_user;
CREATE TABLE sys_user
(
	id varchar(64) NOT NULL COMMENT '编号',
	org_id varchar(64) NOT NULL COMMENT '归属部门',
	username varchar(100) NOT NULL COMMENT '登录名',
	password varchar(100) NOT NULL COMMENT '密码',
	salt varchar(10) NOT NULL COMMENT '随机字符串',
	name varchar(100) NOT NULL COMMENT '姓名',
	email varchar(200) COMMENT '邮箱',
	phone varchar(200) COMMENT '电话',
	mobile varchar(200) COMMENT '手机',
	user_type char(1) COMMENT '用户类型',
	photo varchar(1000) COMMENT '用户头像',
	login_ip varchar(100) COMMENT '最后登陆IP',
	login_date datetime COMMENT '最后登陆时间',
	login_flag varchar(64) COMMENT '是否可登录',
	create_by varchar(64) NOT NULL COMMENT '创建者',
	create_date datetime NOT NULL COMMENT '创建时间',
	update_by varchar(64) NOT NULL COMMENT '更新者',
	update_date datetime NOT NULL COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT '删除标记',
	PRIMARY KEY (id)
) COMMENT = '用户表';


drop table if exists sys_org;
CREATE TABLE sys_org
(
	id varchar(64) NOT NULL COMMENT '编号',
	parent_id varchar(64) NOT NULL COMMENT '父级编号',
	name varchar(100) NOT NULL COMMENT '名称',
	sort decimal(10,0) NOT NULL COMMENT '排序',
	area_id varchar(64) NOT NULL COMMENT '归属区域',
	code varchar(100) COMMENT '区域编码',
	type char(1) NOT NULL COMMENT '机构类型',
	grade char(1) NOT NULL COMMENT '机构等级',
	address varchar(255) COMMENT '联系地址',
	zip_code varchar(100) COMMENT '邮政编码',
	master varchar(100) COMMENT '负责人',
	phone varchar(200) COMMENT '电话',
	fax varchar(200) COMMENT '传真',
	email varchar(200) COMMENT '邮箱',
	USEABLE varchar(64) COMMENT '是否启用',
	PRIMARY_PERSON varchar(64) COMMENT '主负责人',
	DEPUTY_PERSON varchar(64) COMMENT '副负责人',
	create_by varchar(64) NOT NULL COMMENT '创建者',
	create_date datetime NOT NULL COMMENT '创建时间',
	update_by varchar(64) NOT NULL COMMENT '更新者',
	update_date datetime NOT NULL COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT '删除标记',
	PRIMARY KEY (id)
) COMMENT = '机构表';


drop table if exists sys_resource;
CREATE TABLE sys_resource
(
	id varchar(64) NOT NULL COMMENT '编号',
	parent_id varchar(64) NOT NULL COMMENT '父级编号',
	name varchar(100) NOT NULL COMMENT '名称',
	sort decimal(10,0) NOT NULL COMMENT '排序',
	url varchar(2000) COMMENT '链接',
	target varchar(20) COMMENT '目标',
	icon varchar(100) COMMENT '图标',
	is_show char(1) NOT NULL COMMENT '是否在菜单中显示',
	permission varchar(200) COMMENT '权限标识',
	create_by varchar(64) NOT NULL COMMENT '创建者',
	create_date datetime NOT NULL COMMENT '创建时间',
	update_by varchar(64) NOT NULL COMMENT '更新者',
	update_date datetime NOT NULL COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT '删除标记',
	PRIMARY KEY (id)
) COMMENT = '菜单表';


drop table if exists sys_role;
CREATE TABLE sys_role
(
	id varchar(64) NOT NULL COMMENT '编号',
	org_id varchar(64) COMMENT '归属机构',
	name varchar(100) NOT NULL COMMENT '角色名称',
	enname varchar(255) COMMENT '英文名称',
	role_type varchar(255) COMMENT '角色类型',
	useable varchar(64) COMMENT '是否可用',
	create_by varchar(64) NOT NULL COMMENT '创建者',
	create_date datetime NOT NULL COMMENT '创建时间',
	update_by varchar(64) NOT NULL COMMENT '更新者',
	update_date datetime NOT NULL COMMENT '更新时间',
	remarks varchar(255) COMMENT '备注信息',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT '删除标记',
	PRIMARY KEY (id)
) COMMENT = '角色表';


drop table if exists sys_role_resource;
CREATE TABLE sys_role_resource
(
	id varchar(64) NOT NULL COMMENT '编号',
	role_id varchar(64) NOT NULL COMMENT '角色编号',
	resource_id varchar(64) NOT NULL COMMENT '菜单编号',
	PRIMARY KEY (id)
) COMMENT = '角色-菜单';


drop table if exists sys_role_org;
CREATE TABLE sys_role_org
(
	id varchar(64) NOT NULL COMMENT '编号',
	role_id varchar(64) NOT NULL COMMENT '角色编号',
	org_id varchar(64) NOT NULL COMMENT '机构编号',
	PRIMARY KEY (id)
) COMMENT = '角色-机构';


drop table if exists sys_user_role;
CREATE TABLE sys_user_role
(
	id varchar(64) NOT NULL COMMENT '编号',
	user_id varchar(64) NOT NULL COMMENT '用户编号',
	role_id varchar(64) NOT NULL COMMENT '角色编号',
	PRIMARY KEY (id)
) COMMENT = '用户-角色';


drop table if exists sys_dictionary;
create table sys_dictionary
(
   id                   varchar(64) NOT NULL comment 'id',
   type                 varchar(64) NOT NULL comment '类型',
   name                 varchar(255) NOT NULL comment '字典名称',
   value                varchar(255) comment '字典值',
   remarks varchar(255) COMMENT '备注信息',
   PRIMARY KEY (id)
) COMMENT '数据字典';






/* Create Indexes */

CREATE INDEX sys_resource_parent_id ON sys_resource (parent_id ASC);
CREATE INDEX sys_resource_del_flag ON sys_resource (del_flag ASC);
CREATE INDEX sys_org_parent_id ON sys_org (parent_id ASC);
CREATE INDEX sys_org_del_flag ON sys_org (del_flag ASC);
CREATE INDEX sys_org_type ON sys_org (type ASC);
CREATE INDEX sys_role_del_flag ON sys_role (del_flag ASC);
CREATE INDEX sys_role_enname ON sys_role (enname ASC);
CREATE INDEX sys_user_org_id ON sys_user (org_id ASC);
CREATE INDEX sys_user_username ON sys_user (username ASC);
CREATE INDEX sys_user_update_date ON sys_user (update_date ASC);
CREATE INDEX sys_user_del_flag ON sys_user (del_flag ASC);














