
package projetoyoutube;

/**
 *
 * @author Iara
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0]= new Video("Aula 1 de POO");
        v[1]= new Video("Aula 12 de PHP");
        v[2]= new Video("Aula 10 de HTML5");       
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0]= new Gafanhoto("Iara", 39, "F", "foguinho");
        g[1]= new Gafanhoto("Alan", 28, "M", "dreamer");
        
        Visualizacao visu[] = new Visualizacao[5];
        visu[0]=new Visualizacao(g[0], v[2]); 
        visu[0].avaliar();
        System.out.println(visu[0].toString());
        visu[1]=new Visualizacao(g[0], v[1]);
        visu[1].avaliar(87.1f);
        System.out.println(visu[1].toString());
        /*
        System.out.println("Vídeos \n---------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Gafanhotos \n---------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
    }
    
}
