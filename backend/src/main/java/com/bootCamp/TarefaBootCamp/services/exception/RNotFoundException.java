package com.bootCamp.TarefaBootCamp.services.exception;

public class RNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public RNotFoundException(String msg) {
		super(msg);
	}

}
