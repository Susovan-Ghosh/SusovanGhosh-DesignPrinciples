public class Operations {
	public double summation(int a,int b) {
		return a+b;
	}
	public double substraction(double a,double b) {
		return (a>b)?a-b:b-a;
	}
	public double multiplication(double a,int b) {
		return a*(double)b;
	}
	public double division(int a,double b) {
		return (double)((double)a/b);
	}
}