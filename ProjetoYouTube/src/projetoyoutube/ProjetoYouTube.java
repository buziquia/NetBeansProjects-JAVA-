package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de poo");
        v[1] = new Video("Aula 12 de php");
        v[2] = new Video("aula 10 de html5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", 1.0f, "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", 1.0f, "creuzita");
      
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
    }
    
}
