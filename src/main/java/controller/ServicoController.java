package controller;

import java.util.Scanner;

import bancoDados.BuscaServico;
import bancoDados.DeleteServico;
import bancoDados.InsertServico;
import bancoDados.SelectAllServico;
import model.ServicoAdicional;

public class ServicoController {

    public static void cadastrar(Scanner scanner) {
        System.out.println("Digite o nome do serviço: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a descrição do serviço: ");
        String descricao = scanner.nextLine();

        System.out.println("Digite o preço do serviço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        ServicoAdicional servico = new ServicoAdicional(nome, descricao, preco);

        InsertServico.inserir(servico);
        System.out.println("Serviço cadastrado com sucesso.");
    }

    public static void listarTodos() {
        System.out.println();
        SelectAllServico.select();
        System.out.println();
    }

    public static void buscarPorId(Scanner scanner) {
        System.out.println("Digite o ID do serviço: ");
        int idServico = scanner.nextInt();
        scanner.nextLine();

        BuscaServico.busca(idServico);
    }

    public static void excluir(Scanner scanner) {
        System.out.println("Digite o ID do serviço para excluir: ");
        int idServico = scanner.nextInt();
        scanner.nextLine();

        DeleteServico.delete(idServico);
    }
}
