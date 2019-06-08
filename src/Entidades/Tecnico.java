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
import Entidades.Tecnico;

public class Tecnico extends Pessoa implements IAtendente<Tecnico> {
	
	private List<Tecnico> tecnicos;
	
	public Tecnico() {
		
		if(tecnicos == null) {
			tecnicos = new ArrayList<Tecnico>();
		}
	}

	@Override
	public List<Tecnico> listar() {
		
		return tecnicos;
	}

	@Override
	public void salvar(Tecnico item) {
		tecnicos.add(item);
	}

	@Override
	public void alterar(Tecnico item) {
		
		
	}

	@Override
	public void remover(int id) {
		
		
	}
	
	

	
	

	
}
