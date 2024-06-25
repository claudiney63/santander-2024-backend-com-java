package lanchonete.atendimento.cozinha;

public class Almoxarife {
    //controlaSaida
    private void controlarSaida() {
        System.out.println("Controlando saída de ingredientes");
    }

    //controlaEntrada
    private void controlarEntrada() {
        System.out.println("Controlando entrada de ingredientes");
    }

    //entregarIngredientes
    void entregarIngredientes() {
        controlarEntrada();
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }

    //trocaGas
    void trocarGas() {
        System.out.println("Trocando gás");
    }
}
