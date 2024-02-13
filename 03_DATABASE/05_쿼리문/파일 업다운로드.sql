show variables like 'max_allowed_packet';
show variables like 'secure_file_priv';

create database filedb;
create table filetbl(
file_title varchar(30),
fiel_save LONGBLOB
)default character set=utf8mb4;

use filedb;
insert into filetbl values('SampleDB',LOAD_FILE('C:\\SQL\\updownload_test.zip'));
insert into filetbl values('SampleDB',LOAD_FILE('C:\\SQL\\aaa.zip'));
insert into filetbl values('SampleDB',LOAD_FILE('C:\\SQL\\silhouette-3250536_1280.jpg'));
insert into filetbl values('practiceDB',LOAD_FILE('C:\\SQL\\코리아 IT 자바 20일차.pdf'));
insert into filetbl values('practice2DB',LOAD_FILE('C:\\SQL\\bbb.pdf'));

select * from filetbl;

select fiel_save from filetbl where file_title='practice2DB'
into dumpfile 'c:/sql/down1.pdf';