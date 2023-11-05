import java.util.Scanner;

public class Numero_al_cuadrado_Ejercicio3 {
    public static void main(String[] args){
        //Entradas
        Scanner Entrada = new Scanner(System.in);
        //Crear un objeto tipo scanner para recoger los datos que el usuario ingrese

        System.out.println("Ingrese el núumero que va a elevar al cuadrado: ");
        //Solicitar al usuario ingresar el número a elevar al cuadrado
        double Numero_Usuario = Entrada.nextDouble();
        //Crear una variable que recoja el dato qu el usuario ingrese

        //Proceso
        double Numero_elevado = Math.pow(Numero_Usuario, 2);
        //Realizar la potencia del numero ingresado por el usuario
        
        //Salidas
        System.out.println(Numero_Usuario + " elevado a la 2 es: " + Numero_elevado);
        //Mostrar al usuario el numero que ingreso y sigueinte mostra como quedaria cuando se eleva a la 2
        
    }
}
