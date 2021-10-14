import java.util.*;
public class Main
{
    public static long solve(long ar[],int n,long sum)
    {
       Arrays.sort(ar);
       long ans=0;
      double a=(double) sum/(double) n;
      if(Math.ceil(a)==Math.floor(a))
      {
          return 0;
      }
      else
      {
          long x=(long)Math.ceil(a);
          long y=(long)Math.floor(a);
          long ans1=y*n;
          long v=sum-ans1;
          long f=v*(n-v);
          return f;
      }
      
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		   long ar[]=new long[n];
		   long sum=0;
		   for(int i=0;i<n;i++)
		   {
		       ar[i]=sc.nextLong();
		       sum+=ar[i];
		   }
		   System.out.println(solve(ar,n,sum));
		}
	}
}
