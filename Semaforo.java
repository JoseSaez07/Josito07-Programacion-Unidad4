import java.util.Scanner;

public class Semaforo {
    public String accionSemaforoIf(String color) {
        if (color.equalsIgnoreCase("rojo")) {
            return "para";
        } else if (color.equalsIgnoreCase("amarillo")) {
            return "atento";
        } else if (color.equalsIgnoreCase("verde")) {
            return "pasa";
        } else {
            return "invalido";
        }
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el color");
        String color = sc.nextLine();
        sc.close();
        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado

    }
}
