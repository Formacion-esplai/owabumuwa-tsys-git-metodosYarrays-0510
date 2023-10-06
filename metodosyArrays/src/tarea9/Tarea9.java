package tarea9;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tarea9 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("array size please?");

	        
	        int arraySize = scanner.nextInt();

	        ArrayList<Integer> numbers = rellenarArray(arraySize);
	        
	        System.out.println("Here! we're generating an array with randim numbers for youuu " + numbers);
	    	int arrayTotal = 0;
	    	
	    	 for (int num : numbers) {
	    		 arrayTotal += num;
	         }
		        System.out.println("All numbers added together is " + arrayTotal);


	    }

	    public static ArrayList<Integer> rellenarArray(int arraySize) {
	        ArrayList<Integer> numbers = new ArrayList<Integer>();


	        Scanner scanner = new Scanner(System.in);

	       for(int i = 0; i<arraySize; i++) {
		        Random random = new Random();
	            int randomNumber = random.nextInt(10);
	            numbers.add(randomNumber);

	    	   
	       }
	        scanner.close();
	        return numbers;
	    }

}
