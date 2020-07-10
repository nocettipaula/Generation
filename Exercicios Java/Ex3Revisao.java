/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos
seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.*/

package PacoteJava;

import java.util.Scanner;

public class Ex3Revisao 
{
	public static void main (String args []) 
	{
		Scanner ler = new Scanner (System.in);
		int numero, cont1=0, cont2=0, cont3=0, cont4=0;
		
		System.out.println (" Digite um número: ");
		numero = ler.nextInt ();
		
		while(numero <= 100)
        {

                if (numero >= 0 && numero <= 25)
                {
                    cont1++;
                }
                else if (numero >= 26 && numero <= 50)
                {
                    cont2++;
                }
                else if (numero >= 51 && numero <= 75)
                {
                    cont3++;
                }
                else if (numero >= 76 && numero <= 100)
                {
                    cont4++;
                }
            
        }

        System.out.printf ("A quantidade de números entre [0 - 25] é: ", + cont1, "entre votos [25-50] é: ", cont2, "entre votos [51-75] é: ", cont3,"entre votos [76-100] é: ", cont4);		
	}
}
