package model;

public class Season {
	private int number;
	private int episodes;
	private String launchDate;
	private String trailerDate;
	public Season(int number, int episodes, String launchDate, String trailerDate) {
		super();
		this.number = number;
		this.episodes = episodes;
		this.launchDate = launchDate;
		this.trailerDate = trailerDate;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
	public String getTrailerDate() {
		return trailerDate;
	}
	public void setTrailerDate(String trailerDate) {
		this.trailerDate = trailerDate;
	}
	
	
	
}
