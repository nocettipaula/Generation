/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

package PacoteJava;

public class Ex1Vetor 
{
	public static void main (String args []) 
	{
		int [] a = {1, 0, 5, -2, -5, 7};
		int soma=0, x=0;
		
		System.out.println("\n Valor Inicial de A[] são: 1, 0, 5, -2, -5, 7");

		for  (x = 0; x <= a.length; x++)
		{
			if(a[4]==-5)
			{
				a[4]=100;
			}
		}	
		soma = a[0]+a[1]+a[5];
		System.out.println("\n A soma das posições A[0], A[1] e A[5] é: "+soma);
		
		System.out.println("\nValor de A[0] é: "+a[0]);
		System.out.println("\nValor de A[1] é: "+a[1]);
		System.out.println("\nValor de A[2] é: "+a[2]);
		System.out.println("\nValor de A[3] é: "+a[3]);
		System.out.println("\nValor de A[4] é: "+a[4]);
		System.out.println("\nValor de A[5] é: "+a[5]);
	}
}