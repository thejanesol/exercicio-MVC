package model;

public class Pedido {
	private String nfe;
	private String data_emissao;
	private double valor_total;
	private String status;
	
	public String getNfe() {
		return nfe;
	}
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public String getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(String data_emissao) {
		this.data_emissao = data_emissao;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
}
