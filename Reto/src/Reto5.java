import java.util.Scanner;
import java.util.Random;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        int vidas = 3;
        int opcionJugador;
        int opcionMaquina;
        String respuesta ;

        while (vidas > 0) {
            System.out.println("Elige una opción:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");

            opcionJugador = lectura.nextInt();
            opcionMaquina = random.nextInt(3) + 1;

            System.out.println("La máquina eligió " + opcionMaquina);

            if (opcionJugador == opcionMaquina) {
                System.out.println("Empate");
            } else if ((opcionJugador == 1 && opcionMaquina == 3) ||
                    (opcionJugador == 2 && opcionMaquina == 1) ||
                    (opcionJugador == 3 && opcionMaquina == 2)) {
                System.out.println("Ganaste");
            } else {
                System.out.println("Perdiste");
                vidas--;
                System.out.println("Te quedan " + vidas + " vidas");
            }
        }

        System.out.println("Perdiste todas tus vidas. ¿Quieres volver a jugar? (s/n)");
        respuesta = lectura.next();

        if (respuesta.equalsIgnoreCase("s")) {
            vidas = 3;
            main(args);
        } else {
            System.out.println("Gracias por jugar");
        }
    }
}
