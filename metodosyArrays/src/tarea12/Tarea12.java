package tarea12;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tarea12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int arraySize = scanner.nextInt();

        System.out.println("Enter the ending digit you want to filter by:");
        int endingDigit = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> filteredNumbers = rellenarArray(arraySize, endingDigit);

        System.out.println("Here! We're generating an array with random numbers ending in " + endingDigit + ": " + filteredNumbers);

        if (filteredNumbers.size() == 0) {
            System.out.println("No numbers ending in " + endingDigit + " found in the array.");
        }
    }

    public static ArrayList<Integer> rellenarArray(int arraySize, int endingDigit) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < arraySize; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(300);
            numbers.add(randomNumber);
        }

        ArrayList<Integer> filteredNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 10 == endingDigit) {
                filteredNumbers.add(number);
            }
        }

        return filteredNumbers;
    }
}
