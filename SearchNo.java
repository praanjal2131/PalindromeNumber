import java.util.*;
class SearchNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter any long number :");
	long n=sc.nextLong();
	System.out.print("\n\t\tEnter the number you want to search:");
	long k=sc.nextLong();
	long i=n; long c=0;long rem=0;
	while(i!=0)
	{
	rem=rem%10;
	i=i/10;
	if(rem==k)
	{
	c=1;
	break;
	}
	}
	if(c==1)
	System.out.print("\n\t\tNumber is prime number");
	
	else
	System.out.print("\n\t\tNumber is not prime number");
	
	}
}
