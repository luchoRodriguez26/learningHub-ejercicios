package poo.sincronicoDos;

public class PracticaExcepciones {
    private int a = 0;
    private int b = 300;

    public int calcularCociente () {
        try {
            return b/a;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("No se puede dividr por cero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }

}
