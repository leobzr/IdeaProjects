package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Pessoa;


public class PessoaTeste01 {
    public static void main(String[] args) {
        //precisamos criar um objeto de pessoa
        Pessoa pessoa = new Pessoa();
        //Aqui é o objeto pessoa em letra maiuscula, e a variavel de referencia
        //que está em minúsculo.
        pessoa.nome = "Jonar";
        pessoa.idade = 18;
        pessoa.sexo = 'M';
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo
        );
    }
}
