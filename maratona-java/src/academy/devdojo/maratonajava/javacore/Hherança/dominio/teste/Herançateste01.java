package academy.devdojo.maratonajava.javacore.Hherança.dominio.teste;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereço;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class Herançateste01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua 3");
        endereço.setCep("121231");
        Pessoa pessoa = new Pessoa("Cuquinha");
        pessoa.setCpf("40228922");
        pessoa.setEndereço(endereço);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Naruto");
        funcionario.setCpf("423423");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(123.00);
        funcionario.imprime();
    }
}
