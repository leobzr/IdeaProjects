package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Pessoa;

public class EstudanteImpressora {
    public void imprime(Pessoa estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
