package academy.devdojo.maratonajava.javacore.introducaometodos;

public class calculadoraTeste01 {
    public static void main(String[] args) {
        //variaveis de referencia, sempre importar criar o objeto
        Calculadora calculadora = new Calculadora();
        calculadora.somaNumeros();
        calculadora.multiplica(2, 3);

        calculadora.dividindo(20, 2);
        System.out.println(calculadora.dividindo(20,2));
    }
}
