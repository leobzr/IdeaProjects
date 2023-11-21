package academy.devdojo.maratonajava.javacore.modificadorstatico;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime(){
        System.out.println("++++++++++++");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade Máxima: "+ this.velocidadeMax);
        System.out.println("Velocidade Limite: "+ Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        //no caso de métodos estáticos, não é permitido o o uso do this, já que existe a possibilidade da instância não existir
        //Como fazemos para alterar o valor da velocidade limite?
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }


    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }
}
