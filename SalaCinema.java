public class SalaCinema {
    private int numeroSala;
    private int capacidademaxima;
    private Filme filmeExibido;

    public SalaCinema(int numeroSala, int capacidademaxima, Filme filmeExibido){
        this.numeroSala = numeroSala;
        this.capacidademaxima = capacidademaxima;
        this.filmeExibido = filmeExibido;
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

    public void exibirInformações(){
        System.out.println("Numero da sala: "+ numeroSala);
        System.out.println("Capaxidade maxima: "+ capacidademaxima);
        filmeExibido.exibirInformacoes();

    }
}
