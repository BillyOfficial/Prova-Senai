package com.aprendiz.projeto.exceptions;

public class NaoEncontradoExceptions extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NaoEncontradoExceptions (String mensagem) {
		super(mensagem);
	}
}
