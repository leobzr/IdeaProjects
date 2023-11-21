package academy.devdojo.maratonajava.javacore.Gassociação.dominio;

public class Time {
    private String nome;
    private Time time;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Time(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
