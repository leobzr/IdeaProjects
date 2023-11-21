package academy.devdojo.maratonajava.javacore.Gassociação.dominio.Teste;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Seminario;

public class associacaoTeste {
    public static void main(String[] args) {
        //criando como se fosse o cadastro do sistema
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Paulo", 17);
        Professor professor = new Professor("Kakashi", "Ninja");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Sexologia", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.Imprime();
    }
}
