import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class Main
{
      public static int gcd(int a,int b)
    {
        if(a==0)
        return b;
        else
       return gcd(b%a,a);
    }
	public static int solve(int ar[],int n)
	{
	    int min=Integer.MAX_VALUE;
	    ArrayList<Integer > lst=new ArrayList<>();
	    for(int i:ar)
	    min=Math.min(min,i);
	   int ans=0; 
	  for (int i:ar) ans=gcd(ans, i-min);
	    if(ans==0)
	    return -1;
	    else
	    return ans;
	}
	public static void main(String[] args) {
	 FastScanner sc=new FastScanner();
		int t=sc.nextInt();
		while(t-->0)
		{
		   int n=sc.nextInt();
		  int ar[]=sc.readArray(n);
		 System.out.println(solve(ar,n));
		    
		}
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
 
}
