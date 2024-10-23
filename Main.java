class Main {
    public static void main(String[] args) {
        // Criando um filme
        Filme filme = new Filme("Matrix", "Ficção Científica", 120);

        // Criando uma sala de cinema
        SalaCinema sala = new SalaCinema(1, 100, filme);

        // Criando um ingresso
        Ingresso ingresso = new Ingresso(sala, "A10", 30.00, "Inteira");

        // Criando um cliente
        Cliente cliente = new Cliente("João da Silva", "123.456.789-00", "Rua Exemplo, 123", ingresso);

        // Exibindo as informações
        cliente.exibirInformacoes();
    }
}
