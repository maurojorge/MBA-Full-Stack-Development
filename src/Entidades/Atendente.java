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
import Entidades.Atendente;

public class Atendente extends Pessoa implements IAtendente<Atendente> {
	
	private List<Atendente> atendentes;
	
	public Atendente() {
		
		if(atendentes == null) {
			atendentes = new ArrayList<Atendente>();
		}
	}

	@Override
	public List<Atendente> listar() {
		
		return atendentes;
	}

	@Override
	public void salvar(Atendente item) {
		atendentes.add(item);
	}

	@Override
	public void alterar(Atendente item) {
		
		
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
