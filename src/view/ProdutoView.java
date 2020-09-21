package view;

public class ProdutoView {
	public void imprimirProduto (String nome, String descricao, int estoque, double preco) {
		System.out.println("***Produto***\nNome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Estoque: " + estoque);
		System.out.println("Preço: " + preco);
	}
}
