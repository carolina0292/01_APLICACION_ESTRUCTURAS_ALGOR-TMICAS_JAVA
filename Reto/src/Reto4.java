    import java.util.Scanner;
import java.util.Random;

public class Reto4 {

  public static void main(String[] args) {

    Scanner lectura = new Scanner(System.in);
    Random rand = new Random();

    String nombre;
    int edad;
    int seleccionJugador;
    int seleccionMaquina;


    System.out.print("Ingrese su nombre: ");
    nombre = lectura.nextLine();

    System.out.print("Ingrese su edad: ");
    edad = lectura.nextInt();

    if (edad < 18 && edad > -1) {
      System.out.println("Lo siento, no puede jugar debido a que es menor de 18 años.");
    } else if (edad < 0) {
      System.out.println("Edad incorrecta.");
    } else if (edad > 100) {
      System.out.println("Lo siento, no puede jugar debido a que es mayor de 100 años.");
    } else {
      System.out.println("Bienvenido, " + nombre + "al juego cara o sello");
    }

      System.out.print("Elija cara (1) o sello (2): ");
      seleccionJugador = lectura.nextInt();

      seleccionMaquina = rand.nextInt(2) + 1;

      System.out.println("La máquina ha elegido " + (seleccionMaquina == 1 ? "cara" : "sello") + ".");

      if (seleccionJugador == seleccionMaquina) {
        System.out.println("¡Ha ganado " + nombre + "!");
      } else {
        System.out.println("La máquina ha ganado.");
      }
    }
  }

