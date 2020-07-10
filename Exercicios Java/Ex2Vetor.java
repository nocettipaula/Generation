/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

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
			System.out.println("\n Digite um número: ");
			numero [x] = ler.nextInt();
			if (numero [x]%2==0)
			{
				System.out.println ("\n Número par: " +numero[x]);
				somapar =  somapar + numero [x];
				
			}
			else 
			{
				System.out.println ("\n Número impar: " +numero[x]);
				contimpar++; 
			}
			
		}
		System.out.println (" O Somatóro dos números pares: " +somapar);
		System.out.println (" O Somatóro dos números impares: " +contimpar);
	}
}
