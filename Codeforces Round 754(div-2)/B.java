import java.util.*;
public class Main
{
    public static void solve(String st)
    {
        ArrayList<Integer> lst=new ArrayList<>();
         ArrayList<Integer> lst1=new ArrayList<>();
         int n=st.length();
      int i=0;
      int j=n-1;
      while(i<j)
      {
          if(st.charAt(i)=='1' && st.charAt(j)=='0')
          {
              lst.add(i+1);
              lst1.add(j+1);
              i++;
              j--;
          }
          else if(st.charAt(i)=='0' && st.charAt(j)=='1')
          {
              i++;
              j--;
          }
          else if(st.charAt(i)=='0' && st.charAt(j)=='0')
          {
              i++;
          }
          else
          {
              j--;
          }
      }
 //     System.out.println(lst1);
   //   System.out.println(lst);
      if(lst.size()==0)
      {
          System.out.println(0);
          return;
      }
          
      else
      {
          System.out.println(1);
          int ar[]=new int[2*lst.size()];
          for(int v=0;v<lst.size();v++)
          {
              ar[v]=lst.get(v);
              ar[2*lst.size()-1-v]=lst1.get(v);
          }
          
          System.out.print((lst1.size()*2)+" ");
          for(int z:ar)
          {
              System.out.print(z+" ");
          }
          
          System.out.println();
          return;
      }
    
      
      
    }
    //public static int Min(int x,int )
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		   String st=sc.next();
		   // System.out.println(solve(a,b,c));
		 //  System.out.println(ans);
		  solve(st);                    
		}
	}
}
