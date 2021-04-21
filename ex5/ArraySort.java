
import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("INICIO MAIN");
        
        int numeros[] = {2,1,3,4,8,5,9,2,10};
        //char[] nomeCurso = {'S','I','S','T','E','M','A'};

        System.out.println("Valores antes de ordenar");

        //for normal
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" -> " + numeros[i] + " ");
        }
        System.out.println("");

        //ordenacao
        Arrays.sort(numeros);

        System.out.println("Valores DEPOIS de ordenar");
        //for diferenciado
        for(int numero: numeros){
            System.out.print(" -> " + numero + " ");
        }
        System.out.println("");

        System.out.println("FIM");
    }
}
