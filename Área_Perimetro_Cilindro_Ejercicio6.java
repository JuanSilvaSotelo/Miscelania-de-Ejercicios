import java.util.Scanner;

public class Área_Perimetro_Cilindro_Ejercicio6 {
    public static void main(String[] args){
    //Entradas
    Scanner Entrada = new Scanner(System.in);
    //Crear un objeto tipo Scanner para recoger la información ingresada por el usuario
    
    //Para hallar el area y volumen de un cilindro debemos conocer su altura y su radio
    System.out.println("Digite la altura del cilindro: ");
    //Solicitar al usuario digitar la altura del cilindro
    double altura = Entrada.nextDouble();
    //crear una variable "altura" que guarde la información dada por el usuario
    
    System.out.println("Digite el radio del cilindro: ");
    //Solicitar al usuario digitar el radio del cilindro
    double radio = Entrada.nextDouble();
    //crear una variable "radio" que guarde la información dada por el usuario
    
    //Proceso
    double area = (2 * 3.1416 * radio * altura) + (2 * 3.1416 * (radio * radio));
    //Realiza la formula para hallar el area la cual es la siguiente: 2π r h + 2π r²
    double volumen = (3.1416 * (radio * radio) * altura);
    //Realiza la formula para hallar el area la cual es la siguiente: π r² h
    
    //Salida
    System.out.println("El area del cilindro es: " + area);
    //Mostrar al usuario cuanto equivale el area del cilindro con los datos entregados
    System.out.println("El volumen del cilindro es: " + volumen);
    //Mostrar al usuario cuanto equivale el volumen del cilindro con los datos entregados
    }

    
}
