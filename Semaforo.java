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

    public String accionSemaforoSwitch(String color){
     return switch (color){
     case "rojo" ->"Para";
     case "amarillo" ->"Atento";
     case "verde" ->"Pasa";
     default -> "Invalido";
     
     };
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Semaforo semaforo = new Semaforo();
        System.out.println("Introduce el color:");
        String color = sc.nextLine();
        String resultado = semaforo.accionSemaforoIf(color);
        String resultadoSwich= semaforo.accionSemaforoSwitch(color);
        System.out.println(resultado);
        System.out.println(resultadoSwich);
        sc.close();
        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado

    }
}

