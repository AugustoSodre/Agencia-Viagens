package model;

public class PacoteCultural extends PacoteViagem{
	public PacoteCultural(String nome, String destino, 
			int duracao, double preco, String descricao) {
		this.setNome(nome);
		this.setDestino(destino);
		this.setDuracao(duracao);
		this.setPreco(preco);
		this.setDescricao(descricao);
		this.setTipo("cultural");
	}

}
