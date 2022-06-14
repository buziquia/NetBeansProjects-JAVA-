package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentear();
        m.locomover();
        m.emitirsom();
        
        a.locomover();
    }

}
