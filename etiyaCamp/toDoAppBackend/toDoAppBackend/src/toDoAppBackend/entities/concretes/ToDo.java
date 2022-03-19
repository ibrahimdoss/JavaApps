package toDoAppBackend.entities.concretes;

public class ToDo {
	private int userId;
	private int id;
	private String title;
	private boolean completed;

	public ToDo() {
		super();
	}

	public ToDo(int userId, int id, String title) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = false;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
