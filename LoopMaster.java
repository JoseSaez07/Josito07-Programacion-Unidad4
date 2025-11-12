import java.util.Scanner;

public class LoopMaster {
    public void contarHastaN(int n) {
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public void imprimirSumaHastaN(int n) {
        System.out.println("");
        System.out.println("");
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);
    }

    public void imprimirTablaMultiplicar(int n) {
        System.out.println("");
        for (int i = 0; i <= 1; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        LoopMaster resultados = new LoopMaster();
        System.out.println("Escriba un número mayor o igual a 1:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        do {
            if (n >= 1) {
                resultados.contarHastaN(n);
                resultados.imprimirSumaHastaN(n);
                resultados.imprimirTablaMultiplicar(n);
                break;
            } else {
                System.out.println("Este número no es mayor o igual a 1, vuelve a ingresarlo:");
                n = scanner.nextInt();
            }
        } while (n >= 1);
        scanner.close();
    }
}