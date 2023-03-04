package com.masai.Entity;

import java.util.Objects;

public class Cab {
	
	private int cabNo ;
	private String cabColor;
	private String modelName;
	public int getCabNo() {
		return cabNo;
	}
	public void setCabNo(int cabNo) {
		this.cabNo = cabNo;
	}
	public String getCabColor() {
		return cabColor;
	}
	public void setCabColor(String cabColor) {
		this.cabColor = cabColor;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Cab(int cabNo, String cabColor, String modelName) {
		super();
		this.cabNo = cabNo;
		this.cabColor = cabColor;
		this.modelName = modelName;
	}
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cab [cabNo=" + cabNo + ", cabColor=" + cabColor + ", modelName=" + modelName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cabColor, cabNo, modelName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cab other = (Cab) obj;
		return Objects.equals(cabColor, other.cabColor) && cabNo == other.cabNo
				&& Objects.equals(modelName, other.modelName);
	}
	
	

}
