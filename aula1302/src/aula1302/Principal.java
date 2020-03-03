package aula1302;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Professor professor1 = new Professor();
		
		//ENTRADA DE DADOS
		System.out.print("*Nome -> ");
		professor1.nome = teclado.nextLine();
		System.out.print("*Titulação -> ");
		professor1.titulacao = teclado.next();
		System.out.print("*Valor da hora aula -> ");
		professor1.valorHoraAula = teclado.nextDouble();
		System.out.print("*Quantidade total de aulas -> ");
		professor1.totalDeAulas = teclado.nextInt();
		
		
		
		

		teclado.close();

	}

}
