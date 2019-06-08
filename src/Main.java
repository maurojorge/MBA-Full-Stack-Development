/**
 * 
 */

/**
 * @author Mauro Jorge Vidal e Xerxes Gouveia
 *
 */

import Entidades.Atendente;
import Entidades.Atendimento;
import Entidades.Cliente;
import Entidades.Tecnico;

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
		Cliente cliente = new Cliente();
		Atendimento atendimento = new Atendimento();
		Tecnico tecnico = new Tecnico();
		Collection<Atendente> atendentes = new ArrayList<Atendente>();
		Collection<Cliente> clientes = new ArrayList<Cliente>();
		Collection<Atendimento> atendimentos = new ArrayList<Atendimento>();
		Collection<Tecnico> tecnicos = new ArrayList<Tecnico>();
		
		while(continua == true) {
			System.out.println("Digite a opção que deseja realizar:");
			System.out.println("1 - Cadastrar Usuário");
			System.out.println("2 - Listar Usuários");
			System.out.println("3 - Cadastrar Cliente");
			System.out.println("4 - Listar Clientes");
			System.out.println("5 - Cadastrar Atendimento");
			System.out.println("6 - Listar Atendimentos");
			System.out.println("7 - Sair");
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
					
				}else if(tipoPessoa.equals("2")){
					
					Tecnico tecnico1 = new Tecnico();
					
					System.out.println("Informações do Técnico:");
					System.out.println("Digite o nome:");
					tecnico1.setNome(buf.readLine());
					System.out.println("Digite o telefone:");
					tecnico1.setTelefone(buf.readLine());
					
					tecnico.salvar(tecnico1);
					continua = true;
					
				}
				
			}else if(opcao.equals("2")){
				
				
				atendentes = atendente.listar();
				tecnicos = tecnico.listar();
				
				for (Atendente a : atendentes) {
					System.out.println("Nome: "+a.getNome());
					System.out.println("Telefone: "+a.getTelefone());
					System.out.println("--------------------------------------");
				}
				
				for (Tecnico t : tecnicos) {
					System.out.println("Nome: "+t.getNome());
					System.out.println("Telefone: "+t.getTelefone());
					System.out.println("--------------------------------------");
				}
				
				continua = true;
				
			}else if(opcao.equals("3")) {
				
				Cliente cliente1 = new Cliente();
				
				System.out.println("Informações do Cliente:");
				System.out.println("Digite o nome:");
				cliente1.setNome(buf.readLine());
				System.out.println("Digite o telefone:");
				cliente1.setTelefone(buf.readLine());
				
				cliente.salvar(cliente1);
				continua = true;
				
			}else if(opcao.equals("4")){
				
				clientes = cliente.listar();
				
				for (Cliente a : clientes) {
					System.out.println("Nome: "+a.getNome());
					System.out.println("Telefone: "+a.getTelefone());
					System.out.println("--------------------------------------");
				}
				
				continua = true;
				
			}else if(opcao.equals("5")) {
				Atendimento atendimento1 = new Atendimento();
				int nomeCerto = 0;
				int atendenteCerto = 0;
				int tecnicoCerto = 0;
				System.out.println("Informações do Atendendimento:");
				
				while(nomeCerto == 0) {
					System.out.println("Digite o nome do cliente:");
					String nome = buf.readLine();
					clientes = cliente.listar();
					for (Cliente c : clientes) {
						if(nome.equals(c.getNome())) {
							nomeCerto++;
							atendimento1.setCliente(c);
						}
					}
					if(nomeCerto ==0) {
						System.out.println("Digite o nome certo!");
					}
				}
				
				while(atendenteCerto == 0) {
					System.out.println("Digite o nome do atendente:");
					String nome = buf.readLine();
					atendentes = atendente.listar();
					for (Atendente a : atendentes) {
						if(nome.equals(a.getNome())) {
							atendenteCerto++;
							atendimento1.setFuncionarioAtendente(a);
						}
					}
					if(atendenteCerto ==0) {
						System.out.println("Digite o nome certo!");
					}
				}
				
				while(tecnicoCerto == 0) {
					System.out.println("Digite o nome do técnico responsável:");
					String nome = buf.readLine();
					tecnicos = tecnico.listar();
					for (Tecnico t : tecnicos) {
						if(nome.equals(t.getNome())) {
							tecnicoCerto++;
							atendimento1.setFuncionarioTecnico(t);
						}
					}
					if(atendenteCerto ==0) {
						System.out.println("Digite o nome certo!");
					}
				}
				System.out.println("Digite a descrição do atendimento:");
				atendimento1.setDescricao(buf.readLine());
				System.out.println("Digite a data do atendimento:");
				atendimento1.setData(buf.readLine());
				System.out.println("Digite a hora do atendimento:");
				atendimento1.setHora(buf.readLine());
				System.out.println("Digite o prazo");
				atendimento1.setPrazo(Integer.parseInt(buf.readLine()));
				atendimento.salvar(atendimento1);
				continua = true;
				
			}else if(opcao.equals("6")){
				atendimentos = atendimento.listar();
				for (Atendimento a : atendimentos) {
					System.out.println("Nome do cliente: "+a.getCliente().getNome());
					System.out.println("Nome do funcionário atendente: "+a.getFuncionarioAtendente().getNome());
					System.out.println("Nome do técnico atendente: "+a.getFuncionarioTecnico().getNome());
					System.out.println("Descricao: "+a.getDescricao());
					System.out.println("Data: "+a.getData());
					System.out.println("Hora: "+a.getHora());
					System.out.println("--------------------------------------");
				}
				continua = true;
			} else if(opcao.equals("7")) {
				continua = false;
			}else {
				System.out.println("Opção inválida!");
				continua = true;
			}
		}
		
	}

}