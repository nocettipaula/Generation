/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha
 da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado. 
C�digo Condi��o de pagamento 
1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%*/

package PacoteJava;

import java.util.Scanner;

public class Ex1Revisao 
{
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		double valorproduto, contador;
		int menu;
		System.out.println (" Digite o valor do produto ");
		valorproduto = ler.nextDouble();
		
		System.out.printf (" Selecione uma op��o: \n(1) � vista com dinheiro ou cheque \n(2) � vista no cart� de cr�ito \n(3) Em duas vezes, pre�o normal sem juros \n(4) Tr�s vezes, mais juros 10% ");
		menu = ler.nextInt();
		
		switch(menu) 
		{

        case 1:

            contador = valorproduto * 0.20;
            contador = valorproduto - contador;
            System.out.println("Valor a ser pago com 20% de desconto: "+contador );
            break;
        case 2:
            contador = valorproduto * 0.15;
            contador = valorproduto - contador;
            System.out.println("Valor a ser pago com 15% de desconto: " + contador);
            break;
        case 3:
            System.out.println("Valor a ser pago: " + (valorproduto/2) + " reais Duas vezes.");
            break;
        case 4:
            contador = valorproduto * 0.10;
            contador = valorproduto + contador;
            System.out.println("Valor a ser pago: "+ (Math.round(contador/3))+" reais Tres vezes. ");
            break;
        default:
            System.out.println("Op��o Invalida");
            break;

        }
    }

}