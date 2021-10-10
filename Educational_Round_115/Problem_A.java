import java.util.*;
public class Main
{
    public static boolean solve(int ar[][],int n)
    {
            for(int i=0;i<n;i++)
            {
                if(ar[0][i]==1 && ar[1][i]==1)
                return false;
            }
            return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[][]=new int[2][n];
		    
		    String st1=sc.next();
		    String st2=sc.next();
		   for(int i=0;i<n;i++)
		   ar[0][i]=st1.charAt(i)-'0';
		   for(int i=0;i<n;i++)
		   ar[1][i]=st2.charAt(i)-'0';
		    if(solve(ar,n))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
