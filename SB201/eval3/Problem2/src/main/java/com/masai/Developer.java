package com.masai;

import java.util.Objects;

public class Developer {
	
	private int id;
	private String name;
	private int age;
	private int noOfProjectsDone;
	private String email;
	private String mobile;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNoOfProjectsDone(int noOfProjectsDone) {
		this.noOfProjectsDone = noOfProjectsDone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getNoOfProjectsDone() {
		return noOfProjectsDone;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, id, mobile, name, noOfProjectsDone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		return age == other.age && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name)
				&& noOfProjectsDone == other.noOfProjectsDone;
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", age=" + age + ", noOfProjectsDone=" + noOfProjectsDone
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	
}
