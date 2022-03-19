package toDoAppBackend.entities.concretes;

public class Company {
	private int id;
	private String name;
	private String catchPhrase;
	private String bs;

	public Company() {
		super();
	}

	public Company(int id, String name, String catchPhrase, String bs) {
		super();
		this.id = id;
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}
}
