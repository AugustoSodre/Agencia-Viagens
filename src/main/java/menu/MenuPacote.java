package menu;

import java.util.Scanner;

import controller.PacoteController;

public class MenuPacote {
    public static void exibir(Scanner scanner) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- Gerenciamento de Pacotes de Viagem ---");
            System.out.println("1. Cadastrar pacote");
            System.out.println("2. Listar pacotes");
            System.out.println("3. Buscar pacote por ID");
            System.out.println("4. Excluir pacote");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                	System.out.println();
                    PacoteController.cadastrar(scanner);
                    break;
                case 2:
                	System.out.println();
                    PacoteController.listarTodos();
                    break;
                case 3:
                	System.out.println();
                    PacoteController.buscarPorId(scanner);
                    break;
                case 4:
                	System.out.println();
                    PacoteController.excluir(scanner);
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
