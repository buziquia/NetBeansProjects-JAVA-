package aula12;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentear() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirsom() {
        System.out.println("som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
