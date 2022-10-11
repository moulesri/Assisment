package week1day2;

public class Calculator{
	int a;
	int b;
	int w;
	int f;
	double i;
	double j;
	float k;
	float n;
	public void addTwoNumber()
	{
		int C = a+b;
		System.out.println("C="+C);
	}
	public void subTwoNumber()
	{
		int e = w-f;
		System.out.println("E="+e);
	}
	public void mulTwoNumber()
	{
		double y = i*j;
		System.out.println("Y="+y);
	}
	public void divTwoNumber()
	{
		float x = k/n;
		System.out.println("X="+x);
	}
public static void main(String[] args) {
	Calculator cals =new Calculator();
	cals.a=10;
	cals.b=5;
	cals.w=75;
	cals.f=8;
	cals.i=65.4566;
	cals.j=85.575759;
	cals.k=6541F;
	cals.n=52f;
	cals.addTwoNumber();
	cals.subTwoNumber();
	cals.mulTwoNumber();
	cals.divTwoNumber();
}
}
