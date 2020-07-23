create table tb_produto (
    id bigint auto_increment,
    nome varchar(150),
    valor decimal (6, 2),
    prod_disponivel boolean,
    categoria_id bigint,
    
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)     
);