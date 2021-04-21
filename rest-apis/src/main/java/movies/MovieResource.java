package movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieResource {

	@Autowired
	private MovieDoa service;

	@GetMapping("/movies")
	public List<Movie> retriveAllUsers() {
		List<Movie> movies = service.getAllMovies();

		if (movies.size() < 0)
			throw new MovieListEmptyException("List is Empty");

		return movies;
	}

	@GetMapping("/movies/{id}")
	public Movie getUser(@PathVariable int id) {
		Movie movie = service.findMovie(id);
		if (movie == null)
			throw new MovieNotFoundException("Id has not found" + id);

		return movie;
	}

	@PostMapping("/movies")
	public Movie addUser(@RequestBody Movie movie) {
		return service.addMovie(movie);
	}

	@PutMapping("/movies")
	public Movie editUser(@RequestBody Movie movie) {
		return service.editMovie(movie);
	}

	@DeleteMapping("/movies/{id}")
	public String deleteUser(@PathVariable int id) {
		Movie movie = service.deleteMovie(id);
		if (movie == null)
			throw new MovieNotFoundException("Id with " + id + " not found");

		return "Movie with Id " + movie.getMovieId() + " has been Deleted";
	}

}
