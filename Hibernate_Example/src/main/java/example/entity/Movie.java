package example.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Movie_master")

public class Movie {
@Id
@Column(name = "movie_title", length = 15)
	private String title;
@Column(name="movie_genre")
	private String genre;
@Column(name="movie_duration")
	private double duration;
@Column(name="movie_year")
	private int year;
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
	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	public Movie() {
		
	}
	public Movie(String title, String genre, double d, int year) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = d;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", duration=" + duration + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(duration, genre, title, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Movie)) {
			return false;
		}
		Movie other = (Movie) obj;
		return duration == other.duration && Objects.equals(genre, other.genre) && Objects.equals(title, other.title)
				&& year == other.year;
	}
	

}
