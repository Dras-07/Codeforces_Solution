import java.util.*;
public class Main
{
    public static int check(char ch,String st)
    {
        int i=0;
        int j=st.length()-1;
        int c=0;
       // System.out.println(ch);
        while(j>=i)
        {
            if(st.charAt(i)==st.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                if(st.charAt(i)==ch)
                {
                   i++;
                   c++;
                }
                else if(st.charAt(j)==ch)
                {
                    j--;
                    c++;
                }
                else
                return -1;
            }
        }
        
        return c;
    }
    public static int solve(HashSet<Character> hm,String st)
    {
        int min=Integer.MAX_VALUE;
        boolean flag=false;
       for(Character ch:hm)
       {
           int a=check(ch,st);
           if(a!=-1)
           {
           min=Math.min(a,min);
           flag=true;
           }
       }
       if(flag==true)
       return min;
       else
       return -1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String st=sc.next();
		    HashSet<Character> hm=new HashSet<>();
		    for(int i=0;i<st.length();i++)
		    {
		        hm.add(st.charAt(i));
		    }
		    System.out.println(solve(hm,st));
		}
	}
}
