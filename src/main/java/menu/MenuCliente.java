package menu;

import java.util.Scanner;

import controller.ClienteController;

public class MenuCliente {
    public static void exibir(Scanner scanner) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- Gerenciamento de Clientes ---");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente por ID");
            System.out.println("4. Excluir cliente");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                	System.out.println();
                    ClienteController.cadastrar(scanner);
                    break;
                case 2:
                	System.out.println();
                    ClienteController.listarTodos();
                    break;
                case 3:
                	System.out.println();
                    ClienteController.buscarPorId(scanner);
                    break;
                case 4:
                	System.out.println();
                    ClienteController.excluir(scanner);
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
