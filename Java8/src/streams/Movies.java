package streams;

public class Movies {

	public String title;
	public int likes;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Movies(String title, int likes) {
		super();
		this.title = title;
		this.likes = likes;
	}

	public Movies() {
		// TODO Auto-generated constructor stub
	}
 

}
