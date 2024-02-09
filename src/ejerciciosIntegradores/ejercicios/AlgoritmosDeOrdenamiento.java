package ejerciciosIntegradores.ejercicios;

import java.util.Arrays;

public class AlgoritmosDeOrdenamiento {
    public static int[] burbuja(int[] array) {
        System.out.println("Antes de ser ordenado: ");
        Arrays.stream(array).forEach(System.out::println);
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j < array.length; j++){
                if (array[i] < array[j]){
                    int valorA = array[i];
                    array[i] = array[j];
                    array[j] = valorA;
                }
            }
        }
        System.out.println("Despues de ser ordenado: " );
        Arrays.stream(array).forEach(System.out::println);
        return array;
    }
}
