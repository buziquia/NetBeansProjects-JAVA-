package aula011;

public class Aula011 {

    public static void main(String[] args) {
        Bolsista b1 = new Bolsista();
        b1.setNome("Fabie");
        b1.setMatricula(1112);
        b1.setIdade(22);
        b1.setSexo("T");
        b1.setCurso("Sexo anal");
        b1.setBolsa(24587);
        b1.pagarMensalidade();
        
        System.out.println(b1.toString());
        System.out.println("Bolsa = " + b1.getBolsa() + " Curso = " + b1.getCurso());
        
    }

}
