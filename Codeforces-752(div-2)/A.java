import java.util.*;
public class Main
{
    public static int solve(int ar[],int n)
    {
        int i=1;
        int c=0;
        for(int j=0;j<n;j++)
        {
            if(ar[j]>i)
            {
                int val=ar[j]-i;
                i=i+val;
                c=c+val;
            }
            i++;
        }
        return c;
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
