package libro.cap01;

import java.util.Scanner;

public class DemoArray{
    public static void main(String[] args){
        int arr[] = new int [10];
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un valor (número cero para terminar): ");
        int v = lector.nextInt();
        int i = 0;
        //mientras v sea distinto de cero y i sea menor que diez
        while(v != 0 && i <= 10){
            arr[i++] = v;
            System.out.println("Ingrese el siguiente valor (número cero para terminar): ");
            v = lector.nextInt();            
        }
        //se recorre el arreglo mostrando todo su contenido
        for(int j = 0; j <= i; j++){
            System.out.println(arr[j]);
        }
    }
}
/*Pues lo voy a añadir ya, pero tengo que averiguar cómo funciona el nuevo debuger de netbeans…*/