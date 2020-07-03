/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
e se é positivo ou negativo.*/

programa
{
	
	funcao inicio()
	{
		inteiro: numero
		escreva(" Digite um Número ")
		leia (numero)

		se (numero%2==0)
		{
			escreva(" O número ", numero, " é par!")
		}
       senao
       {
       	escreva(" O número ", numero, " é ímpar!")
       }
       se (numero>0){
       	escreva(" o número ",  numero, " é positivo ")
       	}
       	senao {
       		escreva (" o número ", numero, " é negativo ")
       		}

       
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */