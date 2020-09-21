package main;

import controller.ClienteController;
import controller.EnderecoController;
import controller.PedidoController;
import controller.ProdutoController;
import controller.TelefoneController;
import model.Cliente;
import model.Endereco;
import model.Pedido;
import model.Produto;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.PedidoView;
import view.ProdutoView;
import view.TelefoneView;

public class Programa {
	public static void main(String[] args) {
		
		Cliente cmodel = new Cliente();
		ClienteView cview = new ClienteView();
		ClienteController ccontroller = new ClienteController(cmodel, cview);
		
		/*Testes cliente
		ccontroller.atualizarView();
		ccontroller.setNomeCliente("Ana");
		ccontroller.setData_nascimentoCliente("01.02.2000");
		ccontroller.atualizarView();
		*/

		
		Pedido pmodel = new Pedido();
		PedidoView pview = new PedidoView();
		PedidoController pcontroller = new PedidoController(pmodel, pview);
		
		/*Testes pedido
		pcontroller.atualizarView();
		pcontroller.setNfe("2121245");
		pcontroller.atualizarView();
		*/
		
		Produto pomodel = new Produto();
		ProdutoView poview = new ProdutoView();
		ProdutoController pocontroller = new ProdutoController(pomodel, poview);
		
		/*Testes produto
		pocontroller.atualizarView();
		pocontroller.setPreco(1200);
		pocontroller.atualizarView();
		*/
		
		
		Telefone tmodel = new Telefone();
		TelefoneView tview = new TelefoneView();
		TelefoneController tcontroller = new TelefoneController(tmodel, tview);
		
		/*Testes telefone
		tcontroller.atualizarView();
		tcontroller.setDdd("001");
		tcontroller.setNumero("01010101");
		tcontroller.atualizarView();
		*/
		
		Endereco emodel = new Endereco();
		EnderecoView eview = new EnderecoView();
		EnderecoController econtroller = new EnderecoController(emodel, eview);
		
		/*Testes endereco
		econtroller.atualizarView();
		econtroller.setBairro("Semear");
		econtroller.setRua("Sementes");
		econtroller.setNumero(0);
		econtroller.setCidade("Cidade das Flores");
		econtroller.setEstado("Bahia");
		econtroller.atualizarView();
		*/
		
		
		
		
		
	}
}
