package academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("TOG", "TV", 12, "Hentai");
        //Com o init, eu já consigo dentro de um método, entrar o objeto anime inteiro.
       // anime.init("TOG", "TV", 12, "Hentai");
        anime.imprime();
    }
}
