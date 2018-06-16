package com.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

	
	public Person() {
		super();
	}
	public Person(String name, String id, String mobile) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
	}
	
	@JsonProperty
	String name;
	
	@JsonProperty
	String id;
	
	@JsonProperty
	String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", mobile=" + mobile + "]";
	}
}
