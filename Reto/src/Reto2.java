  import java.util.Scanner;
public class Reto2 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String nombreBebe;
        String nombreMedico ;
        String nombreVacuna;
        String nombreEPS;
        double pesoBebe ;
        int edadMeses;
        double dosisVacuna;

        System.out.print("Ingrese el nombre del bebé: ");
        nombreBebe = lectura.next();
        System.out.print("Ingrese el nombre del médico: ");
        nombreMedico = lectura.next();
        System.out.print("Ingrese el nombre de la vacuna: ");
        nombreVacuna = lectura.next();
        System.out.print("Ingrese el nombre de la EPS: ");
         nombreEPS = lectura.next();
        System.out.print("Ingrese el peso del bebé: ");
         pesoBebe = lectura.nextDouble();
        System.out.print("Ingrese la edad del bebé en meses: ");
         edadMeses = lectura.nextInt();
        
        dosisVacuna = (pesoBebe + 15 / (edadMeses * 15)) * 10;
        System.out.println(" Esta sera la dosis que su bebe necesitara "+ dosisVacuna);
    
    }
}