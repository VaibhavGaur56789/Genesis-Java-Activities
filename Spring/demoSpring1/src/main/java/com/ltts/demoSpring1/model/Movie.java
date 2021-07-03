package com.ltts.demoSpring1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private int movieId;
	private String movieName;
	private String cast1;
	private String cast2;
	private LocalDate releaseDate;
	private String movieType;
	
	public Movie() {
		super();
	}
	
	public Movie(int movieId, String movieName, String cast1, String cast2, LocalDate releaseDate, String movieType) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.cast1 = cast1;
		this.cast2 = cast2;
		this.releaseDate = releaseDate;
		this.movieType = movieType;
	}
	
	public int getMovieId() {
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
	public String getCast1() {
		return cast1;
	}
	public void setCast1(String cast1) {
		this.cast1 = cast1;
	}
	public String getCast2() {
		return cast2;
	}
	public void setCast2(String cast2) {
		this.cast2 = cast2;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	
	
	
}
