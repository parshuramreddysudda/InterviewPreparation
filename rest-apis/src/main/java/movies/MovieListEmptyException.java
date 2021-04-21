package movies;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class MovieListEmptyException extends RuntimeException {

	public MovieListEmptyException(String message) {
		super(message);
	}

}
