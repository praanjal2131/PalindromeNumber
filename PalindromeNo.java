import java.util.*;
class PalindromeNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number :");
	int n=sc.nextInt();
	int i=n;
	int rem=0;int rev=0;
	while(i!=0)
	{
	rem=i%10;
	rev=(rev*10)+rem;
	i=i/10;
	System.out.print("\n\t\t"+rem);
	}
	if(n==rev)
	{
	
	System.out.print("\n\t\tNumber is palindrome");
	}
	else
	System.out.print("\n\t\tNumber is palindrome");
	
	}
}
