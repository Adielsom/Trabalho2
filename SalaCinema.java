public class SalaCinema {
    private int numeroSala;
    private int capacidademaxima;
    private Filme filmeExibido;

    public SalaCinema(int numeroSala, int capacidademaxima){
        this.numeroSala = numeroSala;
        this.capacidademaxima = capacidademaxima;
    }

    public int getNumeroSala(){
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala){
        this.numeroSala = numeroSala;
    }

    public int getCapacidademaxima(){
        return capacidademaxima;
    }

    public void setCapacidademaxima(int capacidademaxima){
        this.capacidademaxima = capacidademaxima;
    }

    public Filme getFilmeExibido(){
        return filmeExibido;
    }

    public void setFilmeExibido(Filme filmeExibido){
        this.filmeExibido = filmeExibido;
    }

    public void exibirInformacoes(){
        System.out.println("Número da sala: " + numeroSala);
        System.out.println("Capacidade máxima: " + capacidademaxima);
        if (filmeExibido != null) {
            filmeExibido.exibirInformacoes();
        } else {
            System.out.println("Nenhum filme exibido nesta sala.");
        }
    }

    @Override
    public String toString() {
        return "SalaCinema{" +
                "numeroSala=" + numeroSala +
                ", capacidademaxima=" + capacidademaxima +
                ", filmeExibido=" + (filmeExibido != null ? filmeExibido.getTitulo() : "Nenhum filme exibido") +
                '}';
    }
}
