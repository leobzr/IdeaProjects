package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Joao";
        professor.idade = 23;
        professor.sexo = 'M';
        System.out.printf("%s, %d, %c", professor.nome, professor.idade, professor.sexo);
    }
}
