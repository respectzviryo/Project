package ca.project.entity;

import java.sql.Timestamp;

public class MainRecord implements IMainRecord {    
    private Integer id = null;
    private String description = null;
    private String name = null;
    private String fileName = null;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    
    public MainRecord(Integer id, String description, String name, String fileName, Timestamp createdAt) {
        this.id = id;
        this.description = description;     
        this.name = name;
        this.fileName = fileName;
        this.createdAt = createdAt;
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

	public String getfileName() {
		return fileName;
	}

	public void setfileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
