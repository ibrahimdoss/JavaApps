package toDoAppBackend.entities.concretes;

public class Geo {
	private int id;
	private String lat;
	private String lng;

	public Geo() {
		super();
	}

	public Geo(int id, String lat, String lng) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}
}
