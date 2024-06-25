package escola;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    PIAUI("PI", "Piauí"),
    BAHIA("BA", "Bahia");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
