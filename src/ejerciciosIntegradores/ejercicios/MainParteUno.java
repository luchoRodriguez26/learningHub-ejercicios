package ejerciciosIntegradores.ejercicios;

public class MainParteUno {
    public static void main (String[] args){
        // ejercicio: Algoritmos de ordenamiento
        AlgoritmosDeOrdenamiento.burbuja(new int[]{2, 7, 4, 0, 2, 1, 6, 9});

        // Ejercicio: Prototipos y clases abstractas

        Prototipo prototipoInt = new PrototipoInt();
        prototipoInt.setFirstValue(3);
        prototipoInt.getValuePlus();
        Prototipo prototipoDouble = new PrototipoDouble();
        prototipoDouble.setFirstValue(4.4); // Si le paso un int fallá... funciona bien!
        prototipoDouble.getValuePlus();
    }
}
