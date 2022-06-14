package projetoyoutube;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacoes;
    private int view;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 1;
        this.view = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        int nova;
        nova = (int) ((this.avaliacoes + avaliacoes)/this.view);
        this.avaliacoes = nova;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
       this.reproduzindo = false; 
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo = " + titulo + ", avaliacoes = " + avaliacoes + ", view = " + view + ", curtidas = " + curtidas + ", reproduzindo = " + reproduzindo + '}';
    }
    
    
    
}
