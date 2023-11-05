import java.util.Scanner;

public class PromedioNumeros_Ejercicio8 {
    public static void main(String[] args){
        //Entradas
        Scanner Entrada = new Scanner(System.in);
        //Crear un objeto de tipo Scanner para alamcenar la respuesta dada por el usuario

        System.out.println("Escriba el primer numero a promediar: ");
        //Solicitar al usuario ingresar el primer valor a promediar
        double numero1 = Entrada.nextDouble();
        //Crear una variable que guarde el primer numero ingresado por el usuario

        System.out.println("Escriba el segundo numero a promediar: ");
        //Solicitar al usuario ingresar el segundo valor a promediar
        double numero2 = Entrada.nextDouble();
        //Crear una variable que guarde el segundo numero ingresado por el usuario

        System.out.println("Escriba el tercer numero a promediar: ");
        //Solicitar al usuario ingresar el tercer valor a promediar
        double numero3 = Entrada.nextDouble();
        //Crear una variable que guarde el tercer numero ingresado por el usuario

        //Proceso
        double Promedio = (numero1 + numero2 + numero3)/3;
        //Operar el promedio de los 3 numero ingresados por el usuario
        
        //Salida
        System.out.println("El promedio de los numero es: " + Promedio);
        //Dar el resultado del promedio de los 3 numeros
    }
    
}
