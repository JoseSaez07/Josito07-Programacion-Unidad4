import java.util.Scanner;

public class EjerciciosdeRepaso {

    public static String buscarYRemplazar(String textoOrignial, String textoBuscar, String nuevoMetodo) {
        if (textoBuscar.contains(textoBuscar)) {
            return textoOrignial.replace(textoBuscar, nuevoMetodo);
        } else {
            return "Texto no encontrado";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el texto");
        String texto = sc.nextLine();
        System.out.print("Texto a buscar");
        String textoARemplazar = sc.nextLine();
        System.out.print("TNuevo texto");
        String textoNuevo = sc.nextLine();
        System.err.println(buscarYRemplazar(texto, textoARemplazar, textoNuevo));
        sc.close();
    }
}
