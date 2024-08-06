create database rigobeli;

use rigobeli;

create table pessoa (
	id_pessoa int not null primary key,
	nome varchar(100) not null,
	cpf_cnpj varchar(50),
	rg varchar(50),
	dt_nascimento date
);

insert into pessoa (id_pessoa,nome,cpf_cnpj,rg,dt_nascimento) values (10,'Cleison','000.000.000-29','00.000.000-6','1997-06-21');

select * from pessoa;