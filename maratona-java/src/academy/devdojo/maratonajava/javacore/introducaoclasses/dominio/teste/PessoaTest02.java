package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Pessoa;

public class PessoaTest02 {
    public static void main(String[] args) {
        //O java ja coloca um valor inicial a um objeto
        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
