drop table "menu" cascade constraints;

drop table "menu_permission_relation" cascade constraints;

drop table "operation" cascade constraints;

drop table "operation_permission_relation" cascade constraints;

drop table "permission" cascade constraints;

drop table "role" cascade constraints;

drop table "role_permission_relation" cascade constraints;

drop table "user" cascade constraints;

drop table "user_role_relation" cascade constraints;

/*==============================================================*/
/* Table: "menu"                                                */
/*==============================================================*/
create table "menu"
(
   "id"                 char(38)             not null,
   "menu_name"          VARCHAR(100),
   "parent_id"          char(38),
   "url"                VARCHAR(1000),
   "menu_description"   VARCHAR(1000),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_MENU primary key ("id")
);

comment on table "menu" is
'菜单表';

comment on column "menu"."id" is
'权限id';

comment on column "menu"."menu_name" is
'权限名称';

comment on column "menu"."parent_id" is
'父菜单ID';

comment on column "menu"."url" is
'URL';

comment on column "menu"."menu_description" is
'权限描述';

comment on column "menu"."gmt_create_time" is
'创建时间';

comment on column "menu"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "menu_permission_relation"                            */
/*==============================================================*/
create table "menu_permission_relation"
(
   "id"                 char(38)             not null,
   "permission_id"      char(38),
   "menu_id"            char(38),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_MENU_PERMISSION_RELATION primary key ("id")
);

comment on table "menu_permission_relation" is
'菜单权限关联 表';

comment on column "menu_permission_relation"."id" is
'关联关系id';

comment on column "menu_permission_relation"."permission_id" is
'权限ID';

comment on column "menu_permission_relation"."menu_id" is
'角色ID';

comment on column "menu_permission_relation"."gmt_create_time" is
'创建时间';

comment on column "menu_permission_relation"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "operation"                                           */
/*==============================================================*/
create table "operation"
(
   "id"                 char(38)             not null,
   "operation_name"     VARCHAR(100),
   "parent_id"          char(38),
   "url"                VARCHAR(1000),
   "code"               VARCHAR(100),
   "operation_description" VARCHAR(1000),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_OPERATION primary key ("id")
);

comment on table "operation" is
'功能操作表';

comment on column "operation"."id" is
'权限id';

comment on column "operation"."operation_name" is
'权限名称';

comment on column "operation"."parent_id" is
'父菜单ID';

comment on column "operation"."url" is
'URL';

comment on column "operation"."code" is
'操作编码';

comment on column "operation"."operation_description" is
'权限描述';

comment on column "operation"."gmt_create_time" is
'创建时间';

comment on column "operation"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "operation_permission_relation"                       */
/*==============================================================*/
create table "operation_permission_relation"
(
   "id"                 char(38)             not null,
   "permission_id"      char(38),
   "operation_id"       char(38),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_OPERATION_PERMISSION_RELATI primary key ("id")
);

comment on table "operation_permission_relation" is
'操作权限关联表';

comment on column "operation_permission_relation"."id" is
'关联关系id';

comment on column "operation_permission_relation"."permission_id" is
'权限ID';

comment on column "operation_permission_relation"."operation_id" is
'角色ID';

comment on column "operation_permission_relation"."gmt_create_time" is
'创建时间';

comment on column "operation_permission_relation"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "permission"                                          */
/*==============================================================*/
create table "permission"
(
   "id"                 char(38)             not null,
   "permission_name"    VARCHAR(100),
   "permission_type"    char(38),
   "permission_description" VARCHAR(1000),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_PERMISSION primary key ("id")
);

comment on table "permission" is
'权限表';

comment on column "permission"."id" is
'权限id';

comment on column "permission"."permission_name" is
'权限名称';

comment on column "permission"."permission_type" is
'权限类别(菜单、按钮、操作、菜单操作)';

comment on column "permission"."permission_description" is
'权限描述';

comment on column "permission"."gmt_create_time" is
'创建时间';

comment on column "permission"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "role"                                                */
/*==============================================================*/
create table "role"
(
   "id"                 char(38)             not null,
   "role_name"          VARCHAR(100),
   "parent_id"          char(38),
   "role_description"   VARCHAR(1000),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_ROLE primary key ("id")
);

comment on table "role" is
'角色表';

comment on column "role"."id" is
'角色ID';

comment on column "role"."role_name" is
'角色名';

comment on column "role"."parent_id" is
'父角色ID';

comment on column "role"."role_description" is
'角色描述';

comment on column "role"."gmt_create_time" is
'创建时间';

comment on column "role"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "role_permission_relation"                            */
/*==============================================================*/
create table "role_permission_relation"
(
   "id"                 char(38)             not null,
   "permission_id"      char(38),
   "role_id"            char(38),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_ROLE_PERMISSION_RELATION primary key ("id")
);

comment on table "role_permission_relation" is
'角色权限关系表';

comment on column "role_permission_relation"."id" is
'关联关系id';

comment on column "role_permission_relation"."permission_id" is
'权限ID';

comment on column "role_permission_relation"."role_id" is
'角色ID';

comment on column "role_permission_relation"."gmt_create_time" is
'创建时间';

comment on column "role_permission_relation"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "user"                                                */
/*==============================================================*/
create table "user"
(
   "id"                 char(38)             not null,
   "user_name"          VARCHAR(50),
   "login_name"         VARCHAR(50),
   "password"           VARCHAR(20),
   "phone"              VARCHAR(20),
   "mail"               VARCHAR(100),
   "gmt_create_time"    TIMESTAMP,
   "last_login_time"    TIMESTAMP,
   "locked"             CHAR(1),
   "gmt_update_time"    TIMESTAMP,
   constraint PK_USER primary key ("id")
);

comment on table "user" is
'系统用户表';

comment on column "user"."id" is
'用户ID';

comment on column "user"."user_name" is
'用户姓名';

comment on column "user"."login_name" is
'登陆账号';

comment on column "user"."password" is
'登陆密码';

comment on column "user"."phone" is
'手机号';

comment on column "user"."mail" is
'邮箱';

comment on column "user"."gmt_create_time" is
'创建时间';

comment on column "user"."last_login_time" is
'最后登陆时间';

comment on column "user"."locked" is
'锁定状态 0：未锁定 1：锁定';

comment on column "user"."gmt_update_time" is
'更新时间';

/*==============================================================*/
/* Table: "user_role_relation"                                  */
/*==============================================================*/
create table "user_role_relation"
(
   "id"                 char(38)             not null,
   "user_id"            char(38),
   "role_id"            char(38),
   "gmt_create_time"    TIMESTAMP,
   "gmt_update_time"    TIMESTAMP,
   constraint PK_USER_ROLE_RELATION primary key ("id")
);

comment on table "user_role_relation" is
'用户角色关联表';

comment on column "user_role_relation"."id" is
'关联关系id';

comment on column "user_role_relation"."user_id" is
'用户ID';

comment on column "user_role_relation"."role_id" is
'角色ID';

comment on column "user_role_relation"."gmt_create_time" is
'创建时间';

comment on column "user_role_relation"."gmt_update_time" is
'更新时间';
