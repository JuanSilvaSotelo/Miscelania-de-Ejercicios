import java.util.Scanner;

public class Circunferencia_Ejercicio7 {
    public static void main(String[] aargs) {
        //Entradas
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Escriba el radio de la circuferencia: ");

        double radio = Entrada.nextDouble();

        //Proceso
        double longitud = 2 * 3.1416 * radio;
        
        double area = 3.1416 * Math.pow(radio, 2);

        //Salida
        System.out.println("La longitud del circulo " + longitud + " y el area es " + area);
        
    }
    
}
