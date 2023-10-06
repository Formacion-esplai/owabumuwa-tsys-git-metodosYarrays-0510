package tarea11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tarea11 {
	


	    public static void main(String[] args) {
	        
	    	int[] array1 = new int[20];
	    	int[] array2 = array1;

	        
			
			 for(int i = 0; i<20; i++) {
			        Random random = new Random();
		            array1[i] = random.nextInt(20);
		 	       
		       }
			 
			 for(int i = 0; i<20; i++) {
			        Random random = new Random();
		            array2[i] = random.nextInt(20);
		            
		       }
			 int[] resultArray = multiplicarArray(array1, array2);
			 

			 System.out.println("First array containes ... ");
			 for (int value : array1) {
			     System.out.print(value + " ");
			 }
			 System.out.println();

			 System.out.println("Second array containes ... ");
			 for (int value : array2) {
			     System.out.print(value + " ");
			 }
			 System.out.println();

			 System.out.println("Third array containes ... ");
			 for (int value : resultArray) {
			     System.out.print(value + " ");
			 }
			 System.out.println();
       

	    }

	    public static int[] multiplicarArray(int[] first_array, int[] second_array) {
	    	
	           int[] third_array = new int[first_array.length];	      
	       
	       for(int i = 0; i<first_array.length; i++) {
				third_array[i] = first_array[i] * second_array[i];
	       };
	      

		return third_array;
	    }
	    
	 

}