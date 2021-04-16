package okr.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private final Exception exception;
	private final HttpStatus httpStatus;
	
	
	public BadRequestException(Exception exception, HttpStatus hhtStatus) {
		super();
		this.exception = exception;
		this.httpStatus = hhtStatus;
	}


	public Exception getException() {
		return exception;
	}


	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
}
