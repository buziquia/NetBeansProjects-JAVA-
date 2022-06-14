package aula12;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentear() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
