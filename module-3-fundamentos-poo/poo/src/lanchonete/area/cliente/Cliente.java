package lanchonete.area.cliente;

public class Cliente {
    //escolherLanche
    public void escolherLanche() {
        System.out.println("Escolhendo lanche");
    }

    //fazerPedido
    public void fazerPedido() {
        System.out.println("Fazendo pedido");
    }

    //pagarConta
    public void pagarConta() {
        consultarSaldoNoAplicativo();
        System.out.println("Pagando conta");
    }

    //consultarSaldoNoAplicativo
    private void consultarSaldoNoAplicativo() {
        System.out.println("Consultando saldo no aplicativo");
    }

}
