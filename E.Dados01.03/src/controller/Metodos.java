package controller;
import java.util.Scanner;

public class Metodos {
	static Scanner sc = new Scanner (System.in);

	
	//Função que valida o número inserido
	
	public static int requirement () {
		System.out.println("Digite um número positivo menor ou igual a 12: ");
		int num = sc.nextInt();
		
		
		//Evitando números negativos e evitar estouro de pilha (StackOverflow)
		
		if (num > 12 || num < 0) {
			System.out.println("O número deve ser positivo e menor ou igual a 12! ");
			return requirement();
		}
		else {
			System.out.printf("Vamos calcular o fatorial de %d! \n", num);
			return num;
		}
	}
	
	public static int fatorial (int num) {
		
		
		// Condição de parada: quando a variável num for 0 ou 1 o fatorial é 1
		// Isso evita que  a recursão continue infinitamente
		
		if (num == 0 || num == 1) {
			return 1;
		}
		
		
		// O fatorial de num é calculado multiplicando a variável pelo fatorial do número anterior
		// n! = n * (n - 1)!
		
		else {
			return num * fatorial(num - 1);		}		
	}
	
}
