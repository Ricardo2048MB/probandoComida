package libro.cap01;

import java.util.Scanner;

public class DemoArray{
    public static void main(String[] args){
        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana (como número): ");
        int v = lector.nextInt();
        if(v <= dias.length){
            System.out.println(dias[v-1]);
        }else{
            System.out.println("Día incorrecto…");
        }
    }
}
/*Pues lo voy a añadir ya, pero tengo que averiguar cómo funciona el nuevo debuger de netbeans…*/