package escola;

public class Aluno {
    public String nome;
    public int idade;
    private String sexo;

    //constructor
    public Aluno() {
        this.nome = "Não informado";
        this.idade = 0;
        this.sexo = "Não informado";
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
}
