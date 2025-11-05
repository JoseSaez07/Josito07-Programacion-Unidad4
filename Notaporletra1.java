import java.util.Scanner;
public class Notaporletra1 {
public String nota(String notaLetra){
return switch (notaLetra.toUpperCase()){
case "A" -> "Notasobresaliente";
case "B" -> "NotasobreNotable";
case "C"->  "NotasobreBien";
case "D"->  "NotasobreSuficiente";
case "F"->  "NotasobreInsuficiente";
default -> "Invalido";


};

}

public static void main(String[] args) {
Notaporletra1 resultado = new Notaporletra1();
Scanner sc = new Scanner(System.in);
System.out.println("Dime tu nota");
String valor = sc.nextLine();
String resultado1= resultado.nota(valor);
System.out.println(resultado1);
sc.close();

}
}