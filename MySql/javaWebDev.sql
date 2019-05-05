create database javaWebDev;

use javaWebDev;

create table feedback (name varchar(30), email varchar(30), message varchar(10000), 
regarding int, code varchar(10), rating int);

desc feedback;

insert into feedback values ('David', 'dvid@gmail.com', 'good', 3, 'micro101', 4);

select * from feedback;