import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, 
        //si son iguales a los datos dados imprimirá en terminal: Acceso concedido, 
        //si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Hola, buenas! ¿Cuál es su nombre de usuario?");
    
            String nombre = scanner.nextLine();
           
            System.out.println("\nHola, "+nombre+"! ¿Cuál es su apellido, por favor?\n");
            String apellido = scanner.nextLine();
           
            System.out.println("\nGracias, "+nombre+" "+apellido+"! ¿Qué nombre de usuario querría elegir?\n");
            String usuario = scanner.nextLine();
           
            System.out.println("\nDe acuerdo, su nombre de ususario será "+usuario+". Y ahora elija una contraseña.\n");
            String contraseña = scanner.nextLine();
    
            //Añade una nueva línea antes de mostrar la siguiente pregunta.
            System.out.println("\nHola "+nombre+" "+apellido+", tu nombre de usuario es "+usuario+" y tu contraseña es "+contraseña+", gracias por registrarte.");
            scanner.close();
    }
}
