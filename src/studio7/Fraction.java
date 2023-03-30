package studio7;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1=new Fraction(3,5);
		Fraction f2=new Fraction(5,3);
		System.out.println(f1.printFraction());
		System.out.println(f1.add(f2));
		System.out.println();
	}
	private int denominator;
	private int numerator;
	public Fraction(int denominator,int numerator) {
		this.denominator=denominator;
		this.numerator=numerator;
	}
	public String printFraction() {
		String print=this.numerator+"/"+this.denominator;
		return print;
	}
	public Fraction add(Fraction f2) {
		Fraction result=new Fraction(denominator,numerator);
		if(this.denominator==f2.denominator) {
			result.numerator=this.numerator+f2.numerator;
			result.denominator=this.denominator;
		}else {
			result.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
			result.denominator=this.denominator*f2.denominator;
		}
		return result;
	}

}
