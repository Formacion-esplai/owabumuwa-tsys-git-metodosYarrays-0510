package tarea4;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Tarea4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular su factorial");
		
		int number = scanner.nextInt();
		scanner.close();
		if(number == 0 || number < 0) {
			System.out.println("El numero no puede tener factorial");
		}
		else {
			int getFactorial =  getFactorial(number);
			
			System.out.println("La factorial de " + number + " es " + getFactorial);
		}
			
		

	}
	
	public static int getFactorial(int num) {
		int factorial_value = 1;
		
		for(int i = 1; i<=num; i++) {
			factorial_value *= i;

		}
		return factorial_value;

	}


}

