package testclasses;

public class Task {

	private String id;
	private String name;
	private String description;
	
	public Task(String id, String name, String description) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
