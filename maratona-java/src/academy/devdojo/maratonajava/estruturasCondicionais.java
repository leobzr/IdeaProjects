package academy.devdojo.maratonajava;

//Tudo na vida é sobre if's, nas linguagens de programação também.

public class estruturasCondicionais {
    public static void main(String[] args) {
        if (true){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso!");
        }

        int idade = 16;
        if (idade >=18) {
            System.out.println("Pode beber mlk");
        } else if (idade < 15) {
            System.out.println("Mano tu é mt novo pra beber");
        } else {
            System.out.println("Não pode beber");
        }
    }
}
