import java.util.*;
class HCF_3digitNo  //highest common factor
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number a :");
	int a=sc.nextInt();

	System.out.print("\n\t\tEnter the number b :");
	int b=sc.nextInt();

	System.out.print("\n\t\tEnter the number b :");
	int c=sc.nextInt();
	int i=1;
	
	int hcf=0;
	while(i<=a || i<=b ||i<=c)
	{
		if(a%i==0 && b%i==0 && c%i==0)
		hcf=i;
		i++;
	}
		
	
	System.out.print("\n\t\tHCF Number is : "+hcf);
	
	
	}
}
