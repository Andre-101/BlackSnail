package model;

public class Subscriber {
	private final static int NORMAL = 1;
	private final static int PLATINUM = 2;
	private final static int GOLD = 3;
	private final static int DIAMOND = 4;
	

	private String name;
	private String id;
	private int age;
	private int hours;
	private boolean status; // true = active, false = inactive
	private int subscription;
	
	
	
	public Subscriber(String name, String id, int age, int hours, boolean status, int subscription) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.hours = hours;
		this.status = status;
		this.subscription = subscription;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		if (!status) {
			this.subscription = NORMAL;
		}
	}
	public int getSubscription() {
		return subscription;
	}
	public void setSubscription(int subscription) {
		this.subscription = subscription;
	}
	
	
	
	
}
