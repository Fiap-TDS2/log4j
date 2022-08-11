package br.com.fiap.log.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Teste {

	private static final Logger LOGGER = LogManager.getLogger(Teste.class.getName());
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando aplicação!");
        LOGGER.info("Aplicação iniciada com sucesso");

        System.out.println("Simulando um erro no log");
		LOGGER.error("Exception...");
	}
	
}