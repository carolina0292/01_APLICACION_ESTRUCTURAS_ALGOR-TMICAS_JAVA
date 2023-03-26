import java.util.Scanner;

public class Reto6{

  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int numLetras;
    int i = 0;;
    String palabraAdivinar;
    String palabraUsuario;


    System.out.println("Adivinaras una palabra de como se llaman un animal domestico");
    String[] palabras = {"perro", "gato"};

    System.out.println("¿Cuántas letras desea descubrir?");
    numLetras = lectura.nextInt();

    while (i < palabras.length) {
      palabraAdivinar = palabras[i];
      if (palabraAdivinar.length() == numLetras) {
        palabraUsuario = "";
        while (!palabraUsuario.equals(palabraAdivinar)) {
          System.out.println("Adivina la palabra: ");
          palabraUsuario = lectura.next();
          if (!palabraUsuario.equals(palabraAdivinar)) {
            System.out.println("Incorrecto, intenta de nuevo.");
          }
        }
        System.out.println("¡Correcto! La palabra era " + palabraAdivinar);
      }
      i++;
    }
    System.out.println("Fin del juego.");
  }
}


