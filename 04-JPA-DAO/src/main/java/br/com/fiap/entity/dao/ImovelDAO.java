package br.com.fiap.entity.dao;

import br.com.fiap.entity.Imovel;
import br.com.fiap.entity.excecao.CommitException;

//INTERFACE SOMENTE AS FUNÇÕES BÁSICAS
public interface ImovelDAO {
	//public opcional, pode-se colocar ou não
	
	public void cadastrar(Imovel imovel); 
		
	public Imovel consultar(int codigo);
	
	void atualizar(Imovel imovel);
	
	void remover(int codigo);
	
	void commit() throws CommitException;
	
}
