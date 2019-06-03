/**
 * 
 */

/**
 * @author Mauro Jorge Vidal e Xerxes Gouveia
 *
 */

import Entidades.Atendente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;


public class Main {

	/**
	 * @param args
	 */
	
	//static RepositorioAtendente rp = new RepositorioAtendente();
	
	public static void main(String[] args) throws IOException {
		
		boolean continua = true;
		
		InputStreamReader inputStr = new InputStreamReader( System.in );
		BufferedReader buf = new BufferedReader(inputStr);
		Atendente atendente = new Atendente();
		Collection<Atendente> atendentes = new ArrayList<Atendente>();
		
		while(continua == true) {
			System.out.println("Digite a opção que deseja realizar:");
			System.out.println("1 - Cadastrar Usuário");
			System.out.println("2 - Listar Usuários");
			System.out.println("3 - Sair");
			String opcao = 	buf.readLine();
			
			if(opcao.equals("1")) {
				
				System.out.println("Digite o tipo da pessoa:");
				System.out.println("1 - Atendente");
				System.out.println("2 - Técnico");
				String tipoPessoa = buf.readLine();
				
				if(tipoPessoa.equals("1")) {
					
					Atendente atendente1 = new Atendente();
					
					System.out.println("Informações do Atendente:");
					System.out.println("Digite o nome:");
					atendente1.setNome(buf.readLine());
					System.out.println("Digite o telefone:");
					atendente1.setTelefone(buf.readLine());
					
					atendente.salvar(atendente1);
					continua = true;
					
				}else {
					
					System.out.println("--------------------------------------");
					System.out.println("Falta Implementar");
					System.out.println("--------------------------------------");
					
					/*Tecnico tecnico1 = new Tecnico();
					
					System.out.println("Informações do Atendente:");
					System.out.println("Digite o nome:");
					tecnico1.setNome(buf.readLine());
					System.out.println("Digite o telefone:");
					tecnico1.setTelefone(buf.readLine());
					
					tecnico.salvar(tecnico1);
					continua = true;*/
					
				}
				
			}else if(opcao.equals("2")){
				
				
				atendentes = atendente.listar();
				
				for (Atendente a : atendentes) {
					System.out.println("Nome: "+a.getNome());
					System.out.println("Telefone: "+a.getTelefone());
					System.out.println("--------------------------------------");
				}
				
				continua = true;
				
			}else if(opcao.equals("3")) {
				continua = false;
			}else {
				System.out.println("Opção inválida!");
				continua = true;
			}
		}
		
	}

}
