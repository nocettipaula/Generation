/* Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e
o resultado da adição da constante deve ser armazenado na própria matriz.*/


package PacoteJava;

import java.util.Scanner;

public class Ex4Matriz
{
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		float [] [] matriz1 = new float [2][2];
		float [] [] matriz2 = new float [2][2];
		float [] [] matrizSoma = new float [2][2];
		float [][] matrizSubtracao = new float [2][2];
		int l, c=0, opcao;
		final int constante;
		
		// matriz 1
		for (l=0; l<matriz1.length; l++)
		{
 			for (c=0; c<matriz1.length; c++) 
 				{
 				System.out.println("Entre com os dados da primeira matriz: "); 
 				matriz1[l][c] = ler.nextFloat();
 				
 				}
		}
		
		//matriz 2
		for (l=0; l<matriz2.length; l++)
		{
 			for (c=0; c<matriz2.length; c++) 
 				{
 				System.out.println("Entre com os dados da segunda matriz: "); 
 				matriz2[l][c] = ler.nextFloat();
 				
 				}
		}
		
		System.out.println("Selecione uma opção: \n(1) para soma \n(2) subtração \n(3) adição de const \n(4) imprima o resultado");
		opcao = ler.nextInt();
		

		
		switch(opcao) 
		{
		case 1: 
			for (l=0; l<matrizSoma.length; l++)
			{
	 			for (c=0; c<matrizSoma.length; c++) 
	 				{
	 				matrizSoma[l][c] = matriz1[l][c] + matriz2[l][c];
	 				System.out.println("A soma das matrizes resulta em: " +matrizSoma[l][c]);
	 				}	
			}
			break;
		case 2:
			for (l=0; l<matrizSoma.length; l++)
			{
	 			for (c=0; c<matrizSoma.length; c++) 
	 				{
	 				matrizSubtracao[l][c] = matriz1[l][c] - matriz2[l][c];
	 				System.out.println("A diferença das matrizes resulta em: " +matrizSubtracao[l][c]);
	 				}	
			}
			break;
		case 3: 
		{
			System.out.println("Entre com o valor da constante: "); //usuário entra com o valor 
			constante = ler.nextInt();
			
			for (l=0; l<matriz1.length; l++)
			{
	 			for (c=0; c<matriz1.length; c++) 
	 				{
	 				matriz1[l][c] = matriz1[l][c] + constante;
	 				System.out.println("A soma das matrizes resulta em: " +matriz1[l][c]);
	 				}	
			}
		
			for (l=0; l<matriz2.length; l++)
			{
	 			for (c=0; c<matriz2.length; c++) 
	 			{
	 				matriz2[l][c] = matriz2[l][c] + constante;
	 				System.out.println("A soma das matrizes resulta em: " +matriz2[l][c]);
	 			}	
			}
		}
		break;
		case 4:
			for (l=0; l<matriz1.length; l++)
			{
	 			for (c=0; c<matriz1.length; c++) 
	 				{
	 				System.out.println("A impressão das matrizes é: " + matriz1[l][c]);
	 				
	 				}
			}
			
			//matriz 2
			for (l=0; l<matriz2.length; l++)
			{
	 			for (c=0; c<matriz2.length; c++) 
	 				{
	 				System.out.println("A impressão das matrizes é: " + matriz2[l][c]);
	 				
	 				}
			}
			break;
		default:
			System.out.println("Opção inválida...");
		}	
}

}