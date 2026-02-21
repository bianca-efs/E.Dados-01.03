package view;
import controller.Metodos;

public class Main {
	public static void main (String args [ ]) {
		
		int num = Metodos.requirement();
		
		int result = Metodos.fatorial(num);
		System.out.printf("fatorial de %d = %d", num, result);
	}
}
