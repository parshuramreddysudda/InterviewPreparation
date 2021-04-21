package movies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MovieDoa {
	static List<Movie> movieList = new ArrayList<Movie>();
	static {
//		movieList.add(new Movie(0, "Harry4.063282", "ram32.732582", 23.868816));
//		movieList.add(new Movie(1, "Harry8.387317", "ram3.253273", 97.04368));
//		movieList.add(new Movie(2, "Harry21.760807", "ram7.313516", 17.124199));
//		movieList.add(new Movie(3, "Harry64.30517", "ram1.2271214", 67.32939));
//		movieList.add(new Movie(4, "Harry8.231096", "ram59.378155", 39.32597));
//		movieList.add(new Movie(5, "Harry35.7298", "ram8.399754", 53.046303));
//		movieList.add(new Movie(6, "Harry14.915173", "ram22.544937", 42.71613));
//		movieList.add(new Movie(7, "Harry5.3645825", "ram34.608955", 92.28993));
//		movieList.add(new Movie(8, "Harry25.287703", "ram37.792744", 99.651924));
//		movieList.add(new Movie(9, "Harry51.558567", "ram60.51815", 8.431679));
	}

	public List<Movie> getAllMovies() {
		return movieList;
	}

	public Movie findMovie(int id) {

		for (Movie movie : movieList)
			if (movie.getMovieId() == id)
				return movie;

		return null;
	}

	public Movie editMovie(Movie movie) {
		if (movieList.get(movie.getMovieId()) == null)
			return null;
		for (Movie movieObj : movieList)
			if (movieObj.getMovieId() == movie.movieId) {

				movieObj.setMovieActor(movie.getMovieActor());
				movieObj.setMovieCollection(movie.getMovieCollection());
				movieObj.setMovieName(movie.getMovieName());
			}

		return movie;
	}

	public Movie deleteMovie(int id) {
		try {
		if (movieList.get(id) == null)
			return null;
		Iterator<Movie> it = movieList.iterator();
		while (it.hasNext()) {
			Movie movie = it.next();
			if (movie.getMovieId() == id) {
				it.remove();
				return movie;
			}
		}
		}
		catch(Exception e) {
			return null;
		}
		return null;
	}

	public Movie addMovie(Movie details) {
		details.setMovieId(movieList.size() + 1);
		movieList.add(details);
		return details;
	}

}
