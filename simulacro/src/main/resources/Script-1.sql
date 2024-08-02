


show databases;


use proyecto;

create database student;
use student;
create table estudiante(
	id_estudiante int not null auto_increment primary key,
	name varchar(20) not null,
	age int not null
);
show tables;

insert into estudiante (name,age) values('jonathan',24);


select * from estudiante;
create table usuarios(

nombre VARCHAR(50),

correo VARCHAR(40)

);



insert into facturacion values(1,'jonathan',2453655.12)


create table facturacion(

    id_factura INT primary key auto_increment,
	nombre VARCHAR(20) not null,
	precio Decimal(10,2) not null

);

describe facturacion;











