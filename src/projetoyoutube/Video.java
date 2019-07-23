
package projetoyoutube;

/**
 *
 * @author Iara
 */
public class Video implements AcoesVideo{
    //atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //toString

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    

    //método implementado através da interface
    @Override
    public void play() {
        this.reproduzindo=true;
    }

    @Override
    public void pause() {
        this.reproduzindo=false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    //Construtor
    public Video(String titulo) {
        this.titulo=titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    //métodos getter and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    int x=0;
    public void setAvaliacao(int avaliacao) {
        x+=avaliacao;
        this.avaliacao=(int)x/this.views;        
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
}
