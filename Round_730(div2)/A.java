import java.util.*;
public class Main
{
    public static void solve(long a,long b)
    {
        long min=Math.min(a,b);
        long max=Math.max(a,b);
        if(a==b)
        {
            System.out.println(0+" "+0);
            return;
        }
        
        else
        {
            long z=1;
            long val=max-min;
            double ans1=(double)max/(double)val;
            double ans2=(double)min/(double)val;
            
            long x=(long)Math.ceil(ans1)*val;
            long y=(long)Math.floor(ans1)*val;
           // System.out.println(x+" "+y);
            long val1=Math.abs(max-x);
            long val2=Math.abs(max-y);
            System.out.println(val+" "+(Math.min(val1,Math.min(min,val2))));return;
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long a=sc.nextLong();
		    long b=sc.nextLong();
		 solve(a,b);   
		}
	}
}
