import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        Scanner scanner = new Scanner(System.in);

       //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.petra
       
        System.out.print("Cree su nombre de usuario: "); 
        String usuarioCorrecto = scanner.nextLine();

        System.out.print("Cree su contraseña: ");
        String contraseñaCorrecta = scanner.nextLine();

      
        System.out.print("Ingrese el nombre de usuario: "); 
        String usuario = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

     
        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contraseñaCorrecta)) {
            System.out.println("Acceso concedido"); 
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta"); 
        }

        scanner.close();
    }
}
