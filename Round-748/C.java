import java.util.*;
public class Main
{
    public static int solve(int ar[],int n)
    {
      int cat=0;
      int ans=0;
      int k=ar.length;
   Arrays.sort(ar);
   for(int i=k-1;i>=0;i--)
   {
       if(cat<ar[i])
       {
           cat=cat+(n-ar[i]);
           ans++;
       }
   }
   return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int ar[]=new int[k];
		    for(int i=0;i<k;i++)
		    {
		      ar[i]=sc.nextInt();
		    }
		    System.out.println(solve(ar,n));
		}
}
}
