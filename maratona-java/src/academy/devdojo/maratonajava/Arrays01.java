package academy.devdojo.maratonajava;
import java.util.ArrayList;
public class Arrays01 {
    public static void main(String[] args) {
        //primeira forma:
        //nesse caso é necessário indicar o espaço de memória
        int[] idades= new int[3];
        //indice começa no 0, sendo  0, 1 e 2.
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 23;

        for ( int idade : idades) {
            System.out.println(idade);
        }

        //segunda forma de inicializar um array:
        int numeros[] = {1, 2, 3, 4, 5};

    }
}
