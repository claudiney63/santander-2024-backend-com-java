package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("123456789-00");
        aluno.setNome("João");
        aluno.setIdade(15);
        aluno.setSexo("Masculino");

        EstadoBrasileiro sp = EstadoBrasileiro.SAO_PAULO;

        aluno.setEndereco(sp.getNome() + ", " + sp.getSigla());

        System.out.println("Aluno " + aluno.getNome() + " tem Idade " + aluno.getIdade() + " anos.");
        System.out.println("Sexo: " + aluno.getSexo());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Endereço: " + aluno.getEndereco());
    }
}
