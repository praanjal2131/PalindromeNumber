import java.util.*;
class FactorialNO
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter any number :");
	int n=sc.nextInt();
	
	int i=n;
        int fact=1;
	
	while(i>=1)
	{
	  fact=fact*i;
	   i--;
	}
	  System.out.print("\n\t\tFactorial no is: "+fact);
	
	
	}
}
