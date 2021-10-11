package com.basic;

public class Box {
	// data member
	private int len,width,height;
	
	//cnstor
	public Box()
	{
		len=10;
		width=10;
		height=10;
	}
	
	public Box(int l, int w, int h)
	{
		len=l;
		width=w;
		height=h;
	}
	
	//return type medthodname(arg list){};
 public void showDimaension()
	{
		System.out.println("Box Dimension:" +len+" "+width+" "+ height);
	}
 	public int getHeight() {
	 return height;
 	  }
 	public void setWidth(int w) {
	 width = w;
 	}
}
