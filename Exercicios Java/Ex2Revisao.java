/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa
 adulta. A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso*/


package PacoteJava;

import java.util.Scanner;

public class Ex2Revisao 
{
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		double  peso, altura,imc;
		
		System.out.println (" Digite seu peso: ");
		peso = ler.nextDouble();
		System.out.println (" Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc= (peso/(altura*altura));
		
		 if (imc < 18.5) 
		 {
	            System.out.println("Abaixo do peso");
	     }
		 else if (imc < 25)
		 {
	            System.out.println("Peso normal");
		 }
		 else if (imc < 30)
		 {
	            System.out.println("Acima do peso");
	     }else
	     {
	            System.out.println("Obeso");
	     }		
	}
} 
