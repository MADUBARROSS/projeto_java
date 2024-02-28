package primeiro_projeto;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		double horatrab,valorhora,salbruto,salliquido,inss;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("quantas horas você trabalhou?: ");
		horatrab = ler.nextDouble();
		
		System.out.println("Quanto vale cada hora: ");
		valorhora = ler.nextDouble();
		
		
		//Processamento
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquido = salbruto-inss;
		//Saída
		System.out.println("O valor do salario liquido é: " +salliquido+ "O valor do salario bruto é: " +salbruto );
		ler.close();

	}

}
