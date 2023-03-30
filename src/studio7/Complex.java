package studio7;

public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex (1,5);
		Complex c2=new Complex(3,4);
		System.out.println(c1.add(c2).printComplex());
	}
	private double real;
	private double imaginary;
	
	public Complex(double real,double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public String printComplex() {
		String print=this.real+"+"+this.imaginary+"i";
		return print;
	}
	public Complex add(Complex c2) {
		Complex result=new Complex(real,imaginary);
		result.imaginary=this.imaginary+c2.imaginary;
		result.real=this.real+c2.real;
		return result;
	}
	

}
