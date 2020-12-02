class Solution {
    public int minCut(String s) {
        int len = s.length();
        boolean[][] pal = new boolean[len][len];
        int i = 0;
        int j = 0;
        int count = 0;
        while(count<len)
        {
           i = 0;
           j = i+count;
           while(j<len)
           {
              if(i==j)
                  pal[i][j] = true;
              else if(j-i==1)
                  pal[i][j] = s.charAt(i)==s.charAt(j);
              else
                     pal[i][j] = pal[i+1][j-1] && (s.charAt(i)==s.charAt(j));
               i++;
               j++;
           }
            count++;
        }
      int[] counT = new int[len];
       counT[len-1] = 0;
      for(i = len-2;i>=0;i--)
      {
          counT[i] = Integer.MAX_VALUE;
         for( j = i;j<len;j++)
         {
             if(pal[i][j])
                 counT[i] = Math.min((j+1)<len?counT[j+1]+1:0,counT[i]);
         }
      }
        return counT[0];
    }
}
