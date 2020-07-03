/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de
pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
No final do processamento imprimir o salário total e o salário excedente.*/

programa
{
	
	funcao inicio()
	{
		inteiro cod, numhoras
		real E, saltotal, salex

		escreva (" Entre com código do Funcionário: ")
		leia (cod)
		escreva (" Número de Horas Trabalhadas: ")	
		leia (numhoras)

		se (numhoras > 50)
		{
			E= numhoras-50
			salex= E*20
			saltotal= 500+salex

			escreva(" Salário total: " ,saltotal, " e Salário excedente é: " ,salex )		
		}
		senao
		{
			E= 0
			salex= 0
			saltotal= numhoras*10
			escreva (" Salário total: " ,saltotal, " e Salário excedente é: " ,salex )	
			
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */