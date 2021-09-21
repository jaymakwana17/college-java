import java.util.*;

public class BranchingLooping
{
	public static void main(String[] args)
	{
	int i,j,a,n;
	// n for taking input
	// a for switch case
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	n=sc.nextInt();

	String c;
	int fact=1;
	do{
		System.out.println("Enter your choice:");
		System.out.println("1:Factorial \n 2:Pattern");
		a=sc.nextInt();
		switch(a)
		{
			case 1:
				for(i=1; i<=n; i++)
				{
					fact=fact*i;
				}
				System.out.println("Factorial of "+n+"= "+fact);
				break;
			case 2:
				for(i=1; i<=n; i++)
				{
					for (j=1; j<=i ;j++ ) {
						System.out.print("#");
						
					}
					System.out.print("\n");
				}
				break;
			default: 
			System.out.println("Enter correct choice from given.");

		}
		System.out.println("YOU want to continue?? [y/n]");
		c=sc.next();
	}
	
	while(c.equals("y"));
	}
}