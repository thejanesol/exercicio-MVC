package view;

public class PedidoView {
	public void imprimirPedido (String nfe, String data_emissao, double valor_total, String status) {
		System.out.println("***Pedido***\nNFE: " + nfe);
		System.out.println("Data de emissão: " + data_emissao);
		System.out.println("Valor total: " + valor_total);
		System.out.println("Status: " + status);
	}
}