package br.com.ws.services;

import java.net.URI;

import javax.jws.WebService;

import br.com.ws.dao.CarrinhoDAO;
import br.com.ws.modelo.Carrinho;
import br.com.ws.modelo.Produto;

@WebService
public class CarrinhoService {
	
//	@GET
//	@Path("{id}")
//    @Produces(MediaType.APPLICATION_XML)
//	public Carrinho busca(@PathParam("id") long id) {
	public Carrinho busca(long id) {
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		return carrinho;
	}
	
//	@POST
//	@Consumes(MediaType.APPLICATION_XML)
	public void adiciona(Carrinho carrinho) {
        new CarrinhoDAO().adiciona(carrinho);
        URI uri = URI.create("/carrinhos/" + carrinho.getId());
	}
	
//	@DELETE
//	@Path("{id}/produtos/{produtoId}")
//	public Response removeProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId) {
	public void removeProduto(long id, long produtoId) {
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		carrinho.remove(produtoId);;
	}
	
//	@PUT
//	@Path("{id}/produtos/{produtoId}")
//	@Consumes(MediaType.APPLICATION_XML)
//	public Response atualizaProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId, Produto produto) {
	public void atualizaProduto(long id, long produtoId, Produto produto) {
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		carrinho.troca(produto);
	}
	
//	@PUT
//	@Path("{id}/produtos/{produtoId}/quantidade")
//	@Consumes(MediaType.APPLICATION_XML)
//	public Response atualizaQuantidadeProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId, Produto produto) {
	public void atualizaQuantidadeProduto(long id, long produtoId, Produto produto) {
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		carrinho.trocaQuantidade(produto);
	}

}
