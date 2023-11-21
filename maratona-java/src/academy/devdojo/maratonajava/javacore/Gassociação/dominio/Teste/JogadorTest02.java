package academy.devdojo.maratonajava.javacore.Gassociação.dominio.Teste;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelanza");
        Time time = new Time("Sexo FC");
        jogador1.setTime(time);
    }
}
