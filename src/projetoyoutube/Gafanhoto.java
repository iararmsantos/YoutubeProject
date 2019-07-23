
package projetoyoutube;

/**
 *
 * @author Iara
 */
public class Gafanhoto extends Pessoa{
    //atributos
    private String login;
    private int totAssistido;

    //construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login=login;
        this.totAssistido=0;
    }
    //toString

    @Override//extendendo o toString() de Pessoa e Gafanhoto
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    //método personalizado
    public void viuMaisUm(){
        
    }    
    //métodos getter and setter

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
