package com.gitproject;

interface SampleProgram {
	int a=10;
	int b=20;
	 void addData();
	 
	   void detilas();
	
	
	 abstract void  addInfo();

	 
	 
	
	

	 
	 public class Sample{
		 
		 void addData()
		 {
			 System.out.println("The Name is Kamesh");
		 }
		 void addInfo() {
			 System.out.println("I am a software Engineer in TCS");
		 }
		 public void detilas()
		 {
			 
		 }
		 
		 
		 
	 }
	public static void main(String[] args) {
		
		Sample sm=new Sample();
		sm.addData();
		sm.addInfo();
		System.out.println(a);
		

	}

}
