package com.java2.object;

public class StepikTester {
	
	class Employee {
		String name;
		String email;
		int experience;
		
		public void getName(){
			
		}
		}

		class Developer extends Employee {

		  // write fields

		  // write constructor

		  // write getters
		}

		class DataAnalyst extends Employee {

		  // write fields

		  // write constructor

		  // write getters
		}

	public static void main(String[] args) {
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
	}

}
