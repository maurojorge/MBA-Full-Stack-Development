/**
 * 
 */
package Interfaces;

/**
 * @author Mauro Jorge Vidal e Xerxes Gouveia
 *
 */

import java.util.List;

public interface IAtendimento <T> {
	
	public List<T> listar();

	public void salvar(T item);
	
	public void alterar(T item);
	
	public void remover(int id);

}
