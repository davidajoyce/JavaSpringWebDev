create database javaWebDev;

use javaWebDev;

create table feedback (name varchar(30), email varchar(30), message varchar(10000), 
regarding int, code varchar(10), rating int);

desc feedback;

insert into feedback values ('David', 'dvid@gmail.com', 'good', 3, 'micro101', 4);

select * from feedback;

create table Feedback (name varchar(30), email varchar(30), message varchar(10000), 
regarding varchar(30), code varchar(10), rating int);

drop table Feedback
drop table feedback

use javaWebDev;
select * from Feedback

drop table Feedback

-- match the column names with the keys used in the html in Feedback.jsp
create table Feedback (name varchar(30), email varchar(30), msg varchar(10000), 
reg varchar(30), code varchar(10), rating int);


use javaWebDev;
select * from Feedback