package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Mustang";
        carro.modelo = "Mustangão chave da massa";
        carro.ano = 2021;

        carro2.nome = "Celta 3 portas";
        carro2.modelo = "Chevloret";
        carro2.ano = 1990;

        System.out.printf("\n%s, %s, %d", carro.nome, carro.modelo, carro.ano );
        System.out.printf("\n%s, %s, %d", carro2.nome, carro2.modelo, carro2.ano );

    }
}
