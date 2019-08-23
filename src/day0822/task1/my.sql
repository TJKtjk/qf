use test;
desc bg;
--
#
/*
 */

#查看表
show tables;
#查看表结构
desc bg;
#修改
alter table bg
    add address varchar(20);
alter table bg
    modify address char(10);

# alter table bg drop phone;

rename table bg to bg;

ALTER TABLE bg
    CHANGE name username varchar(100);

select *
from bg;

insert into bg()
values ('3', 'wang', 'fuzhou');

update bg
set home='guangzhou'
where name = 'lisi';

update bg
set home='guangzhou',
    address='nanning'
where id = '2';


update bg
set id=id + '3';

#删除操作 DELETE FROM 表名 【WHERE 列名=值】
#delete from bg where address='';


select *
from test.bg
where id > 4;

select *
from test.bg
where id in (4, 5);


select *
from test.bg
where id between 3 and 5;


use test;

CREATE TABLE stu
(
    sid    CHAR(6),
    sname  VARCHAR(50),
    age    INT,
    gender VARCHAR(50)
);
INSERT INTO stu
VALUES ('S_1001', 'liuYi', 35, 'male');
INSERT INTO stu
VALUES ('S_1002', 'chenEr', 15, 'female');
INSERT INTO stu
VALUES ('S_1003', 'zhangSan', 95, 'male');
INSERT INTO stu
VALUES ('S_1004', 'liSi', 65, 'female');
INSERT INTO stu
VALUES ('S_1005', 'wangWu', 55, 'male');
INSERT INTO stu
VALUES ('S_1006', 'zhaoLiu', 75, 'female');
INSERT INTO stu
VALUES ('S_1007', 'sunQi', 25, 'male');
INSERT INTO stu
VALUES ('S_1008', 'zhouBa', 45, 'female');
INSERT INTO stu
VALUES ('S_1009', 'wuJiu', 85, 'male');
INSERT INTO stu
VALUES ('S_1010', 'zhengShi', 5, 'female');
INSERT INTO stu
VALUES ('S_1011', 'xxx', NULL, NULL);


select *
from stu
where age > 15;


select *
from stu
where age in (12, 14, 35, 46);

# 模糊查询  wang%  % 后面匹配多个字符 ，_表示一个字符
select *
from stu
where sname like '___g__';


# 去重查询
select distinct age
from stu;


# 列 起 别名

select sid + sname as idname
from stu;


# 排序
select *
from stu
order by age;


# 二次排序，年龄相等，按照姓名排序

select *
from stu
order by age asc, sname desc;

# 聚合 函数
/*
COUNT()：统计指定列不为NULL的记录行数；
MAX()：计算指定列的最大值，如果指定列是字符串类型，那么使用字符串排序运算；
MIN()：计算指定列的最小值，如果指定列是字符串类型，那么使用字符串排序运算；
SUM()：计算指定列的数值和，如果指定列类型不是数值类型，那么计算结果为0；
AVG()：计算指定列的平均值，如果指定列类型不是数值类型，那么计算结果为0；
*/

# 记录数量 统计
# 一般不用 COUNT（列名） 统计，列名有NULL的 不会统计
select COUNT(*) as clount
from stu;


# 统计age 不为空的 行数
select COUNT(age) as clount
from stu;


# 对 字段整列 求和
select SUM(age) as sunAge
from stu;

#  列age 年龄 的最小最大值
select MIN(age) as minAge
from stu;

select avg(age) as avgAge
from stu;


# 分组查询 基于聚合函数 对 某列 或几列 分组查询
#  对gender 分组，则 gender 放在 聚合函数前面
select gender, avg(age)
from stu
GROUP by gender;


# 对分组的结果过滤，留下 平均age大于20的
select gender, avg(age) as avgAGE
from stu
GROUP by gender
having avgAGE>20
order by avgAGE desc ;


#  查询  0 开始，5为数量
select *
from stu
limit 0,2;

# 窗口函数 比分组函数更好  Mysql 8.0才有






