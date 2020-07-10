/*Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
 Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
 */

package PacoteJava;

import java.util.Scanner;

public class Ex6Revisao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[3];
        int [][] matriz = new int[3][3];
        int [][] matriz2 = new int[3][3];

        for(int i =0; i< 3; i++) {
            System.out.println("Informe o valor do vetor [" + (i+1) + "] : ");
            vetor[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Informe o valor da matriz [" +(i+1)+ "] [" + (j+1)+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz2[i][j] = matriz[i][j] * vetor[i];
            }
        }
        System.out.println("\nMatriz multiplicada\n");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("\t" + matriz2[i][j]);
            }
            System.out.println(" ");
        }
    }

}