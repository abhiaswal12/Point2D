package com.basic;

public class TestBoxApp {

	public static void main(String[] args) {
		
		//creating obj
		//datatype nameofobj
		//int variable
		//java obj are always created at runtime: new
		
		//Box b1;//refrence of a obj
		Box b1 = new Box(); //1.dynamic mem allocation and invok the constructor
		b1.showDimaension();
		
		Box b2=new Box(11,22,33);
		b2.showDimaension();
		
		
		System.out.println("Height of box:"+ b2.getHeight());
		b2.setWidth(70);
		b2.showDimaension();
	}

}
