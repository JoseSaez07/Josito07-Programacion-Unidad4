import java.util.Scanner;
public class Notaporletra1 {
public String nota(String notraLetra){
return switch (notraLetra.toUpperCase()){
case "A" -> "Notasobresaliente";
case "B" -> "NotasobreNotable";
case "C"->  "NotasobreBien";
case "D"->  "NotasobreSuficiente";
case "F"->  "NotasobreInsuficiente";
default -> "Invalido";


};

}

public static void main(String[] args) {
Scanner sc new Scanner(System.in);
System.out.println("Dime tu nota");
String valor = sc.nextLine();
String nota= nota.notraLetra(color);
System.out.println(notraLetra);
System.out.println(resultadoSwich);
sc.close();
sc.close();

}
}