import java.util.*;
public class Main
{
    public static long solve(int ar[],int n)
    {
        int c1=0;
        int c0=0;
        for(int i:ar)
        {
            if(i==1)
            c1++;
            else if(i==0)
            c0++;
        }
        long sum=c1*(long)Math.pow(2,c0);
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++)
		    ar[i]=sc.nextInt();
		    System.out.println(solve(ar,n));
		}
	}
}
