/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package PacoteJava;

import java.util.Scanner;

public class Ex3Matriz
{
	public static void main(String args []) 
	{

        Scanner ler = new Scanner (System.in);

        int [][] matriz = new int [3][3];
        int contador = 0;

        for(int i = 0; i < 3; i++) 
        {
            for(int j = 0; j < 3; j++) 
            {
                System.out.println("Informe o valor da matriz na posição [" + (i+1)+ "] [" + (j+1) + "] : ");
                matriz[i][j] = ler.nextInt();

                if (matriz[i][j] > 10 ) 
                {
                    contador++;
                }

            }
        }

        System.out.println("A quantidade de valores maiores que 10 é: " + contador);


    }

}