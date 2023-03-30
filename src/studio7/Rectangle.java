package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(0.3,0.6);
		Rectangle r2=new Rectangle (0.4,0.4);
		r1.DrawRectangle();
		System.out.println(r2.area());
		System.out.println(r1.greaterArea(r2));
		System.out.println(r2.IsSquare());
		System.out.println(r2.perimeter());
	
	}
	private double length;
	private double width;
	
	public Rectangle(double Ilength,double Iwidth) {
	this.length=Ilength;
	this.width=Iwidth;	
	}
	
	public void DrawRectangle(){
		StdDraw.rectangle(.5, .5, width/2, length/2);
	}
	public double area() {
		double area=this.length*this.width;
		return area;
	}
	public boolean greaterArea(Rectangle r) {
		boolean greater=this.area()>r.area();
		return greater;
	}
	
	public boolean IsSquare() {
		boolean square=false;
		if(this.length==this.width) {
			square=true;
		}
		return square;
	}
	public double perimeter() {
		double perimeter=2*(this.length+this.width);
		
		return perimeter;
	}
	
}
