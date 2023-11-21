package academy.devdojo.maratonajava;

public class operadorTernario {
    public static void main(String[] args) {
       //double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o devdojo";
        String mensagemNaoDoar= "Ainda não tenho dinheiro para doar";
        //(condição) ? verdadeiro : falso;
        //String resultado = salario > 50000 ? mensagemDoar : mensagemNaoDoar;
        //System.out.println(resultado);

        //exercicio do imposto
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaiza = 49.50/100;
        double valorImposto;
        if (salarioAnual <= 34712){
            salarioAnual = salarioAnual*primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            salarioAnual = salarioAnual*segundaFaixa;
        } else {
            salarioAnual = salarioAnual*terceiraFaiza;
        }
        System.out.println(salarioAnual);
    }
}
