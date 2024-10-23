
public class Ingresso {
    private SalaCinema sala;
    private String assento;
    private double preco;
    private String tipoIngresso;


    public Ingresso(SalaCinema sala, String assento, double preco, String tipoIngresso) {
        this.sala = sala;
        this.assento = assento;
        this.preco = preco;
        this.tipoIngresso = tipoIngresso;
    }


    public SalaCinema getSala() {
        return sala;
    }

    public void setSala(SalaCinema sala) {
        this.sala = sala;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }


    public void exibirInformacoes() {
        System.out.println("Sala: " + sala.getNumeroSala());
        System.out.println("Assento: " + assento);
        System.out.println("Tipo de Ingresso: " + tipoIngresso);
        System.out.println("Preço: R$ " + preco);
    }
}
