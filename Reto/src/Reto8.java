    import java.util.Scanner;
public class Reto8 {

        public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
            int vidas = 3;
            int jugador1 = 0;
            int jugador2 = 0;
            int dado1;
            int dado2;
            
            
            while (vidas > 0) {
                System.out.println("Jugador 1, presione enter para lanzar el dado.");
                lectura.nextLine();
                dado1 = (int) (Math.random() * 6) + 1;
                System.out.println("Jugador 1 ha sacado un " + dado1);
                
                System.out.println("Jugador 2, presione enter para lanzar el dado.");
                lectura.nextLine();
                dado2 = (int) (Math.random() * 6) + 1;
                System.out.println("Jugador 2 ha sacado un " + dado2);
                
                if (dado1 > dado2) {
                    jugador1++;
                    vidas--;
                    System.out.println("Jugador 1 ha ganado esta ronda.");
                } else if (dado2 > dado1) {
                    jugador2++;
                    vidas--;
                    System.out.println("Jugador 2 ha ganado esta ronda.");
                } else {
                    System.out.println("Empate.");
                }
                
                System.out.println("Jugador 1: " + jugador1 + " victorias.");
                System.out.println("Jugador 2: " + jugador2 + " victorias.");
                System.out.println("Vidas restantes: " + vidas);
            }
            
            if (jugador1 > jugador2) {
                System.out.println("¡Jugador 1 ha ganado el juego!");
            } else if (jugador2 > jugador1) {
                System.out.println("¡Jugador 2 ha ganado el juego!");
            } else {
                System.out.println("El juego ha terminado en empate.");
            }
        }
    }
    
