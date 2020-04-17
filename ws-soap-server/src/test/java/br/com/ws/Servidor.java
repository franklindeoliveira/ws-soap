package br.com.ws;

import java.io.IOException;

import javax.xml.ws.Endpoint;

import br.com.ws.services.CarrinhoService;

public class Servidor {

	private static Endpoint server;

	public static void main(String[] args) throws IOException {
		iniciar();
		System.in.read();
	}

	public static void iniciar() {
		try {
			CarrinhoService servico = new CarrinhoService();
	    	String url = "http://localhost:8080/carrinhos";
	        server = Endpoint.publish(url, servico);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void parar() {
		server.stop();
	}

}
