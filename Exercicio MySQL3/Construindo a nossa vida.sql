create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
    id bigint auto_increment,
    categoria varchar(30),
    unidadeEstoque varchar(1),
    primary key (id)
);

create table tb_produto(
    id bigint auto_increment,
    nome varchar(30),
    valor float(5,2),
    estoque int (5),
    garantia varchar(25),
    categoria_id bigint not null,
    primary key (id),
    foreign key(categoria_id) references tb_categoria(id)
);
insert into tb_categoria(categoria, unidadeEstoque) values ("Ferramentas", "A");
insert into tb_categoria(categoria, unidadeEstoque) values ("Material de Construção", "B");
insert into tb_categoria(categoria, unidadeEstoque) values ("Decoração", "C");
insert into tb_categoria(categoria, unidadeEstoque) values ("Elétrica", "A");
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Martelo", 27.99, 2500,"1 ano de fabrica", 1);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Alicate", 23.99, 1500,"1 ano de fabrica", 1);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Chave Fenda", 17.99, 1463,"6 meses de fabrica", 1);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Trena", 53.99, 3300,"1 ano de fabrica", 1);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Tijolo", 15.89, 6000,"1 ano de fabrica", 2);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Areia", 56.89, 5000,"1 mês", 2);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Saco Cimento", 55.00, 8540,"6 meses", 2);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Brita", 57.89, 3845,"3 meses", 2);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Cola", 13.99, 500,"1 ano de fabrica", 2);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Tinta", 37.99, 7563,"1 ano de fabrica", 2);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Cadeira", 89.99, 250,"1 ano de fabrica", 3);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Quadro - Flor", 89.99, 250,"1 ano de fabrica", 3);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Tapete Roxo", 102.99, 250,"1 ano de fabrica", 3);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Vaso de Barro", 57.99, 250,"1 ano de fabrica", 3);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Cabo", 46.99, 465,"1 ano de fabrica", 4);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Tomada", 2.99, 2000,"1 ano de fabrica", 4);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Interruptor", 5.99, 1546,"1 ano de fabrica", 4);
insert into tb_produto(nome, valor, estoque, garantia, categoria_id) 
values ("Lampada", 7.99, 1234,"1 ano de fabrica", 4);

select * from tb_produto;
select * from tb_categoria;
select * from tb_produto where valor > 50;
select * from tb_produto where valor between 3 and 60;
select * from tb_produto where nome like "%c%";
select * from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select tb_produto.nome, tb_produto.estoque, tb_categoria.categoria from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.unidadeEstoque like "%A%";