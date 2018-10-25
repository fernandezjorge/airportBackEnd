package com.dxc.tddExample.tools;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InternalServerErrorException extends RuntimeException {

	private static final long serialVersionUID = -2371146358617471048L;

	public InternalServerErrorException(String msg) {
		super(msg);
	}
}
