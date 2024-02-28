package primeiro_projeto;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		String name,idade;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Qual seu nome: ");
		name = ler.next();
		
		System.out.println("Qual sua idade: ");
		idade = ler.next();
		
		//Saída
		System.out.println(name+ " tem " +idade+ " anos");
		ler.close();
	}

}
