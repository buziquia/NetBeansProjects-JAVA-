package aula011;

public class Bolsista extends Aluno {

    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Sua bolsa foi renovada " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista, pagamento facilitado.");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
