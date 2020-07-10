/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro.
 Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
 Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
 */

package PacoteJava;

import java.util.Scanner;

public class Ex5Revisao
{
	public static void main (String args []) 
	{
		Scanner ler = new Scanner (System.in);
		float [] numero = new float [5];
		int codigo;
		
		for (int x=0; x<5;x++)
		{
			System.out.println (" Entre com um valor para o vetor: ");
			numero [x] = ler.nextFloat();
		}
		System.out.println (" Entre com o código: ");
		codigo = ler.nextInt();
		if (codigo==0)
		{
			System.out.println (" Vazaaaaaaaa... ");
		}
		else if (codigo==1)
		{
			for (int x=0; x<5;x++)
			{
				System.out.println (" Posição "+(x+1)+" : "+numero[x]);
			}
		}
			else if (codigo==2)
			{
				for (int x=4; x>0;x--)
				{
					System.out.println (" Posição "+(x)+" : "+numero[x]);
				}
			}
			else 
			{
				System.out.println (" Código inválido...");
			}
	}
}
	