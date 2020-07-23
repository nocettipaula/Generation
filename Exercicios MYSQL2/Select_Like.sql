select 	tb_produto.nome, 
	tb_produto.valor,
        tb_categoria.nome
	from tb_produto
Inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where  tb_produto.nome Like "%c%";