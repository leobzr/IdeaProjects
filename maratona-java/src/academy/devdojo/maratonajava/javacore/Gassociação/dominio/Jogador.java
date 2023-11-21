package academy.devdojo.maratonajava.javacore.Gassociação.dominio;

public class Jogador {
    //Antes de entender associação, vamos lembrar como funcionam os arrays
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
        this.time = this.time;
    }


}
