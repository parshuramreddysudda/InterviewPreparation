package movies;

public class Movie {

	Integer movieId;
	String movieName;
	String movieActor;
	double movieCollection;

	public Movie(Integer movieId, String movieName, String movieActor, double d) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieActor = movieActor;
		this.movieCollection = d;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	public double getMovieCollection() {
		return movieCollection;
	}

	public void setMovieCollection(double d) {
		this.movieCollection = d;
	}

}
