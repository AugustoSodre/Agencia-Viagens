package controller;

import java.util.Scanner;

import bancoDados.BuscaCliente;
import bancoDados.DeleteCliente;
import bancoDados.InsertCliente;
import bancoDados.SelectAllCliente;
import model.Cliente;
import model.ClienteEstrangeiro;
import model.ClienteNacional;

public class ClienteController {
    public static void cadastrar(Scanner scanner) {
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o CPF ou Passaporte: ");
        String documento = scanner.nextLine();
        
        System.out.println("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        
        System.out.println("Digite o e-mail do cliente: ");
        String email = scanner.nextLine();
        
        System.out.println("Digite o tipo de cliente (nacional/estrangeiro): ");
        String tipo = scanner.nextLine();
        
        Cliente cliente;
        // Criando o objeto Cliente
        if ("nacional".equals(tipo)) {
        	cliente = new ClienteNacional(nome, telefone, email, documento);
        } else {
        	cliente = new ClienteEstrangeiro(nome, telefone, email, documento);
        }
        
        
        // Chamando para salvar
        InsertCliente.inserir(cliente);
        System.out.println("Cliente cadastrado com sucesso.");
    }
    
    public static void listarTodos() {
        System.out.println();
        SelectAllCliente.select();
        System.out.println();
    }
    
    public static void buscarPorId(Scanner scanner) {
        System.out.println("Digite o ID do cliente: ");
        int idCliente = scanner.nextInt();
        
        BuscaCliente.busca(idCliente);
    }
    
    public static void excluir(Scanner scanner) {
        System.out.println("Digite o ID do cliente para excluir: ");
        int idCliente = scanner.nextInt();
        
        DeleteCliente.delete(idCliente);
    }
}
