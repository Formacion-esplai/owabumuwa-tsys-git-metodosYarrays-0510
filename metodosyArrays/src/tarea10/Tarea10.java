package tarea10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tarea10 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("array size please?");
	        
	        int arraySize = scanner.nextInt();
	        
	        System.out.println("Wruite the number before the range you want");
	        int arrayValuesRange = scanner.nextInt();

	        ArrayList<Integer> primeNumbers = rellenarArray(arraySize, arrayValuesRange);
	        
	    
	      
			System.out.println("Here! we're generating an array with randim prime numbers for youuu " + primeNumbers);
			
			int maxValue = Collections.max(primeNumbers);
			System.out.print("Max value is " + maxValue);
	        
	        scanner.close();


	    }

	    public static ArrayList<Integer> rellenarArray(int arraySize, int arrayValuesRange) {
	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();



	        Scanner scanner = new Scanner(System.in);

	       for(int i = 0; i<arraySize; i++) {
		        Random random = new Random();
	            int randomNumbers = random.nextInt(arrayValuesRange);
	            
	            
	        	numbers.add(randomNumbers);			        

	    	   
	       }
	        for (int number : numbers) {
	            boolean isItPrime = isItPrime(number);
	            if (isItPrime) {
	                primeNumbers.add(number);
	            }
	        }
	        return primeNumbers;
	    }
	    
	    
	    public static boolean isItPrime(int numbers) {
	        if (numbers <= 1) {
	            return false;
	        }
	        
	        for (int i = 2; i <= Math.sqrt(numbers); i++) {
	            if (numbers % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }

}