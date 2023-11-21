package academy.devdojo.maratonajava.javacore.modificadorstatico;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Porsche", 300);
        Carro.setVelocidadeLimite(180); //Dessa forma nós atribuimos o valor para o carro teste
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
