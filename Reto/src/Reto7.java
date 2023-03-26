    import java.util.Scanner;
public class Reto7 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n = 0;
        String respuesta = "s";
        String nombre;
        String apellido;
        int edad;
        String correo;
        String contrasena;

        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el número de usuarios a registrar: ");
            n = lectura.nextInt();

            int i = 0;
            while (i < n) {
                System.out.println("\nRegistro de usuario " + (i+1));
                System.out.print("Nombre: ");
                nombre = lectura.next();
                System.out.print("Apellido: ");
                 apellido = lectura.next();
                System.out.print("Edad: ");
                edad = lectura.nextInt();
                System.out.print("Correo electrónico: ");
                correo = lectura.next();
                System.out.print("Contraseña: ");
                contrasena = lectura.next();
                
                System.out.println("\nUsuario registrado con éxito:\n" +"Nombre: " + nombre + "\n" +"Apellido: " + apellido + "\n" +"Edad: " + edad + "\n" +"Correo electrónico: " + correo + "\n" +"Contraseña: " + contrasena);
                i++;
            }
            
            System.out.print("\n¿Desea enviar otra respuesta? (s/n): ");
            respuesta = lectura.next();
        }
        
        System.out.println("\n¡Gracias por registrarse!");
    }
}
