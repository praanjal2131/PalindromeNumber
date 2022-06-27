import java.util.*;
class PrimeNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number :");
	int n=sc.nextInt();
	int i=n;
	while(i<=n)
	{
	if(n%i==0)
	break;
	
	i++;
	}
	if(n==i)
	System.out.print("\n\t\tNumber is prime number");
	
	else
	System.out.print("\n\t\tNumber is not prime number");
	
	}
}
