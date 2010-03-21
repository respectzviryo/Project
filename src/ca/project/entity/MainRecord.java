package ca.project.entity;

public class MainRecord implements IMainRecord {    
    private Integer id = null;
    private String description = null;
    private String name = null;
    
    public MainRecord(Integer id, String description, String name) {
        this.id = id;
        this.description = description;     
        this.name = name;
    }
    
    public MainRecord() {
    	
    }
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
