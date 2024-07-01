create database oganispring;
use oganispring;

create table category
(
	categoryid int primary key not null auto_increment,
    categoryname varchar(255) not null
);
create table product
(
	producid int not null primary key auto_increment,
	producid int not null primary key auto_increment,
    productname varchar(255) not null,
    price double not null,
    description text not null,
    quantity int not null,
    weight varchar(255) not null,
    image varchar(255) not null,
    updates date not null,
    categoryid int,
    foreign key (categoryid) references category(categoryid)
);

create table checkout
(
	checkoutid int primary key not null auto_increment,
	fristname varchar(30) not null,
    lastname varchar(50) not null,
    email varchar(100) not null,
    address varchar(255) not null,
    phone varchar(10) not null,
    note text default null,
    quantity int,
	total double
);
create table checkoutdetail
(
	id int not null auto_increment primary key,
    productid int,
    checkoutid int,
    quantity int not null,
    total double not null,
    foreign key (productid) references product(producid),
    foreign key (checkoutid) references checkout(checkoutid)
);

create table blogtag
(
	tagid int not null primary key,
    tagname varchar(255) not null
);
create table blog
(
	blogid int not null primary key,
    content text not null,
    createdate date not null,
    title text not null,
    description text not null,
    image text not null,
    tagid int,
    foreign key (tagid) references blogtag(tagid)
);
create table users
(
	userid int auto_increment primary key not null,
    fristname varchar(30) default null,
    lastname varchar(50) default null,
    email varchar(100) default null,
    address varchar(255) default null,
    phone varchar(10) default null,
    password varchar(20) not null,
    username varchar(20) not null
);

ALTER TABLE users MODIFY COLUMN password VARCHAR(255);
drop table product;
drop table users;
drop table checkout;
drop table checkoutdetail;
drop table orders;
drop table roles;
drop table user_role;
alter table product
add column sale double;