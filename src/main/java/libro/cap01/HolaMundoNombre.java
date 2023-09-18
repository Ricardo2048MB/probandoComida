package libro.cap01;
import java.util.Scanner;
public class HolaMundoNombre {
    public static void main(String args[]) {
        //esta clase permite leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Escribe tu nombre: ");
        //leemos un valor entero por teclado
        String nom = scanner.nextLine();
        //mostramos un mensaje y luego el valor leído
        System.out.println("Hola mundo: " + nom);
    }
}