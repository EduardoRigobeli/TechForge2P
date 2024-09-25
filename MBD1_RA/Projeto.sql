create database o_reino_de_oswald;
use o_reino_de_oswald;

/*Contera os itens
 * Fazer FK de itens com save e inventario*/
create table itens (
	id_item int not null primary key,
	itens varchar(300),
	id_cena int,
	foreign key (id_cena) references cenas (id_cena)
);
select * from itens;
insert into itens (id_item,itens,id_cena) values (8,"Livro",4);
where itens like '%Mapa%';


/*Contera os itens do invetario e aparecerá a msg ao coletar o item*/
create table inventario (
	id_inventario int not null primary key,
	inventario varchar (100),
	id_save int,
	id_item int,
	foreign key (id_save) references save (id_save),
	foreign key (id_item) references itens (id_item)
);
select * from inventario;



/*Contera os Saves atuais*/
create table save (
	id_save int not null primary key,
	save_atual varchar (900),
	id_cena int,
	foreign key (id_cena) references cenas (id_cena)
);



create table cenas (
	id_cena int not null primary key,
	cenas varchar (900)
);
select * from cenas;
insert into cenas (id_cena,cenas) 
values (2,"O esqueleto vasculha a casa ao redor e encontra um porão antigo que contém uma pequena biblioteca, diversos livros empoeirados e ratos aos redores dos livros. Em um canto da biblioteca, bem escondido, um livro ele encontra no alto de uma prateleira. Com sua curiosidade ele pega o livro e começa a ler. Ao abrir o grimório, ele fica espantado com as páginas que ia passando, alguns feitiços que exigia sacrifícios vivos. Passa-se um tempo vendo o livro, ele escuta algo caindo dentro da casa. O esqueleto vai olhar e, em silêncio, avista um fantasma que parecia estar procurando alguém na casa, então Oswald olha ao seu redor e avista uma ESPADA, pode ser que o grimório seja útil contra o fantasma…");




/*Apagar as tabelas ou database*/
drop table itens;
select * from cenas;

delete from cenas where id_cena = 2;

/*adicionar colunas nas tabelas*/
alter table comandos add descricao varchar (300);