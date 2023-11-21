package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Para usar o this(), deve ter um outro construtor chamando o nome presente da class
    //Esse método, é o que o Java faz por dentro para poder passar o método da super para as subclasses
    //Criar este metodo manualmente ajuda a trabalhar em cima dele
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }



    public String getNome() {
        return nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereço.getRua() +" "+ this.endereço.getCep());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
