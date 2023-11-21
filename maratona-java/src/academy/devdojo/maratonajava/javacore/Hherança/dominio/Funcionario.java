package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa { //aqui foi feita a herança
    //Vamos supor que o funcionario precise de coisas que
    //estão presentes na classe pessoa. Então, o mais lógico a se fazer é
    //Trabalhar com herança, e extender os atributos da classe pessoa para funcionário
    //Aliás, na vida real, um funcionário é uma pessoa


    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatiorioPagamento(){
        System.out.println("Eu "+ this.nome+" recebi o salario de: "+ this.salario);
    }
    private double salario;

    public void setSalario(double salario) {

        this.salario = salario;
    }



    public double getSalario() {
        return salario;
    }
}
