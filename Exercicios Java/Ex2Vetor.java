/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

package PacoteJava;

import java.util.Scanner;

public class Ex2Vetor 
{
	public static void main (String args []) 
	{
		Scanner ler = new Scanner (System.in);
		int [] numero = new int [6];
		int somapar= 0, contimpar=0,x;
		
		for (x=0; x<6; x++) 
		{
			System.out.println("\n Digite um n�mero: ");
			numero [x] = ler.nextInt();
			if (numero [x]%2==0)
			{
				System.out.println ("\n N�mero par: " +numero[x]);
				somapar =  somapar + numero [x];
				
			}
			else 
			{
				System.out.println ("\n N�mero impar: " +numero[x]);
				contimpar++; 
			}
			
		}
		System.out.println (" O Somat�ro dos n�meros pares: " +somapar);
		System.out.println (" O Somat�ro dos n�meros impares: " +contimpar);
	}
}
