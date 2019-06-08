package Entidades;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IAtendimento;

public class Atendimento implements IAtendimento<Atendimento> {
	
	Cliente cliente;
	Atendente funcionarioAtendente;
	Tecnico funcionarioTecnico;
	String data;
	String hora;
	String descricao;
	int prazo;
	
	private List<Atendimento> atendimentos;
	
	public Atendimento() {
		
		if(atendimentos == null) {
			atendimentos = new ArrayList<Atendimento>();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Atendente getFuncionarioAtendente() {
		return funcionarioAtendente;
	}
	public void setFuncionarioAtendente(Atendente funcionarioAtendente) {
		this.funcionarioAtendente = funcionarioAtendente;
	}
	public Tecnico getFuncionarioTecnico() {
		return funcionarioTecnico;
	}

	public void setFuncionarioTecnico(Tecnico funcionarioTecnico) {
		this.funcionarioTecnico = funcionarioTecnico;
	}
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	@Override
	public List<Atendimento> listar() {
		// TODO Auto-generated method stub
		return atendimentos;
	}

	@Override
	public void salvar(Atendimento item) {
		// TODO Auto-generated method stub
		atendimentos.add(item);
		
	}

	@Override
	public void alterar(Atendimento item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int id) {
		// TODO Auto-generated method stub
		
	}




}
