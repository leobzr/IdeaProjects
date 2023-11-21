package academy.devdojo.maratonajava.javacore.introducaometodos;


public class Calculadora {
    //agora que já sabemos o básico de um atributo, vamos entender um método
    //um metodo precisa de um modificador de acesso, um retorno e o nome do método

    public void somaNumeros(){
        System.out.println(10 + 10);
    }

    public void multiplica(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public double dividindo(double n1, double n2){
        if (n2 == 0){
            return 0;
        } else {
            return n1/n2;
        }
    }

    public void alteraDoisNumeros(int n1, int n2){
        //isso altera o valor dos numeros que recebe aqui em cima
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do Altera dois numeros");
        System.out.printf("\nNum 1: %d\n", n1);
        System.out.printf("\nNum2: %d\n",n2);
    }

    public void somaArray(int[] numeros){
        int some = 0;
        for (int num:
             numeros) {
            some += num;
        }
        System.out.println(some);
    }

    //e se caso eu queira fazer uma soma desse tipo de uma maneira muito mais fácil?
    //usando o varargs:
    public void somaVarargs(int... numeros){ //sim, a sintaxe é desse jeito mesmo
        //A parte de dentro é a mesma que o exemplo de cima, o que muda é na chamada do varargs no main
        int some = 0;
        for (int num:
                numeros) {
            some += num;
        }
        System.out.println(some);
    }
}

