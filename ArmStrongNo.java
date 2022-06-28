import java.util.*;
class ArmStrongNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number :");
	int n=sc.nextInt();
	int i=n;
	int rem=0;
	int sum=0;
	while(i!=0)
	{
		rem=i%10;
		sum=sum+(rem*rem*rem*rem);
		i=i/10;
	}
	
	if(sum==n)
	System.out.print("\n\t\tNumber is Armstrong number");
	
	else
	System.out.print("\n\t\tNumber is not Armstrong number");
	
	}
}
