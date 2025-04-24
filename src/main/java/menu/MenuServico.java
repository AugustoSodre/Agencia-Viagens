package menu;

import java.util.Scanner;

import controller.ServicoController;

public class MenuServico {
    public static void exibir(Scanner scanner) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- Gerenciamento de Serviços Adicionais ---");
            System.out.println("1. Cadastrar serviço");
            System.out.println("2. Listar serviços");
            System.out.println("3. Buscar serviço por ID");
            System.out.println("4. Excluir serviço");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                	System.out.println();
                    ServicoController.cadastrar(scanner);
                    break;
                case 2:
                	System.out.println();
                    ServicoController.listarTodos();
                    break;
                case 3:
                	System.out.println();
                    ServicoController.buscarPorId(scanner);
                    break;
                case 4:
                	System.out.println();
                    ServicoController.excluir(scanner);
                    break;
                case 0:
                    break;
                default:
                	System.out.println();
                    System.out.println("Opção inválida.");
            }
        }
    }
}
