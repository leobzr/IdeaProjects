package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;


public class Pessoa {
    //uma classe, assim como uma pessoa, possuem atributos:
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
