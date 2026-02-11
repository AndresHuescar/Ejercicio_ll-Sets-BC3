import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {

        // Creo un HashSet para guardar emails (no permite repetidos)
        HashSet<String> emails = new HashSet<>();

        // Creo el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Variable para guardar la opción elegida en el menú
        int opcion;

        // Bucle do-while para que el menú se repita hasta que el usuario elija salir (0)
        do {
            // Mostramos el menú
            System.out.println("\n--- EMAILS ---");
            System.out.println("1. Registrar email");
            System.out.println("2. Mostrar emails");
            System.out.println("3. Comprobar email");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            // Leo la opción elegida
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el buffer después de leer un número

            // Estructura switch para ejecutar una acción según la opción elegida
            switch (opcion) {

                case 1:
                    // Registro un nuevo email
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    // Añado el email al HashSet
                    // add() devuelve false si el email ya existe
                    if (!emails.add(email)) {
                        System.out.println("Email ya registrado");
                    }
                    break;

                case 2:
                    // Muestro todos los emails guardados
                    for (String e : emails) { // Recorremos el HashSet
                        System.out.println(e);
                    }
                    break;

                case 3:
                    // Compruebo si un email está registrado
                    System.out.print("Email a comprobar: ");
                    String comprobar = sc.nextLine();

                    // contains() verifica si el email está en el HashSet
                    if (emails.contains(comprobar)) {
                        System.out.println("Registrado");
                    } else {
                        System.out.println("No registrado");
                    }
                    break;
            }

        } while (opcion != 0); // El programa termina cuando el usuario introduce 0
    }
}
