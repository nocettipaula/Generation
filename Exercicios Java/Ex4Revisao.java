/*Faça um programa em C que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50*/

package PacoteJava;

import java.util.Scanner;

public class Ex4Revisao 
{
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		double soma=0;
		int x=1, y=1,a;
		
		 for(a= 1; a<= 99; a++) 
		 {
	            soma= soma + x/y;
	            x+=2;
	            y++;
	            
	     }
		 	
	        System.out.println("\n Resultado da soma: " +soma);
	}
}
