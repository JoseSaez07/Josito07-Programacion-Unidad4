import java.util.Scanner;

public class LoopMaster {
    public static void contarHastaN(int n) {
        for (int i = 0; i <= n; i++) {
        }

    }

    public static void imprimirSumaHastaN(int n) {

    }

    public static void imprimirTablaMultiplicar(int n) {
    public static void imprimirTablaMultiplicar(int n){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i , n, i*n);
            }
    }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int numero = sc.nextInt();
        contarHastaN(numero);
        sc.close();

    }
}
