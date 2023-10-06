package tarea8;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarea8 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = rellenarArray();
        System.out.println("Array values are: " + numbers);
        
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println("El indice de " + number + " es " + i);
            }
    	}

    public static ArrayList<Integer> rellenarArray() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an integer (or 0 to exit):");
            int value = scanner.nextInt();

            if (value == 0) {
                break; 
            }

            numbers.add(value);
        }

        scanner.close();
        return numbers;
    }
}

