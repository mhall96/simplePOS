package simplepos.model;

public class User {
	
	private Integer id;

	private String name;
	
	public User() {}
	
	public User(String name) {
		this.setName(name);
	}
	
	public User(int id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
}
