package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setIdade(15);
        aluno.setSexo("Masculino");

        System.out.println("Aluno " + aluno.nome + " tem Idade " + aluno.idade + " anos.");
        System.out.println("Sexo: " + aluno.getSexo());
    }
}
