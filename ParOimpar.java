import java.util.Scanner;

public class ParOimpar {
public static String main(String[] args) {
Scanner sc = new  Scanner(System.in);
System.out.println("Dime un numero");
int numero = sc.nextInt();

boolean esPar = (numero % 2 == 0);
boolean esMultiplode3 = (numero % 3 == 0);
sc.close();
}

}

