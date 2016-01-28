package com.adadyn;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value="TestDB", noClassnameStored=true)
public class Test {
	
	@Id private ObjectId id;
	@Property private String data;
	@Property private String name;
	@Property private String bannerSize;
	@Property private int vertical;
	@Property private int layoutId;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBannerSize() {
		return bannerSize;
	}
	public void setBannerSize(String bannerSize) {
		this.bannerSize = bannerSize;
	}
	public int getVertical() {
		return vertical;
	}
	public void setVertical(int vertical) {
		this.vertical = vertical;
	}
	public int getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(int layoutId) {
		this.layoutId = layoutId;
	}

}
