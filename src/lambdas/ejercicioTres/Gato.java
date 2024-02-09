package lambdas.ejercicioTres;

public class Gato extends Animal implements Carnivoro{
    @Override
    public String emitirSonido() {
        return "miau";
    }

    @Override
    public void comerCarne() {
        this.setSalud(this.getSalud() + 1);
    }
}
