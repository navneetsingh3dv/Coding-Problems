import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	scanner in = new scanner();
      int z = in.nextInt();
      while(z-- >0)
      {
    	  int n = in.nextInt();
    	  int[] arr = new int[n];
    	  for(int i = 0;i<n;i++)
    		  arr[i] = in.nextInt();
    	  int[] count = new int[n];
    	  count[n-1] = 1;
    	  int max = 1;
    	  for(int i = n-2;i>=0;i--)
    	  {
    		  for(int j = i+1;j<n;j++)
    		  {
    			  if(arr[i]<arr[j])
    		       count[i] = Math.max(count[j],count[i]);
    		  }
    		  count[i]++;
    		  max = Math.max(max,count[i]);
    	  }
    	  System.out.println(max);
      }    	
	}
}
class scanner
{   BufferedReader br ;
	StringTokenizer st;
	
	public scanner()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		st = null;
	}
	 public String next() {
	        while (st == null || !st.hasMoreElements()) {
	            try {
	                st = new StringTokenizer(br.readLine());
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return st.nextToken();
	    }
	public int nextInt()
	{
		return Integer.parseInt(next());
	}
	public long nextLong()
	{
	  return	Long.parseLong(next());
	}
}
