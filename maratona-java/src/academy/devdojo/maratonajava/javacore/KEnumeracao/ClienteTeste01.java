package academy.devdojo.maratonajava.javacore.KEnumeracao;

public class ClienteTeste01 {
    public static void main(String[] args) {
        //Voce quer criar um cliente que seja pessoa fisica ou juridica
        Cliente cliente1 = new Cliente("Jaime", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Jaiminho", TipoCliente.PESSOA_JURIDICA);
        //As vezes, dependendo de quem estará trabalhando com estes dados
        //pode acabar gerando uma inconsistencia de dados.

    }
}
