package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setNome (String nome) {
		model.setNome(nome);
	}
	
	public String getNome (String nome) {
		return model.getNome();
	}
	
	public void setDescricao (String descricao) {
		model.setDescricao(descricao);
	}
	
	public String getDescricao (String descricao) {
		return model.getDescricao();
	}
	
	public void setEstoque (int estoque) {
		model.setEstoque(estoque);
	}
	
	public int getEstoque (int estoque) {
		return model.getEstoque();
	}
	
	public void setPreco (double preco) {
		model.setPreco(preco);
	}
	
	public double getPreco (double preco) {
		return model.getPreco();
	}
	
	public void atualizarView () {
		view.imprimirProduto(model.getNome(), model.getDescricao(), model.getEstoque(), model.getPreco());
	}
	
}
