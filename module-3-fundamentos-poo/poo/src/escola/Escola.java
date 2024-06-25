package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("123456789-00");
        aluno.setNome("João");
        aluno.setIdade(15);
        aluno.setSexo("Masculino");

        System.out.println("Aluno " + aluno.getNome() + " tem Idade " + aluno.getIdade() + " anos.");
        System.out.println("Sexo: " + aluno.getSexo());
        System.out.println("CPF: " + aluno.getCpf());
    }
}
