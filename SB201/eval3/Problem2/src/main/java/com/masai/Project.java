package com.masai;

import java.util.Objects;

public class Project {
	
	private int id;
	private String name;
	private int duration;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(duration, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return duration == other.duration && id == other.id && Objects.equals(name, other.name);
	}
	
	

}
