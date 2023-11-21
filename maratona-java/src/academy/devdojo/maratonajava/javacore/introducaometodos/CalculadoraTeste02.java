package academy.devdojo.maratonajava.javacore.introducaometodos;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        //sempre para chamar uma função, criar um objeto dela com a variavel de referencia
        Calculadora calculadora = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calculadora.alteraDoisNumeros(n1, n2);
        System.out.println(n1);
        System.out.println(n2);
    }
}
