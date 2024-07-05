package inties;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;
	public double area;
	
	
	public double calcarea() {
		double A;
		
		A = (a + b + c) / 2.0;
		return Math.sqrt(A * (A - a) * (A - b) * (A - c));
	}
	
	
	

}
