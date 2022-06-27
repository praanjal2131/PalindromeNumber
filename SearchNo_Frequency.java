import java.util.*;
class SearchNo_Frequency
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter any long number :");
	long n=sc.nextLong();
	System.out.print("\n\t\tEnter the number you want to search:");
	long k=sc.nextLong();
	long i=n;
        int c=0; long rem=0;
	while(i!=0)
	{
	  rem=i%10;
	
	     if(rem==k)
	      c++;
	
	
	    i=i/10;
	}


	if(c>0)
	  System.out.print("\n\t\tNumber found"+c);
	else
	  System.out.print("\n\t\tNumber not found");
	
	}
}
