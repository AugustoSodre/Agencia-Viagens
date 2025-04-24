package controller;

import java.util.Scanner;

import bancoDados.BuscaPacote;
import bancoDados.DeletePacote;
import bancoDados.InsertPacote;
import bancoDados.SelectAllPacote;
import model.PacoteAventura;
import model.PacoteCultural;
import model.PacoteLuxo;
import model.PacoteOutro;
import model.PacoteViagem;

public class PacoteController {
    public static void cadastrar(Scanner scanner) {
        System.out.println("Digite o nome do pacote: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o destino: ");
        String destino = scanner.nextLine();

        System.out.println("Digite a duração (número de dias): ");
        int duracao = scanner.nextInt();

        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o tipo de pacote (aventura/luxo/cultural/outro): ");
        String tipo = scanner.nextLine();

        PacoteViagem pacote;

        switch (tipo.toLowerCase()) {
            case "aventura":
                System.out.println("Digite a atividade principal do pacote de aventura: ");
                String atividade = scanner.nextLine();
                pacote = new PacoteAventura(nome, destino, duracao, preco, atividade);
                break;
            case "luxo":
                System.out.println("Digite a descrição do pacote de luxo: ");
                String descricaoLuxo = scanner.nextLine();
                pacote = new PacoteLuxo(nome, destino, duracao, preco, descricaoLuxo);
                break;
            case "cultural":
                System.out.println("Digite o tema cultural do pacote: ");
                String tema = scanner.nextLine();
                pacote = new PacoteCultural(nome, destino, duracao, preco, tema);
                break;
            case "outro":
                System.out.println("Digite a descrição do pacote: ");
                String descricaoOutro = scanner.nextLine();
                System.out.println("Digite o tipo específico do pacote: ");
                String tipoOutro = scanner.nextLine();
                pacote = new PacoteOutro(nome, destino, duracao, preco, descricaoOutro, tipoOutro);
                break;
            default:
                System.out.println("Tipo inválido. Cadastro cancelado.");
                return;
        }

        InsertPacote.inserir(pacote);
        System.out.println("Pacote cadastrado com sucesso.");
    }

    public static void listarTodos() {
        System.out.println();
        SelectAllPacote.select();
        System.out.println();
    }

    public static void buscarPorId(Scanner scanner) {
        System.out.println("Digite o ID do pacote: ");
        int idPacote = scanner.nextInt();

        BuscaPacote.busca(idPacote);
    }

    public static void excluir(Scanner scanner) {
        System.out.println("Digite o ID do pacote para excluir: ");
        int idPacote = scanner.nextInt();

        DeletePacote.delete(idPacote);
    }
}
