package model;

public class Movie extends Product {
	
	private final static int ROMANCE = 1;
	private final static int ACTION = 2;
	private final static int SUSPENCE = 3;
	private final static int HORROR = 4;
	private final static int COMEDY = 5;
	
	
	
	private String launchDate;
	private String title;
	private String director;
	private String producerCompany;
	private String sinopsis;
	private int ageLimit;
	private int category;
	
	public Movie(String launchDate, String title, String director, String producerCompany, String sinopsis,
			int ageLimit, int category) {
		super();
		this.launchDate = launchDate;
		this.title = title;
		this.director = director;
		this.producerCompany = producerCompany;
		this.sinopsis = sinopsis;
		this.ageLimit = ageLimit;
		this.category = category;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducerCompany() {
		return producerCompany;
	}

	public void setProducerCompany(String producerCompany) {
		this.producerCompany = producerCompany;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
	
	
	
	
}
