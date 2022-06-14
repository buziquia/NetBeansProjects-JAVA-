package aula12;

public class Ave extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentear() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho() {
        System.out.println("Contruindo Ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
