package com.masai;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

		private Map<Department, Employee> theMap;
		//use setter injection to inject theMap;
		
		
		
		

		public void myInit(){
			System.out.println("inside myInit method");
		}
		
		
		
		

		public Map<Department, Employee> getTheMap() {
			return theMap;
		}

		public void setTheMap(Map<Department, Employee> theMap) {
			this.theMap = theMap;
		}

		
		
		
		
		public void cleanUp(){
			System.out.println("inside cleanUp method");
		}

		public void showDetails(){
			System.out.println("inside showDetails of Demo class");
			
			for(Map.Entry<Department, Employee> ex:theMap.entrySet()) {
				  System.out.println(ex.getKey());
				  System.out.println(ex.getValue());
				  System.out.println();
			}
			
			
		}
		
		
		
	    public static void main(String[] args) {
		
	    	ApplicationContext apx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	    	
	    	Demo d= apx.getBean("demo",Demo.class);
	    	d.showDetails();
	    }
	}
