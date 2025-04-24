package menu;

import java.util.Scanner;
import controller.PedidoController;

public class MenuPedido {

    public static void exibir(Scanner scanner) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- Gerenciamento de Pedidos ---");
            System.out.println("1. Cadastrar pedido");
            System.out.println("2. Listar todos os pedidos");
            System.out.println("3. Buscar pedido por ID");
            System.out.println("4. Excluir pedido");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                	System.out.println();
                    PedidoController.cadastrar(scanner);
                    break;
                case 2:
                	System.out.println();
                    PedidoController.listarTodos();
                    break;
                case 3:
                	System.out.println();
                    PedidoController.buscarPorId(scanner);
                    break;
                case 4:
                	System.out.println();
                    PedidoController.excluir(scanner);
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
