package tarea5;
import java.util.Scanner;
import java.lang.StringBuilder;


public class Tarea5 {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Introduce un numero para calcular su binario");
			
			int number = scanner.nextInt();
			
			String showBinary = showBinary(number);
			System.out.println(showBinary);
			scanner.close();
			

		}
		
		public static String showBinary(int num) {
			String binary_value = Integer.toBinaryString(num);
			
			
			return binary_value;

		}


}

