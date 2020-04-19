package br.com.ws.services;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.ws.dao.LivroDao;
import br.com.ws.modelo.Livro;

@WebService
public class LivroService {
	
	@WebResult(name = "livro")
	public Livro busca(@WebParam(name = "id") long id) {
		return new LivroDao().busca(id);
	}
	
	public void adiciona(@WebParam(name = "livro") Livro livro) {
        new LivroDao().adiciona(livro);
	}
	
	public void atualiza(@WebParam(name = "id") long id, @WebParam(name = "livro")Livro livro) {
		new LivroDao().atualiza(id, livro);
	}
	
	public void remove(@WebParam(name = "id") long id) {
		new LivroDao().remove(id);
	}
	
}
