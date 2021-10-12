import java.util.*;
public class Main
{
    public static boolean solve(int ar[][],int n)
    {
    boolean ans=false;     
  //int c=0;
  for(int i=0;i<5;i++){
  for(int j=0;j<5;j++)
  {
      if(i!=j)
      {
      int c1=0;
      int c2=0;
      int c=0;
      for(int k=0;k<n;k++)
      {
          if(ar[k][j]==1)
          c1++;
          if(ar[k][i]==1)
          c2++;
          if(ar[k][j]==0 && ar[k][i]==0)
          c++;
      }
      if(c1>=n/2 && c2>=n/2 && c==0)
     ans=true;
      }
      
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
		    int ar[][]=new int[n][5];
		    for(int i=0;i<n;i++)
		    for(int j=0;j<5;j++)
		    ar[i][j]=sc.nextInt();
		   boolean ans=(solve(ar,n));
		   if(ans)
		   System.out.println("YES");
		   else
		   System.out.println("NO");
		}
	}
}
