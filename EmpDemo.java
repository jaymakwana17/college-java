import java.lang.*;
// import java.util.*;
class Emp
{
	String name;
	String address;
	int id;
	void getdata(String name, int id, String address)
	{
	this.name = name;
	this.id = id;
	this.address = address;
	}

	void putdata()
	{
	System.out.println("Employee details:");
	System.out.println("Employee name="+name);
	System.out.println("Employee Id="+id);
	System.out.println("Employee address="+address);
	}
}

class EmpDemp
{
	public static void main(String args[])
	{
		Emp e=new Emp();

		// Scanner sc = new Scanner(System.in);
		// int i;
	 //    // i for id
		// String n,a;
		// // n for name
		// // a for address
		// System.out.println("Enter name of Employee=");
		// n=sc.next();
		// System.out.println("Enter id=");
		// i=sc.nextInt();
		// System.out.println("Enter address=");
		// a=sc.next();

		//e.getdata(n,i,a);
		
		e.getdata("jay",15870,"mumbai");
		e.putdata();
	}
}