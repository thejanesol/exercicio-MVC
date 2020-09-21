package controller;

import model.Telefone;
import view.TelefoneView;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setDdd (String ddd) {
		model.setDdd(ddd);
	}
	
	public String getDdd (String ddd) {
		return model.getDdd();
	}
	
	public void setNumero (String numero) {
		model.setNumero(numero);
	}
	
	public String getNumero (String numero) {
		return model.getNumero();
	}
	
	public void atualizarView () {
		view.imprimirTelefone(model.getDdd(), model.getNumero());
	}
	
}
