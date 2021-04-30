package okr;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import okr.model.Objective;

@ControllerAdvice
public class ExceptionHandler {
	
	
//	@ExceptionHandler(HttpClientErrorException.class)
//	public ResponseEntity<Objective> handleException(HttpClientErrorException exception) {
//		return null;
//	}

}
