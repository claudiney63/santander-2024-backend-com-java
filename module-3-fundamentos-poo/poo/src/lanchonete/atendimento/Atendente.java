package lanchonete.atendimento;

public class Atendente {
    //pegarLancheCozinha
    private void pegarLancheCozinha() {
        System.out.println("Pegando lanche na cozinha");
    }

    //receberPagamento  
    public void receberPagamento() {
        System.out.println("Recebendo pagamento");
    }

    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("Servindo mesa");
    }

    //trocarGas
    void trocarGas() {
        System.out.println("Trocando gás");
    }
}
