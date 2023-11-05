import java.util.Scanner;

public class Area_triangulo_Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Crear un objeto scanner para que el programa lea los datos ingresados por el usuario

        // ENTRADAS
        System.out.println("Ingrese el valor de la base del triangulo: ");
        // Pedir al usuario ingrese el valor de la base del triangulo
        double base = entrada.nextDouble();
        // Crear una variable "base" donde se guarde el valor ingresado por el usuario

        System.out.println("Ingrese el valor de la altura del triangulo: ");
        // Pedir al usuario ingrese el valor de la altura del triangulo
        double altura = entrada.nextDouble();
        // Crear una variable "altura" donde se guarde el valor ingresado por el usuario


        // OPERACION
        double area = (base * altura)/2;
        // Calculae el area del triangulo la cual su formula es: area = (base*altura)/2

        // SALIDA
        System.out.println("El area del triangulo es: " + area);
        // Dar respuesta al usuario de cuanto equivale el area del triangulo

    }
}
