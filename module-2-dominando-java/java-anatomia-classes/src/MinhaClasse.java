public class MinhaClasse {
    public static void main(String[] args) throws Exception {

        int x = 10;
        String nome = "Fulano";
        float y = 10.5f;
        double z = 10.5;
        char c = 'A';
        boolean b = true;

        if (x > 5) {
            System.out.println("X é maior que 5");
        } else {
            System.out.println("X é menor ou igual a 5");
        }

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de nome: " + nome);
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de z: " + z);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de b: " + b);
    }

    public int calcularIdade(int anoNascimento, int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
