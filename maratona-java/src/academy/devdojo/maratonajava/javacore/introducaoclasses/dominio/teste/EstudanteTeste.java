package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Pessoa;

public class EstudanteTeste {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();

        estudante.nome = "Deku";
        estudante.sexo = 'M';
        estudante.idade = 15;

        //como fugir dessa repetição?
        //criando uma classe impressora!
       EstudanteImpressora imprime = new EstudanteImpressora();
       imprime.imprime(estudante);
       estudante.imprime();
    }
}
