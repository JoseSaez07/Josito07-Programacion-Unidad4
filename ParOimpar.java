import java.util.Scanner;

public class ParOimpar {
    public String numeroA(int numero) {
        boolean esPar = (numero % 2 == 0);
        boolean esMultiplode3 = (numero % 3 == 0);
        if (esPar && esMultiplode3) {
            return "Es par y multiplo de 3";
        } else if (!esPar && esMultiplode3) {
            return "Es impar y multipo de 3";
        } else if (esPar) {
            return "Es par";
        } else {
            return "Es impar";
        }
    }

    public static void main(String[] args) {
        ParOimpar prueba = new ParOimpar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();
        String resultado = prueba.numeroA(numero);
        System.out.println(resultado);
        sc.close();

    }
}
