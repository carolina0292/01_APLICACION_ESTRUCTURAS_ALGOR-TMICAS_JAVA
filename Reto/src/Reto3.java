    import java.util.Scanner;
import java.util.Random;

public class Reto3 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random rand = new Random();

        String nombre;
        int edad ;
        int jugador;
        int maquina;

        System.out.print("Ingrese su nombre: ");
        nombre = lectura.nextLine();
        System.out.print("Ingrese su edad: ");
         edad = lectura.nextInt();

        if (edad < 0) {
            System.out.println("Edad incorrecta");

        } else if (edad < 18) {
            System.out.println("No tiene la edad suficiente para jugar");

        } else if (edad > 100) {
            System.out.println("Usted es demasiado viejo para jugar");
        }
          else{
            System.out.println("\nBienvenido " + nombre + " al juego Piedra, Papel o Tijera!");
        }
        System.out.println("Seleccione su jugada: 1 - Piedra, 2 - Papel, 3 - Tijera");
         jugador = lectura.nextInt();
         maquina = rand.nextInt(3) + 1;

        if (jugador == maquina) {
            System.out.println("Empate!");
        } else if ((jugador == 1 && maquina == 3) || (jugador == 2 && maquina == 1) || (jugador == 3 && maquina == 2)) {
            System.out.println("¡Felicidades " + nombre + "! Ganó el juego");
        } else {
            System.out.println("La máquina ganó el juego");
        }
    }
}


