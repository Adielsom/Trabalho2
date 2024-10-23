public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private Ingresso ingresso;


    public Cliente(String nome, String cpf, String endereco, Ingresso ingresso) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.ingresso = ingresso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        ingresso.exibirInformacoes();
    }
}
