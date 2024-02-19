package workshop3.subway.entity;

public class Station {
	
	private	String	id;
	private String	name;
	private int		location;
	
	public Station() {}
	
	public Station(String i, String n, int l) {
		this.id = i;
		this.name = n;
		this.location = l;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String i) {
		id = i;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String i) {
		name = i;
	}
	
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int i) {
		location = i;
	}
	
}
