package tarea1;
import java.util.Scanner;

public class Tarea1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("¿Qué figura quieres calcular? Circulo, Triangulo, Cuadrado");
	        String figura = scanner.nextLine().toLowerCase();


	        if (figura.equals("circulo")) {
	            System.out.println("Entrar el radio del circulo");
	            double radio = scanner.nextDouble();
	            
	            double final_area_circle = Math.PI * Math.pow(radio, 2);
	            System.out.println("La area del circulo es " + final_area_circle);
	            
	        } else if (figura.equals("triangulo")) {
	            System.out.println("Entrar la base del triangulo: ");
	            double base = scanner.nextDouble();
	            System.out.println("Entrar la altura del triangulo: ");
	            double altura = scanner.nextDouble();
	            
	            double final_area_triangle =  (base * altura) / 2;
	            System.out.println("La area del circulo es " + final_area_triangle);
	            
	        } else if (figura.equals("cuadrado")) {
	            System.out.println("Introduce el lado del cuadrado: ");
	            double lado = scanner.nextDouble();
	            double final_area_cuadrado = Math.pow(lado, 2);
	    	    System.out.println("La area del circulo es " + final_area_cuadrado);

	            
	        } else {
	            System.out.println("Figura no reconocida! Try againnn!");
	            scanner.close();
	            return;
	        }

	        scanner.close();
	    }


}
