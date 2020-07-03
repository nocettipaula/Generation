/*João Papo-de-Pescador,homem de bem,comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um diagrama de blocos que leia a variável P
(peso de peixes) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João
deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO*/ 

programa
{
	
	funcao inicio()
	{
		real peso, excedente, multa
		escreva(" Qual peso do Peixe ")
		leia (peso)

		se (peso >= 50){
			excedente= peso - 50
			multa= excedente * 4
			
			escreva ("\n O peso do Peixe está cima ", peso)
			escreva ("\nDeve pagar uma multa ", multa)
			} 
			senao {
				se (peso <= 50){

				real execedente= 0
				multa= 0
				escreva("\n O peso do peixe está dentro do limite", peso)
				
				}
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 998; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */