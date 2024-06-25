package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void levarIngredientes() {
        System.out.println("Levando ingredientes para a cozinha");
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche");
    }

    private void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarLancheNoBalcao() {
        prepararCombo();
        System.out.println("Adicionando lanche no balcão");
    }

    //pedirIngredientes
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
