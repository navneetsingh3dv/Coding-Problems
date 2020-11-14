import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
scanner in = new scanner();
      int z = in.nextInt();
      while(z-- >0)
      {
    	  int a = in.nextInt();
    	  int b = in.nextInt();
    	  String x = in.next();
    	  String y = in.next();
    	  int[][] count = new int[a+1][b+1];
    	  for(int i = 0;i<a;i++)
    	  {
    		  for(int j = 0;j<b;j++)
    		  {
    			  if(x.charAt(i)==y.charAt(j))
    				  count[i+1][j+1] = count[i][j]+1;
    			  else
    				  count[i+1][j+1] = Math.max(count[i+1][j],count[i][j+1]); 
    		  }
    	  }
    	  System.out.println(count[a][b]);
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
