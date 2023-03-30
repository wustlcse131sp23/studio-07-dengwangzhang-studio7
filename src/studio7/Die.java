package studio7;

public class Die {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1=new Die(2);
		System.out.println(d1.generateRandom());
	}
	private int n;
	public Die(int n) {
		this.n=n;
	}
	public int generateRandom() {
		int r=(int)(Math.random()*n)+1;
		return r;
	}
	

}
