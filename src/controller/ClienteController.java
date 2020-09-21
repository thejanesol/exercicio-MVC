package controller;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	private Cliente model;
	private ClienteView view;
	
	public ClienteController (Cliente model, ClienteView view) {
	      this.model = model;
	      this.view = view;
	}
	
	public void setNomeCliente (String nome) {
		model.setNome(nome);
	}
	
	public String getNomeCliente (String nome) {
		return model.getNome();
	}
	
	public void setId_cliente (int id_cliente) {
		model.setId_cliente(id_cliente);
	}
	
	public int getId_cliente (int id_cliente) {
		return model.getId_cliente();
	}
	
	public void setCpfCliente (String cpf) {
		model.setCpf(cpf);
	}
	
	public String getCpfCliente (String cpf) {
		return model.getCpf();
	}
	
	public void setRgCliente (String rg) {
		model.setRg(rg);
	}
	
	public String getRgCliente (String rg) {
		return model.getRg();
	}
	
	public void setEmailCliente (String email) {
		model.setEmail(email);
	}
	
	public String getEmailCliente (String email) {
		return model.getEmail();
	}
	
	public void setData_nascimentoCliente (String data_nascimento) {
		model.setData_nascimento(data_nascimento);
	}
	
	public String getData_nascimento_Cliente (String data_nascimento) {
		return model.getData_nascimento();
	}
	
	public void atualizarView () {
		view.imprimirCliente(model.getId_cliente(), model.getNome(), 
				model.getCpf(), model.getRg(), model.getEmail(), model.getData_nascimento());
	}
}
