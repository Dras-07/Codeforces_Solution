import java.util.*;
public class Main
{
    public static void solve(long a,long b,long c)
    {
        
     long max=Math.max(a,Math.max(b,c));
     int ct1=0;
     if(max==a)
     ct1++;
     if(max==b)
     ct1++;
     if(max==c)
     ct1++;
     
     if(ct1==3)
     {
     
        System.out.println(1+" "+1+" "+1);
        return;
     }
     else if(ct1==2)
     {
         long val1=max-a;
         long val2=max-b;
         long val3=max-c;
         if(val1==0 && val2==0)
         {
             System.out.println(1+" "+1+" "+(val3+1));return;
         }
         else if(val2==0 && val3==0)
         {
             System.out.println((val1+1)+" "+1+" "+1);return;
         }
         else
         {
             System.out.println(1+" "+(val2+1)+" "+1);return;
         }
     }
     else
     {
             long val1=max-a;
         long val2=max-b;
         long val3=max-c;
         if(val1==0)
         {
         System.out.println(0+" "+(val2+1)+" "+(val3+1));return;
         }
         else if(val2==0)
         {
             System.out.println((val1+1)+" "+(0)+" "+(val3+1));return;
         }
         else
         {
             System.out.println((val1+1)+" "+(val2+1)+" "+(0));return;
         }
     }
     
     
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		   long a=sc.nextLong();
		   long b=sc.nextLong();
		   long c=sc.nextLong();
		  
		   
		  solve(a,b,c);
		}
	}
}
