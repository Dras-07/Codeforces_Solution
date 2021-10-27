import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int t=sc.nextInt();
		while(t-->0)
		{
		    long a=sc.nextLong();
		    long b=sc.nextLong();
		   long c=sc.nextLong();
		    long sum=a+b*2+c*3;
		    if(sum%2==1)
		    System.out.println(1);
		    else
		    System.out.println(0);
		    
		}
	}
}
