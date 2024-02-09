package lambdas.ejercicioTres;

public class MainEjercicioTres {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Perro perro = new Perro();
        Gato gato = new Gato();
        System.out.println(gato.emitirSonido());
        System.out.println(perro.emitirSonido());
        System.out.println(vaca.emitirSonido());

        System.out.println("Antes de comer, la salud de la vaca es: " + vaca.getSalud());
        vaca.comerHierva();
        System.out.println("Despues de comer, la salud de la vaca es: " + vaca.getSalud());
        System.out.println("Antes de comer, la salud de la gato es: " + gato.getSalud());
        gato.comerCarne();
        System.out.println("Despues de comer, la salud de la gato es: " + gato.getSalud());
        System.out.println("Antes de comer, la salud de la perro es: " + perro.getSalud());
        perro.comerCarne();
        System.out.println("Despues de comer, la salud de la perro es: " + perro.getSalud());

        System.out.println("Salud antes de comer un animal, perro: " + perro.getSalud());
        perro.comerAnimal(vaca);
        System.out.println("Saludos despues de comer al animal, perro: " + perro.getSalud());
    }
}
