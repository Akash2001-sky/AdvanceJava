package example.entity;

public class MovieTitleAndGenre {
	
	private String title;
	private String genre;
	
	
	public MovieTitleAndGenre() {
		
	}
	public MovieTitleAndGenre(String title, String genre) {
		
		this.title = title;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieTitleAndGenre [title=" + title + ", genre=" + genre + "]";
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
