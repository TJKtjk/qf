# 创建
create database studentdb character set gbk;
#查看
show databases;
# 修改
alter database studentdb character set utf8;
# 查看编码
Show variables like 'character%';
# 删除
drop database studentdb;

use studentdb;

# 创建表
create table student
(
    id    varchar(20) not null,
    name  varchar(20),
    age   int,
    phone varchar(20)
);

# 添加字段
alter table student
    add address varchar(50);

# 修改字段 类型长度
alter table student
    modify address char(30);
# 修改字段类型
alter table student
    modify address varchar(30);

# 字段重命名
alter table student
    change address stu_address varchar(50);

# 字段重命名
alter table student
    change phone gender varchar(10);

# 查看表
desc student;

# 2 DML
insert into student
values (001, '小明', 10, 'M', '上海'),
       (002, '小红', 23, 'F', '北京'),
       (003, '小虹', 16, 'F', '深圳'),
       (004, '小军', 12, 'M', '上海'),
       (005, '大明', 14, 'M', '上海'),
       (006, '李明', 16, 'M', '深圳'),
       (007, '小李', 22, 'F', '上海'),
       (008, '小王', 12, 'M', '北海');

# 把深圳校区的同学的sname加上前缀qf
update student set name=concat('qf',name) where address = '深圳' ;

# 删除 年龄大于20 且不再上海的学生
delete from student where age> 20 and address not in('上海');

# 1.查询所有学生的ID,姓名显示出来
# 2 查询性别为女，并且年龄小于50的记录
# 3 查询学号为S_1001，或者姓名为liSi的记录
# 5 查询学号不是S_1001，S_1002，S_1003的记录
# 6 查询年龄为null的记录
# 7 查询年龄在20到40之间的学生记录
# 8 查询性别非男的学生记录
# 9 查询姓名不为null的学生记
# 10 找出男女同学中的年龄最大值
# 11 查询年龄大于18,并且用年龄,性别分组,找出分组后学生年龄的平均值
# 12 找出姓名中包含了s的前5条记录的值
select id,name from student;

select  * from student where student.gender='F' and age<50;

select  * from student where student.id='S_1001' or name='lisi';

select  * from student where student.id not in('S_1001','S_1002','S_1003');

select * from student where age is null;

select * from student where age between 20 and 40;

select * from student where student.gender  not in('M') ;

select * from student where name is not null;

select student.gender,MAX(age) from student group by student.gender;


select student.age,avg(age) from student where age>18 group by student.age,student.gender;

select * from student where name like '%s%' limit 5;



# 窗口函数 查询
SELECT id, SUM( age) OVER (PARTITION BY  id)  sumAge from student;












