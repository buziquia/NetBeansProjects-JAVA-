package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("AU AU Au");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma Comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar!");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if(dono){
            System.out.println("abanar");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("rosnar");
            } else {
                System.out.println("Ignoar");
            }
        }
    }
}
