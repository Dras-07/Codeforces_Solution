import java.util.*;
public class Main
{
   public static int solve(String st)
    {
       int z=0;
       while(st.charAt(z)=='0')
       z++;
       st=st.substring(z);
        int n=st.length();
        int max=st.length();
    for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
    {
        if(i!=j && j>i)
        {
            char ch1=st.charAt(i);
            char ch2=st.charAt(j);
            String a=ch1+""+ch2;
            int x=Integer.parseInt(a);
           //System.out.println(a);
            if(x==0 || x==25 || x==75 || x==50)
            {
                
                    int diff=Math.abs(i-j)-1;
                    int val=n-Math.max(i,j)-1;
                    int fin=diff+val;
                    max=Math.min(fin,max);
                
            }
           
        }
    }
    return max;
     
     
    }
   
   
   
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		String st=sc.next();
		System.out.println(solve(st));
		
		}
	}
}
