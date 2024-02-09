package ejerciciosIntegradores.ejercicios;

public class PrototipoDouble extends Prototipo <Double>{
    @Override
    public Double getValuePlus() {
        System.out.println("El valor siguiente es: " + (this.getValue() * 2.3));
        return this.getValue() * 2.3;
    }
}
