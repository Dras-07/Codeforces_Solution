import java.util.*;
public class Main
{
    public static long solve(long ar[],int n)
    {
          long c=0;
            long sum=0;
          HashMap<Long,Long> hm=new HashMap<>();
          for(long i:ar)
          {
              sum+=i;
             hm.put(i,hm.getOrDefault(i,(long)0)+1);
          }
        //  System.out.println((2*sum)%n);
     if((2*sum)%n!=0)
     return 0;
      sum=(2*sum)/n;
   //   System.out.println(sum);
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - ar[i]) != null)
                c += hm.get(sum - ar[i]);
 
            if (sum - ar[i] == ar[i])
                c--;
        }
// System.out.println(c);
        return c / 2;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		   long ar[]=new long[n];
		   for(int i=0;i<n;i++)
		   ar[i]=sc.nextLong();
		   System.out.println(solve(ar,n));
		}
	}
}
