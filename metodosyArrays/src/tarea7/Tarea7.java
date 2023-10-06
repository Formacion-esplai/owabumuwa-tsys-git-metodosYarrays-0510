package tarea7;
import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pleaseee, introduce la cantidad de euros que quieres convertir");
        double enEuros = scanner.nextDouble();
        
        System.out.println("Que quieres convertir?  dolares, yenes o libras");
        scanner.nextLine(); 
        String monedaDestino = scanner.nextLine();
        
        convertirMoneda(enEuros, monedaDestino);
        
        scanner.close();
    }

    public static void convertirMoneda(double dineroEnEuros, String monedaParaConvirtir) {
        double resultado = 0;

        if (monedaParaConvirtir.equalsIgnoreCase("dolares")) {
            resultado = dineroEnEuros * 1.28611;
        } else if (monedaParaConvirtir.equalsIgnoreCase("yenes")) {
            resultado = dineroEnEuros * 129.852;
        } else if (monedaParaConvirtir.equalsIgnoreCase("libras")) {
            resultado = dineroEnEuros * 0.86;
        } else {
            System.out.println("Moneda de destino no válida.");
            return;
        }

        System.out.println(dineroEnEuros + " euros equivale a " + resultado + " " + monedaParaConvirtir);
    }
}
