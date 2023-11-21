package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

public class Funcionario {
    private String nome = "Joanildo";
    private int idade = 10;
    private int[] salarios = {1200, 1300, 5000};
    private double media = 0.0;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int sal : salarios){
            System.out.println(sal);
        }
    }

    public void media(double... salarios){
        int soma = 0;
        for (double num : salarios){
            soma+=num;

        }
        int i = soma / salarios.length;
        System.out.println("Media salarial: "+ i);
    }
}
