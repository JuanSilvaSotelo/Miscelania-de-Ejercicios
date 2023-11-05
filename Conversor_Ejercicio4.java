import java.util.Scanner;

public class Conversor_Ejercicio4 {
    public static void main (String[] args){
        //Entradas
        Scanner Entrada = new Scanner(System.in);
        //Crear ub objeto de tipo sccanner para recoger la información ingresada por el usuario

        System.out.println("Escriba el valor de Euros que va a convertir a dolares: €");
        //Solicitar al usuario ingrese el valor que desea convertir a dolares
        double euros = Entrada.nextDouble();
        //Crear un varible que guarde la cantidad de euros ingresados por el usuario

        //Proceso
        double Conversion = euros * 1.07;
        //Crear la operación para realizar la conversion de las divisas

        //Salidas
        System.out.println("La conversion de €" + euros + " euros a dolares es $" + Conversion);
        //Dar el valor del resultado al usuario de la conversion

    }
    
}
