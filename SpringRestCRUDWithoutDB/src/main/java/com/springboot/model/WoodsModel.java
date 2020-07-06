package com.springboot.model;

public class WoodsModel {

	private String id;
	private String woodName;
	private String description;
	private String location;
	
	public WoodsModel() {
		
	}
	
	public WoodsModel(String id, String woodName, String description, String location) {
		super();
		this.id = id;
		this.woodName = woodName;
		this.description = description;
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWoodName() {
		return woodName;
	}
	public void setWoodName(String woodName) {
		this.woodName = woodName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "WoodsModel [id=" + id + ", woodName=" + woodName + ", description=" + description + ", location="
				+ location + "]";
	}
	
	
}
