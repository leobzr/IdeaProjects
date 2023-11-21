package academy.devdojo.maratonajava;

public class EstruturasdeRepetição {
    public static void main(String[] args) {
        //Aulinha básica sobre estuturas de repetição
        //while, do while e for.
        //for (int i = 0; i< 10; i++){
           //System.out.println(i);
        //}
        //exercicio for
        //for (int c = 0; c <= 1000000; c+=2){
           // System.out.println(c);
       // }
        //Exercicio break
        //Carro de 50000, valor da parcela deve ser >= 1000
        //descubra em quantas vezes o carro pode ser pago
        double valorCarro = 50000;
        for(int parcela = 1; parcela < valorCarro; parcela++ ) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela: " + parcela + " R$: " + valorParcela);
            } else {
                break;
            }
        }
    }
}
