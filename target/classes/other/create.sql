

drop table if exists sys_user;
CREATE TABLE sys_user
(
	id varchar(64) NOT NULL COMMENT '���',
	org_id varchar(64) NOT NULL COMMENT '��������',
	username varchar(100) NOT NULL COMMENT '��¼��',
	password varchar(100) NOT NULL COMMENT '����',
	salt varchar(10) NOT NULL COMMENT '����ַ���',
	name varchar(100) NOT NULL COMMENT '����',
	email varchar(200) COMMENT '����',
	phone varchar(200) COMMENT '�绰',
	mobile varchar(200) COMMENT '�ֻ�',
	user_type char(1) COMMENT '�û�����',
	photo varchar(1000) COMMENT '�û�ͷ��',
	login_ip varchar(100) COMMENT '����½IP',
	login_date datetime COMMENT '����½ʱ��',
	login_flag varchar(64) COMMENT '�Ƿ�ɵ�¼',
	create_by varchar(64) NOT NULL COMMENT '������',
	create_date datetime NOT NULL COMMENT '����ʱ��',
	update_by varchar(64) NOT NULL COMMENT '������',
	update_date datetime NOT NULL COMMENT '����ʱ��',
	remarks varchar(255) COMMENT '��ע��Ϣ',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT 'ɾ�����',
	PRIMARY KEY (id)
) COMMENT = '�û���';


drop table if exists sys_org;
CREATE TABLE sys_org
(
	id varchar(64) NOT NULL COMMENT '���',
	parent_id varchar(64) NOT NULL COMMENT '�������',
	name varchar(100) NOT NULL COMMENT '����',
	sort decimal(10,0) NOT NULL COMMENT '����',
	area_id varchar(64) NOT NULL COMMENT '��������',
	code varchar(100) COMMENT '�������',
	type char(1) NOT NULL COMMENT '��������',
	grade char(1) NOT NULL COMMENT '�����ȼ�',
	address varchar(255) COMMENT '��ϵ��ַ',
	zip_code varchar(100) COMMENT '��������',
	master varchar(100) COMMENT '������',
	phone varchar(200) COMMENT '�绰',
	fax varchar(200) COMMENT '����',
	email varchar(200) COMMENT '����',
	USEABLE varchar(64) COMMENT '�Ƿ�����',
	PRIMARY_PERSON varchar(64) COMMENT '��������',
	DEPUTY_PERSON varchar(64) COMMENT '��������',
	create_by varchar(64) NOT NULL COMMENT '������',
	create_date datetime NOT NULL COMMENT '����ʱ��',
	update_by varchar(64) NOT NULL COMMENT '������',
	update_date datetime NOT NULL COMMENT '����ʱ��',
	remarks varchar(255) COMMENT '��ע��Ϣ',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT 'ɾ�����',
	PRIMARY KEY (id)
) COMMENT = '������';


drop table if exists sys_resource;
CREATE TABLE sys_resource
(
	id varchar(64) NOT NULL COMMENT '���',
	parent_id varchar(64) NOT NULL COMMENT '�������',
	name varchar(100) NOT NULL COMMENT '����',
	sort decimal(10,0) NOT NULL COMMENT '����',
	url varchar(2000) COMMENT '����',
	target varchar(20) COMMENT 'Ŀ��',
	icon varchar(100) COMMENT 'ͼ��',
	is_show char(1) NOT NULL COMMENT '�Ƿ��ڲ˵�����ʾ',
	permission varchar(200) COMMENT 'Ȩ�ޱ�ʶ',
	create_by varchar(64) NOT NULL COMMENT '������',
	create_date datetime NOT NULL COMMENT '����ʱ��',
	update_by varchar(64) NOT NULL COMMENT '������',
	update_date datetime NOT NULL COMMENT '����ʱ��',
	remarks varchar(255) COMMENT '��ע��Ϣ',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT 'ɾ�����',
	PRIMARY KEY (id)
) COMMENT = '�˵���';


drop table if exists sys_role;
CREATE TABLE sys_role
(
	id varchar(64) NOT NULL COMMENT '���',
	org_id varchar(64) COMMENT '��������',
	name varchar(100) NOT NULL COMMENT '��ɫ����',
	enname varchar(255) COMMENT 'Ӣ������',
	role_type varchar(255) COMMENT '��ɫ����',
	useable varchar(64) COMMENT '�Ƿ����',
	create_by varchar(64) NOT NULL COMMENT '������',
	create_date datetime NOT NULL COMMENT '����ʱ��',
	update_by varchar(64) NOT NULL COMMENT '������',
	update_date datetime NOT NULL COMMENT '����ʱ��',
	remarks varchar(255) COMMENT '��ע��Ϣ',
	del_flag char(1) DEFAULT '0' NOT NULL COMMENT 'ɾ�����',
	PRIMARY KEY (id)
) COMMENT = '��ɫ��';


drop table if exists sys_role_resource;
CREATE TABLE sys_role_resource
(
	id varchar(64) NOT NULL COMMENT '���',
	role_id varchar(64) NOT NULL COMMENT '��ɫ���',
	resource_id varchar(64) NOT NULL COMMENT '�˵����',
	PRIMARY KEY (id)
) COMMENT = '��ɫ-�˵�';


drop table if exists sys_role_org;
CREATE TABLE sys_role_org
(
	id varchar(64) NOT NULL COMMENT '���',
	role_id varchar(64) NOT NULL COMMENT '��ɫ���',
	org_id varchar(64) NOT NULL COMMENT '�������',
	PRIMARY KEY (id)
) COMMENT = '��ɫ-����';


drop table if exists sys_user_role;
CREATE TABLE sys_user_role
(
	id varchar(64) NOT NULL COMMENT '���',
	user_id varchar(64) NOT NULL COMMENT '�û����',
	role_id varchar(64) NOT NULL COMMENT '��ɫ���',
	PRIMARY KEY (id)
) COMMENT = '�û�-��ɫ';


drop table if exists sys_dictionary;
create table sys_dictionary
(
   id                   varchar(64) NOT NULL comment 'id',
   type                 varchar(64) NOT NULL comment '����',
   name                 varchar(255) NOT NULL comment '�ֵ�����',
   value                varchar(255) comment '�ֵ�ֵ',
   remarks varchar(255) COMMENT '��ע��Ϣ',
   PRIMARY KEY (id)
) COMMENT '�����ֵ�';






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














