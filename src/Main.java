import poo.sincronicoDos.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        // PracticaExcepciones practica = new PracticaExcepciones();
        // practica.calcularCociente();

        // Ejercicio 2
        Distribuidora distribuidora = new Distribuidora();
        distribuidora.getProductos().add(new Producto("Arroz", 18.1));
        distribuidora.getProductos().add(new NoPerecedero("Lentejas", 28.1));
        distribuidora.precioTotal();
    }
}