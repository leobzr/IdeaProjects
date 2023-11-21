package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

public class HumanoTest01 {
    public static void main(String[] args) {
        Humano humano = new Humano();
        humano.setNome("Jesus"); //agora é um método!
        humano.setIdade(33);
        humano.imprime();

        System.out.println(humano.getNome());
    }
}
