/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c, d, pa, pb, pc, pd
	
			escreva (" Digite 4 números ")
			escreva (" Primeiro numero ") 
			leia(a)
			
			escreva ("Segundo numero ")
			leia(b)
			
			escreva ("Terceiro numero ")
			leia(c)
			
			escreva ("Quarto numero ")
			leia(d)
			
			pa= mat.potencia (a,2)
			pb= mat.potencia (b,2)
			pc= mat.potencia (c,2)
			pd= mat.potencia (d,2)

			se(pc >= 1000) {
				escreva (" N° é Maior ou igual a 1000 é", pc)
				}
				senao {
					escreva ("\n O primero Número é", a, "O quadrado do primeiro número é", pa)
					escreva ("\n O segundo Número é", b, "O quadrado do segundo número é", pb)
					escreva ("\n O terceiro Número é", c, "O quadrado do terceiro número é", pc)
					escreva ("\n O quarto Número é", d, "O quadrado do quarto número é", pd)
					}
				}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */