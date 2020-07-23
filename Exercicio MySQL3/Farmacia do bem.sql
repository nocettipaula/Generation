create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
    idCategoria int(1) auto_increment,
    quantProdutos int(3),
    nomeCategoria varchar(50),
    
    primary key (idCategoria)
);

create table tb_produtos(
id int(1) auto_increment,
nome varchar(60),
valor int(6),
descricao varchar(60),
idCategoria int(1),

primary key (id),
foreign key (idCategoria) references tb_categoria (idCategoria)
);

INSERT INTO tb_categoria (quantProdutos, nomeCategoria) VALUES (20, "Cosmeticos");
INSERT INTO tb_categoria (quantProdutos, nomeCategoria) VALUES (180, "Antibioticos");
INSERT INTO tb_categoria (quantProdutos, nomeCategoria) VALUES (89, "Antiinflamatório");

INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Amoxilina", 50, "Usado para inflamação na garganta", 2);
INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Tetraciclina", 70, "Usado para tratamento contra acne", 2);
INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Ibuprofeno", 10, "Usado para dores corporais", 3);
INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Hidroxocloroquina", 15, "Usado para tratamento da malaria", 3);
INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Epiduo", 90, "Usado para tratamento contra acne", 1);
INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Effaclar duo", 120, "Usado para tratamento contra acne", 1);
INSERT INTO tb_produtos (nome, valor, descricao, idCategoria) VALUES ("Cetaphil pro", 30, "Hidratante para pele oleosa", 1);


select * from tb_produtos where valor < 50;

select * from tb_produtos where valor between 3 and 60;

select * from tb_produtos where nome like '%b%';

select tb_proutos.tb_categotia from tb_produtos p inner join tb_categoria c on p.idCategoria = c.idCategoria;

select p.nome, c.quantProdutos, p.valor, c.nomeCategoria from tb_produtos p inner join tb_categoria c on p.idCategoria = c.idCategoria where c.nomeCategoria = 'Cosmeticos';