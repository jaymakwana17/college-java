import java.util.*;

class MethodOverloading
{

	void display(int a,int b)
	{
	int result=a+b;
	System.out.println("sum of two Integer="+result);
	}
	void display(double a,double b)
	{
	double result=a+b;
	System.out.println("sum of two double="+result);
	}
	void display(int a,int b,int c)
	{
	int result=a+b+c;
	System.out.println("sum of three Integer="+result);
	}
	 void display(int a,double b)
	{
	double result=a+b;
	System.out.println("sum of Integer and double="+result);
	} 

}

class MethodOverloadingDemo
{
	public static void main(String args[])
	{
		MethodOverloading m=new MethodOverloading();
		m.display(2,2);
		m.display(5.5,4.5);
		m.display(5,6,9);
		m.display(5,10.55);
	}
}

