package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

public class Humano {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

    public void setNome(String nome){
        this.nome = nome; // a variavel vai receber ela mesma, e vai ser atribuida ao valor privado original.
    } //aqui dentro não tem nenhuma mudança, por isso é necessário o uso do this

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){ // get é usado para poder pegar o valor atribuido dentro da variavel. Assim tratando como uma variavel de print.
        return nome;
    }
}
