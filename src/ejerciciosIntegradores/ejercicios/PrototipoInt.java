package ejerciciosIntegradores.ejercicios;

public class PrototipoInt extends Prototipo <Integer> {
    @Override
    public Integer getValuePlus() {
        System.out.println("El valor siguiente es: " +  (this.getValue() + 1));
        return this.getValue() + 1;
    }
}
