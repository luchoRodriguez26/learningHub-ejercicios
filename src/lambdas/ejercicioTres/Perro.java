package lambdas.ejercicioTres;

public class Perro extends Animal implements Carnivoro{
    @Override
    public String emitirSonido() {
        return "guau";
    }

    @Override
    public void comerCarne() {
        this.setSalud(this.getSalud() + 1);
    }
}
