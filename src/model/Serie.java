package model;

public class Serie extends Product {
	private int productType = 2;
	private String title;
	private String firstEmition;
	private String mainCast;
	private String director;
	private String sinopsis;
	private boolean censored;
	private String reason;
	private Season[] seasons;
	private int numSeasons;
	
	public Serie(String title, String firstEmition, String mainCast, String director, String sinopsos, int seasons) {
		super();
		this.title = title;
		this.firstEmition = firstEmition;
		this.mainCast = mainCast;
		this.director = director;
		this.sinopsis = sinopsos;
		this.seasons = new Season[seasons];
		numSeasons = seasons;
	}
	
	public void addSeason(Season s) {
		seasons[s.getNumber()] = s;
		
	}

	public Serie(String title, String firstEmition, String mainCast, String director, String sinopsis, boolean censored,
			String reason, int seasons) {
		super();
		this.title = title;
		this.firstEmition = firstEmition;
		this.mainCast = mainCast;
		this.director = director;
		this.sinopsis = sinopsis;
		this.censored = censored;
		this.reason = reason;
		this.seasons = new Season[seasons];
		this.numSeasons = seasons;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType){
		this.productType = productType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getFirstEmition() {
		return firstEmition;
	}

	public void setFirstEmition(String firstEmition) {
		this.firstEmition = firstEmition;
	}

	public String getMainCast() {
		return mainCast;
	}

	public void setMainCast(String mainCast) {
		this.mainCast = mainCast;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public boolean isCensored() {
		return censored;
	}

	public void setCensored(boolean censored) {
		this.censored = censored;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Season[] getSeasons() {
		return seasons;
	}

	public void setSeasons(Season[] seasons) {
		this.seasons = seasons;
	}

	public int getNumSeasons() {
		return numSeasons;
	}

	public void setNumSeasons(int numSeasons) {
		this.numSeasons = numSeasons;
	}
	
}
