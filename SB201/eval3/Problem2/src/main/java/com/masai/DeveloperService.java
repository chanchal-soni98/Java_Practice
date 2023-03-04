package com.masai;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperService {
	
	private Map<Developer, Project> projectMap;// inject 3 entries with valid details 

	private List<Developer> developerList; // inject List of 5 Developer object
	
	public void printProjectMap(){
			//print all the developers and their skill details from the projectMap
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		DeveloperService d=	ctx.getBean("developer",DeveloperService.class);
		System.out.println(d.projectMap);
	}
	
	public void printDeveloperList(){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		DeveloperService d=	ctx.getBean("developer",DeveloperService.class);
		System.out.println(d.developerList);
	}

	public Map<Developer, Project> getProjectMap() {
		return projectMap;
	}

	public void setProjectMap(Map<Developer, Project> projectMap) {
		this.projectMap = projectMap;
	}

	public List<Developer> getDeveloperList() {
		return developerList;
	}

	public void setDeveloperList(List<Developer> developerList) {
		this.developerList = developerList;
	}

	@Override
	public String toString() {
		return "DeveloperService [projectMap=" + projectMap + ", developerList=" + developerList + "]";
	}
}