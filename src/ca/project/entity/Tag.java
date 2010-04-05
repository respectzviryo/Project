package ca.project.entity;

public class Tag implements ITag {
	private Integer photoId = null;
	private String name = null;
	private Integer id = null;

	public Tag(Integer photoId, String name, Integer id) {
		this.id = id;
		this.name = name;
		this.photoId = photoId;
	}

	public Tag() {

	}

	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
