package academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int espisodios;
    private String nome;
    private String genero;
    private String estudio;

    //agora, nós podemos passar todos os dados logo ao chamar o construtor
    public Anime(String nome, String tipo, int espisodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
        this.genero = genero;
        //se tiver o tipo de retorno, ele se torna um método
        //construtor.
        //Se você não declara ele logo de inicio, o java automaticamente coloca para você
    }

    public Anime(String nome, String tipo, int espisodios, String genero, String estudio){
        System.out.println("Detro do construtor, sem argumentos");
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
        this.genero = genero;
        this.estudio = estudio;
    }

    public void init(String nome, String tipo, int espisodios, String genero){
        //eu tenho um metodo que faz a incialização de tudo o que eu tenho.
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.espisodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }

    public void setGenero(String tipo){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEspisodios(int espisodios){
        this.espisodios = espisodios;
    }
    public int getEspisodios(){
        return this.espisodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

}
