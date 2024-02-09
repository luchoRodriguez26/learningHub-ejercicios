package ejerciciosIntegradores.ejercicios;

public abstract class Prototipo <T extends Number>{

    private T value;
    private T firstValue;
    public abstract T getValuePlus ();

    public T getValue() {
        return this.value;
    }

    public T getFirstValue() {
        return this.firstValue;
    }
    public void reboot () {
        this.value = this.firstValue;
        System.out.println("Se reinicio el prototipo");
    };
    public void setFirstValue (T firstValue) {
        this.firstValue = firstValue;
        this.value = firstValue;
        System.out.println("El valor inicial es: " + this.value);
    };
}
