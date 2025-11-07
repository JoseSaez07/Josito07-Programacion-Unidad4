import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int valor;
do{
    System.out.println("---Menú---");
    System.out.println("1.Hola");
    System.out.println("2.Hora");
    System.out.println("3.Salir");
     valor = sc.nextInt();
    switch (valor) {
     case 1  -> System.out.println("Hola " + valor);  
     case 2  -> {String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));  
    System.out.println(hora); } 
     case 3  -> System.out.println("Adiós");
     default ->System.out.println("Opcion no valida"); 
    }
    break;
}while(valor ==3 );
    
     
}
}

    



