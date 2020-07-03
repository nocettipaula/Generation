/*Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um sistema que calcule seu peso ideal, 
 * utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 (h = altura)

*/

programa
{
	
	funcao inicio()
	{
		real h, pesoideal=0
		inteiro sexo
		escreva (" Digite a sua altura" )
		leia (h)
		escreva ( " Digite 1- Mulher e 2- Homem " )
		leia (sexo)

		se (sexo!= 1 e sexo!= 2)
		{
			escreva (" Código Invalido... " )
		}
		senao
		{
			se (sexo==1)
			{
				pesoideal=(62.1*h)-44.7
				escreva (" Seu peso ideal é de ", pesoideal)
			}
			senao
			{
				pesoideal=(72.7*h)-58

				escreva (" Seu peso ideal é de ", pesoideal )
				
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */