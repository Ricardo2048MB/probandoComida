package libro.cap01;

import java.util.Scanner;

public class DemoConstantes{
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;
    public static void main(String[] args){
        //
        Scanner lector = new Scanner(System.in);
        int v = lector.nextInt();
        String dia;
        switch(v){
            case LUNES:
                dia = "Lunes";
                break;
            case MARTES:
                dia = "Martes";
                break;
            case MIERCOLES:
                dia = "Miércoles";
                break;
            case JUEVES:
                dia = "Jueves";
                break;
            case VIERNES:
                dia = "Viernes";
                break;
            case SABADO:
                dia = "Sábado";
                break;
            case DOMINGO:
                dia = "Domingo";
                break;
            default:
                dia = "día incorrecto… ingrese un valor entre 1 y 7";
        }
        System.out.println(dia);
    }
}