/*Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

package PacoteJava;

public class Ex1Vetor 
{
	public static void main (String args []) 
	{
		int [] a = {1, 0, 5, -2, -5, 7};
		int soma=0, x=0;
		
		System.out.println("\n Valor Inicial de A[] s�o: 1, 0, 5, -2, -5, 7");

		for  (x = 0; x <= a.length; x++)
		{
			if(a[4]==-5)
			{
				a[4]=100;
			}
		}	
		soma = a[0]+a[1]+a[5];
		System.out.println("\n A soma das posi��es A[0], A[1] e A[5] �: "+soma);
		
		System.out.println("\nValor de A[0] �: "+a[0]);
		System.out.println("\nValor de A[1] �: "+a[1]);
		System.out.println("\nValor de A[2] �: "+a[2]);
		System.out.println("\nValor de A[3] �: "+a[3]);
		System.out.println("\nValor de A[4] �: "+a[4]);
		System.out.println("\nValor de A[5] �: "+a[5]);
	}
}