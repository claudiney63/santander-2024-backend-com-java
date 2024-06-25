package escola;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;

    //constructor
    public Aluno(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setSexo(String newSexo) {
        this.sexo = newSexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }
}
