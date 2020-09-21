package view;

public class EnderecoView {
	
	public void imprimirEndereco (int numero, String rua, String bairro,
			String complemento, String cidade, String estado) {
		System.out.println("***Endereco***\nRua " + rua + " nº " + numero + ", " 
			+ bairro + ", " + cidade + " - " + estado);
	}

}