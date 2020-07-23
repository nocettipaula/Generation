create table tb_personagem(
id int(3) auto_increment,
nome varchar(255),
pontosVida int(3),
danoAtaque int(3),
danoHabilidade int(3),
classeId int(3),

primary key (id),

foreign key (classeId) references tb_Classe (Id)

);