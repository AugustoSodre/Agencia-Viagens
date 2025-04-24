package controller;

import java.util.Scanner;

import bancoDados.BuscaPedido;
import bancoDados.DeletePedido;
import bancoDados.InsertPedido;
import bancoDados.SelectAllPedido;
import model.Pedido;

public class PedidoController {
	public static void cadastrar(Scanner scanner) {
		System.out.println("Digite o ID do cliente: ");
        int idCliente = scanner.nextInt();
        
        System.out.println("Digite o ID do pacote: ");
        int idPacote = scanner.nextInt();
        
        System.out.println("Digite a data de contratação (YYYY-MM-DD): ");
        String dataContratacao = scanner.next();
        
        // Criando o objeto Pedido
        Pedido pedido = new Pedido(idCliente, idPacote, dataContratacao);
        
        // Chamando para salvar
        InsertPedido.insert(pedido);;
        System.out.println("Pedido cadastrado com sucesso.");
	}
	
	public static void listarTodos() {
		System.out.println();
		SelectAllPedido.select();
		System.out.println();
	}
	
	public static void buscarPorId(Scanner scanner) {
		System.out.println("Digite o ID do pedido: ");
        int idPedido = scanner.nextInt();
        
        BuscaPedido.busca(idPedido);
	}
	
	public static void excluir(Scanner scanner) {
        System.out.println("Digite o ID do pedido para excluir: ");
        int idPedido = scanner.nextInt();
        
        DeletePedido.delete(idPedido);
    }

}
