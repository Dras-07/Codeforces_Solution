import java.util.*;
public class Main
{
    public static int solve(int a,int b,int c)
    {
      
          int min=Math.abs(a+b-2*c);
          int x=Math.min(a,b);
          int y=Math.max(a,b);
              int diff=Math.abs(x+y-2*c);
           if(diff%3==0)
           return 0;
           else
           return 1;
          
    
      
      
    }
    //public static int Min(int x,int )
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		     PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int x=solve(a,b,c);
		     int y=solve(a,c,b);
		      int z=solve(b,a,c);
		       int w=solve(b,c,a);
		        int v=solve(c,a,b);
		         int u=solve(c,b,a);
		         pq.add(x);
		         pq.add(y);
		         pq.add(z);
		         pq.add(w);
		         pq.add(v);
		         pq.add(u);
		         System.out.println(pq.remove());
		   // System.out.println(solve(a,b,c));
		 //  System.out.println(ans);
		                      
		}
	}
}
