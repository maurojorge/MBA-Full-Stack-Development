/**
 * 
 */
package Entidades;

import java.util.ArrayList;

/**
 * @author Mauro Jorge Vidal e Xerxes Gouveia
 *
 */


import java.util.List;

import Interfaces.IAtendente;
import Entidades.Cliente;

public class Cliente extends Pessoa implements IAtendente<Cliente> {
	
	private List<Cliente> clientes;
	
	public Cliente() {
		
		if(clientes == null) {
			clientes = new ArrayList<Cliente>();
		}
	}

	@Override
	public List<Cliente> listar() {
		
		return clientes;
	}

	@Override
	public void salvar(Cliente item) {
		clientes.add(item);
	}

	@Override
	public void alterar(Cliente item) {
		
		
	}

	@Override
	public void remover(int id) {
		
		
	}
	
	

	
/*	
List<Pessoa> listaAtendentes = new ArrayList<Pessoa>();
	
	@Override
	public List<Pessoa> listarAtendente() {
		
		return listaAtendentes;
	}

	@Override
	public boolean salvarAtendente(Pessoa atendente) {
		
		try {
			
			listaAtendentes.add(atendente);
			
		}catch (Exception e) {
			
			return false;
			
		}
		
		return true;
	}

	@Override
	public boolean deletarAtendentePorId(int id) {
	
		for (Pessoa atendente : listaAtendentes) {
			if(atendente.getId() == id) {
				listaAtendentes.remove(atendente);
			}
		}
		
		return false;
	}

	@Override
	public boolean editarAtendente(Pessoa atendente) {
		
		for (Pessoa atendente2 : listaAtendentes) {
			if(atendente2.getId() == atendente.getId()) {
				
				listaAtendentes.remove(atendente2);
				listaAtendentes.add(atendente);
				
			}
		}
		
		return false;
	}*/


	

	
}
