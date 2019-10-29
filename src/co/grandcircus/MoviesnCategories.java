package co.grandcircus;

public class MoviesnCategories {
	
	private String movieNames;
	private String movieCategories;
	
	public MoviesnCategories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MoviesnCategories(String movieCategories) {
		super();
		this.movieCategories = movieCategories;
	}
	
	public MoviesnCategories(String movieNames, String movieCategories) {
		super();
		this.movieNames = movieNames;
		this.movieCategories = movieCategories;
	}

	public String getMovieNames() {
		return movieNames;
	}
	public void setMovieNames(String movieNames) {
		this.movieNames = movieNames;
	}
	public String getMovieCategories() {
		return movieCategories;
	}
	public void setMovieCategories(String movieCategories) {
		this.movieCategories = movieCategories;
	}

	@Override
	public String toString() {
		return "MoviesnCategories [movieNames=" + movieNames + ", movieCategories=" + movieCategories + "]";
	}
	
	

}
