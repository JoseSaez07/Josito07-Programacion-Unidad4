import java.util.Scanner;

public class ParOimpar {
    public String parOimparOmultiplode(int valor) {
        boolean esPar = (valor % 2 == 0);
        boolean esMultiplode3 = (valor % 3 == 0);
        if (esPar && esMultiplode3) {
            return "Es par y es multiplo de 3";
        } else if (esPar) {
            return "Es par";
        } else if (esMultiplode3) {
            return "Es multiplo de 3";
        } else if (!esPar && esMultiplode3) {
            return "Es impar y multiplo de 3";
        } else {
            return "Es impar";

        }
    }

    public static void main(String[] args) {
        ParOimpar programa = new ParOimpar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();
        String resultado = programa.parOimparOmultiplode(numero);
        System.out.println(resultado);
        sc.close();
    }
}