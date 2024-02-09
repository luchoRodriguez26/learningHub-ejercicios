package lambdas.ejercicioTres;

public abstract class Animal<T extends Animal>{
    private int salud = 100;
    public abstract String emitirSonido();

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void comerAnimal (T animal) { // A partir del tipo de animal, que llame al metodo especifico de comer carne
        System.out.println(animal.emitirSonido());
        this.setSalud(this.getSalud() + 25);
    }


}
