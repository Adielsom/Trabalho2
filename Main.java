import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static List<Filme> filmes = new ArrayList<>();
    public static List<SalaCinema> salas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    cadastrarSalaCinema();
                    break;
                case 3:
                    listaFilmes();
                    break;
                case 4:
                    listarSalaCinema();
                    break;
                case 5:
                    associarFilmeASala();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("----MENU----");
        System.out.println("1. Cadastrar Filmes");
        System.out.println("2. Cadastrar Salas");
        System.out.println("3. Listar Filmes");
        System.out.println("4. Listar Salas");
        System.out.println("5. Associar Filme a Sala");
        System.out.println("0. Sair");
        System.out.println("Digite a opção:");
    }

    public static void cadastrarFilme() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do filme: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o gênero do filme: ");
        String genero = scanner.nextLine();
        System.out.print("Digite a duração do filme (em minutos): ");
        int duracao = scanner.nextInt();
        Filme filme = new Filme(titulo, genero, duracao);
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    public static void listaFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado");
        } else {
            System.out.println("----Lista de filmes----");
            for (Filme filme : filmes) {
                System.out.println(filme);
            }
        }
    }

    public static void cadastrarSalaCinema() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da Sala: ");
        int numeroSala = scanner.nextInt();
        System.out.print("Digite a capacidade máxima: ");
        int capacidademaxima = scanner.nextInt();
        SalaCinema sala = new SalaCinema(numeroSala, capacidademaxima);
        salas.add(sala);
        System.out.println("Sala cadastrada com sucesso!");
    }

    public static void listarSalaCinema() {
        if (salas.isEmpty()) {
            System.out.println("Nenhuma sala cadastrada");
        } else {
            System.out.println("----Lista de salas----");
            for (SalaCinema sala : salas) {
                System.out.println("Número da Sala: " + sala.getNumeroSala());
                System.out.println("Capacidade Máxima: " + sala.getCapacidademaxima());
                if (sala.getFilmeExibido() != null) {
                    System.out.println("Filme Exibido: " + sala.getFilmeExibido().getTitulo());
                } else {
                    System.out.println("Nenhum filme exibido nesta sala.");
                }
                System.out.println("--------------");
            }
        }
    }

    public static void associarFilmeASala() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da sala para associar um filme:");
        int numeroSala = sc.nextInt();
        sc.nextLine();

        SalaCinema sala = null;
        for (SalaCinema s : salas) {
            if (s.getNumeroSala() == numeroSala) {
                sala = s;
                break;
            }
        }

        if (sala == null) {
            System.out.println("Sala não encontrada.");
            return;
        }

        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado. Cadastre um filme primeiro.");
            return;
        }

        System.out.println("Escolha um filme para associar a esta sala:");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i + 1) + ". " + filmes.get(i).getTitulo());
        }

        int filmeEscolhido = sc.nextInt();

        if (filmeEscolhido < 1 || filmeEscolhido > filmes.size()) {
            System.out.println("Escolha inválida.");
        } else {
            sala.setFilmeExibido(filmes.get(filmeEscolhido - 1));
            System.out.println("Filme associado à sala com sucesso!");
        }
    }
}
