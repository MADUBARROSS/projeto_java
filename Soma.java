package primeiro_projeto;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		double a,b,som;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Qual seu nome: ");
		a = ler.nextDouble();
		
		System.out.println("Qual sua idade: ");
		b = ler.nextDouble();
		
		//Processamento
		som = a+b;
		//Saída
		System.out.println(": " + som);
		ler.close();
	} 

}
