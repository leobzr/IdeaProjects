package academy.devdojo.maratonajava.javacore.Gassociação.dominio.Teste;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador jogador3 = new Jogador("Tua mãe");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        //Aqui nós temos um array, e este array tem 3 posições
        //E uma variável de referencia, que faz referencia ao array de 3 posições
        //E cada variável existe separadamente

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
