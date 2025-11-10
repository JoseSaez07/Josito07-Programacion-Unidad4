import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 100;
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        int intentos = 0;
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean acertado = false;

        System.out.println("Estoy pensando un número del " + MIN + " al " + MAX + ".");

        while (!acertado) {
            System.out.print("Tu intento: ");

            // Comprobamos si el valor introducido es un número entero
            if (!sc.hasNextInt()) {
                System.out.println("❌ Error: por favor, introduce un número entero.");
                sc.next(); // limpiar entrada incorrecta
                continue;
            }

            numero = sc.nextInt();
            intentos++;

            if (numero < secreto) {
                System.out.println("Mayor");
            } else if (numero > secreto) {
                System.out.println("Menor");
            } else {
                System.out.println("¡Acertaste en " + intentos + " intentos!");
                acertado = true;
            }
        }

        sc.close();
    }
}
