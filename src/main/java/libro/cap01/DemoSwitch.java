package libro.cap01;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana (número): ");
        int v = lector.nextInt();
        String dia;
        switch(v){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia ="Sáabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Día incorrecto… el valor debe estar entre 1 y 7 y debe ser un número entero";
        }
        System.out.println(dia);
    }
}
