##数据库表结构
```sql
drop table if exists sys_user;

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   id                   bigint not null AUTO_INCREMENT,
   login_name           varchar(20) NOT NULL DEFAULT '' comment '登录名',
   nick_name            varchar(20) comment '昵称',
   login_type           smallint comment '登录类型',
   password             varchar(32) comment '密码',
   email                varchar(20) comment '邮箱',
   phone                varchar(20) comment '电话',
   login_ip             varchar(64) comment '登录IP',
   login_date           datetime comment '登录日期',
   login_flag           tinyint comment '是否可登录0是,1否',
   create_by            bigint comment '创建人ID',
   create_date          datetime comment '创建日期',
   update_by            bigint comment '修改人ID',
   update_date          datetime comment '修改日期',
   primary key (id),
   KEY login_name_idx (login_name) USING  BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统用户表' ;

```