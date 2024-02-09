package lambdas.ejercicioTres;

public class Vaca extends Animal implements Herviboro{
    @Override
    public String emitirSonido() {
        return "Muu";
    }


    public void comerHierva() {
        this.setSalud(this.getSalud() + 1);
    }
}
