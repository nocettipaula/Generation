/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha
 da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

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
		
		System.out.printf (" Selecione uma opção: \n(1) À vista com dinheiro ou cheque \n(2) À vista no cartã de créito \n(3) Em duas vezes, preço normal sem juros \n(4) Três vezes, mais juros 10% ");
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
            System.out.println("Opção Invalida");
            break;

        }
    }

}