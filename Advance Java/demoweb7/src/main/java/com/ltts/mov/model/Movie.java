package com.ltts.mov.model;

public class Movie {
	private int movieid, productionid;
	private String moviename, actor, actress, releasedate, language, movietype;
	
	public Movie() {
		super();
	}
	
	public Movie(int movieid, String moviename, String actor, String actress, String releasedate, String language, String movietype, int productionid) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.actor = actor;
		this.actress = actress;
		this.releasedate = releasedate;
		this.language = language;
		this.movietype = movietype;
		this.productionid = productionid;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public int getProductionid() {
		return productionid;
	}

	public void setProductionid(int productionid) {
		this.productionid = productionid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMovietype() {
		return movietype;
	}

	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	
	public String toString() {
		return "Movieid=" +movieid+ "Moviename=" +moviename+ "Actor=" +actor+ "Actress=" +actress+ "ReleaseDate=" +releasedate+ "Language=" +language+ "MovieType=" +movietype+ "Productionid=" +productionid; 
	}
	
}
