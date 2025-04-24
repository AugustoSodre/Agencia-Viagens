package menu;

import java.util.Scanner;

public class Menu {

    public static void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
        	System.out.println();
            System.out.println("=========== MENU AGENCIA DE VIAGENS ===========");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Pacotes de Viagem");
            System.out.println("3. Gerenciar Serviços Adicionais");
            System.out.println("4. Gerenciar Pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            

            switch (opcao) {
                case 1:
                	System.out.println();
                    MenuCliente.exibir(scanner);
                    break;
                case 2:
                	System.out.println();
                    MenuPacote.exibir(scanner);
                    break;
                case 3:
                    MenuServico.exibir(scanner);
                    break;
                case 4:
                	System.out.println();
                    MenuPedido.exibir(scanner);
                    break;
                case 0:
                	System.out.println();
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                	System.out.println();
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
