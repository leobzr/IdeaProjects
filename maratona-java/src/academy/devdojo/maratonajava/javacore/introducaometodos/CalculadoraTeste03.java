package academy.devdojo.maratonajava.javacore.introducaometodos;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(1,2,3,4,5,6,7);
    }
}
