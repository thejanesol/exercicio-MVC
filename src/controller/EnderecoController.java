package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setNumero (int numero) {
		model.setNumero(numero);
	}
	
	public int getNumero (int numero) {
		return model.getNumero();
	}
	
	public void setRua (String rua) {
		model.setRua(rua);
	}
	
	public String getRua (String rua) {
		return model.getRua();
	}
	
	public void setBairro (String bairro) {
		model.setBairro(bairro);
	}
	
	public String getBairro (String bairro) {
		return model.getBairro();
	}
	
	public void setComplemento (String complemento) {
		model.setComplemento(complemento);
	}
	
	public String getComplemento (String complemento) {
		return model.getComplemento();
	}
	
	public void setCidade (String cidade) {
		model.setCidade(cidade);
	}
	
	public String getCidade (String cidade) {
		return model.getCidade();
	}
	
	public void setEstado (String estado) {
		model.setEstado(estado);
	}
	
	public String getEstado (String estado) {
		return model.getEstado();
	}
	
	public void atualizarView () {
		view.imprimirEndereco(model.getNumero(), model.getRua(), model.getBairro(),
			model.getComplemento(), model.getCidade(), model.getEstado());
	}
	
}
