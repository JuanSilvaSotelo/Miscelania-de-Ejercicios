import java.util.Scanner;

public class Area_Perimetro_Cuadrado_Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Crear un objeto scanner para que el programa lea los datos ingresados por el usuario

        // ENTRADAS
        System.out.println("Ingrese el valor de un lado del cuadrado a cacular el area y el perimetro: ");
        // Pedir al usuario ingrese el valor del lado del cuadrado
        double lado = entrada.nextDouble();
        // Crear una variable "lado" donde se guarde el valor del lado ingresado por el usuario

        // OPERACION
        double area = lado * lado;
        //Calcular el area del cuadrado la cual es lado * lado
        double perimetro = lado * 4;
        //Calcular el perimetro del cuadrado la cual es lado * 4

        // SALIDA
        System.out.println("El area del cuadrado es: " + area);
        // Dar respuesta al usuario de cuanto equivale el area del cuadrado
        System.out.println("El perimetro del cuadrado es: " + perimetro);
        // Dar respuesta al usuario de cuanto equivale el perimetro del cuadrado

    }
}
