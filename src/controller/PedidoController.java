package controller;

import model.Pedido;
import view.PedidoView;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void setNfe (String nfe) {
		model.setNfe(nfe);
	}
	
	public String getNfe (String nfe) {
		return model.getNfe();
	}
	
	public void setData_emissao (String data_emissao) {
		model.setData_emissao(data_emissao);
	}
	
	public String getData_emissao (String data_emissao) {
		return model.getData_emissao();
	}
	
	public void setValor_total (double valor_total) {
		model.setValor_total(valor_total);
	}
	
	public double getValor_total (double valor_total) {
		return model.getValor_total();
	}
	
	public void setStatus (String status) {
		model.setStatus(status);
	}
	
	public String getStatus (String status) {
		return model.getStatus();
	}
	
	public void atualizarView () {
		view.imprimirPedido(model.getNfe(), model.getData_emissao(), model.getValor_total(), model.getStatus());
	}
}
