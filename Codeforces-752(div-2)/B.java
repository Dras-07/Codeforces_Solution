import java.util.*;
public class Main
{
    public static String solve(int ar[],int n)
    {
        if(n%2==0)
        return "YES";
        else
        {
           for(int i=0;i<n-1;i++)
           {
               if(ar[i+1]<=ar[i])
               return "YES";
           }
           return "NO";
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int [n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		    }
		    System.out.println(solve(ar,n));
		}
	}
}
