package tarea2;
import java.util.Scanner;
import java.util.Random;


public class Tarea2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
		
		System.out.println("Introduce el valor minimo");		
		int minimum = scanner.nextInt();
		
		System.out.println("Introduce el valor maximo");		
		int maximum = scanner.nextInt();
		
		for(int i=minimum; i<=maximum; i++) {
			int random_numbers = random.nextInt((maximum - minimum) + 1) ;
			System.out.println(random_numbers);		

		}
        scanner.close();	

	}

}
