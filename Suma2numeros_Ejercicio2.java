import java.util.Scanner;

public class Suma2numeros_Ejercicio2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        // Crear un objeto scanner para que el programa lea los datos ingresados por el
        // usuario

        // ENTRADAS
        System.out.println("Ingrese el primer valor a sumar: ");
        // Pedir al usuario ingrese el primer valor a sumar
        double numero_uno = Entrada.nextDouble();
        // Crear una variable "numero_1" donde se guarde el valor ingresado por el usuario

        System.out.println("Ingrese el segundo valor a sumar: ");
        // Pedir al usuario ingrese el segundo valor a sumar
        double numero_dos = Entrada.nextDouble();
        // Crear una variable "numero_2" donde se guarde el valor ingresado por el
        // usuario

        // OPERACION
        double suma = numero_uno + numero_dos;
        // Calcular la suma de los 2 numeros

        // SALIDA
        System.out.println("El valor de la suma de los dos numeros escritos por el usario es " + suma);
        // Dar respuesta al usuario de cuanto equivale la suma de los 2 valores
    }
}
