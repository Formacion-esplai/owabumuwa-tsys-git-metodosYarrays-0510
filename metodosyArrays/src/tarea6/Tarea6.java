package tarea6;
import java.util.Scanner;
import java.lang.StringBuilder;


public class Tarea6 {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Introduce un numero para calcular ekl numero de cifra");
			
			int number = scanner.nextInt();
			scanner.close();
			
			int numeroDeCifras = numeroDeCifras(number);
			System.out.println("El numero de cifras de " + number + " es " + numeroDeCifras);

		}
		
		public static int numeroDeCifras(int num) {
			String num_to_string = String.valueOf(num);
			return num_to_string.length();
		

		}


}