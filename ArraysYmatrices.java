public class ArraysYmatrices {
    // Devolver media de cada fila
    public  static double [] calcularMedia(int[][] notas) {
    double[] mediasCalcular = new double[] {notas.length };
    for (int i = 0; i < notas.length; i++) {
        double suma = 0;
        //inicializo suma.
        // Sumo todos los elementos de una fila.
    for (int j = 0; j < notas[i].length; j++) {
         suma+=notas[i][j];
    }
    // Calculo media
        mediasCalcular [i]= suma/notas[i].length;
    
    }
         return mediasCalcular;
    }
}
public static void mostrarNotasMedia(double[] notas){
    for(double notaGeneral : notas){
        System.out.println(notaGeneral);
    }
}
public static void main(String[] args) {
    int[][] notasAlumnos = new int[][] {
            { 3, 4, 5 },
            { 9, 2, 3 },
            { 5, 6, 1 },
            { 8, 6, 1 },
    };
    double[] notasMedia =calcularMedia(notasAlumnos);
    mostrarNotasMedia(notasMedia);
      }
}
