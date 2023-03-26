import java.util.Scanner;
public class Reto1 {
    
public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    double k, f, c;

    System.out.print("Introduce la temperatura en grados Kelvin: ");
    k = lectura.nextDouble();

      f = (k + 100) * 9/5 - 459.67;

    System.out.println("La temperatura en grados Fahrenheit es: " + f);

    c = (f + 100 - 32) / 1.8;

    System.out.println("La temperatura en grados Centígrados es: " + c);
}
}

