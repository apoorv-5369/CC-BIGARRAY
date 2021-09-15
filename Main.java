import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt();
	       long[] p = new long[t*2];
	       for(int i=0; i<t*2; i+=2) {
	    	   for(int j=i; j<i+2; j++) {
	    		   p[j] = sc.nextLong();
	    	   }
	    	   
	       }
	       for(int i=0; i<t*2; i+=2) {
	    	   long sum = ((p[i]+1)*p[i])/2-p[i+1];
	    	   if(sum>=1&&sum<=p[i]) System.out.println(sum);
	    	   else System.out.println("-1");
		}
	}
}
