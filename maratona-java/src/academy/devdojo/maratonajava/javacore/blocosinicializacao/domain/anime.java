package academy.devdojo.maratonajava.javacore.blocosinicializacao.domain;

public class anime {
    private String nome;
    private int[] episidios = {1,2,3,4,5,6,7,8,9,10,11,12};

    //1 - é alocado um espaço de memoria
    //cada atributo de classe é criado e inicializado com valores default ou qqer for passado
    //bloco é executado
    //construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episidios = new int[100];
        for (int i = 0; i < episidios.length; i++){
            episidios[i]= i+1;
        }
    }



    public anime() {
        this.nome = nome;
    }

    public void Animes() {
        episidios = new int[100];
        for (int i = 0; i < episidios.length; i++){
            episidios[i] = i+1;
        }
        for (int episodios: this.episidios) {
            System.out.println(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisidios() {
        return episidios;
    }
}
