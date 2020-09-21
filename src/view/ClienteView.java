package view;

public class ClienteView {
	public void imprimirCliente (int id_cliente, String nomeCliente, String cpfCliente, 
			String rgCliente, String emailCliente, String data_nascimentoCliente) {
		System.out.println("***Cliente***\nCódigo: " + id_cliente );
		System.out.println("Nome: " + nomeCliente);
		System.out.println("CPF: " + cpfCliente);
		System.out.println("RG: " + rgCliente);
		System.out.println("Email: " + emailCliente);
		System.out.println("Data de nascimento: " + data_nascimentoCliente);
	}
}

