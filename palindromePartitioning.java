class Solution {
    public List<List<String>> partition(String s) {
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
        List<List<String>>[] ans = new List[len];
        ans[len-1] = new ArrayList<List<String>>();
        ans[len-1].add(new ArrayList<String>());
        ans[len-1].get(0).add(s.substring(len-1,len));
         System.out.println(ans[len-1]);
        for(i = len-2;i>=0;i--)
        {
            ans[i] = new ArrayList<List<String>>();
            for( j = i;j<len;j++)
            {
                if(pal[i][j])
                {
                    if(j+1<len)
                    {
                  for(List<String> ls : ans[j+1])
                  {
                      ans[i].add(new ArrayList<String>(ls));
                      ans[i].get(ans[i].size()-1).add(0,s.substring(i,j+1));
                  }
                    }
                    else
                    {
                        ans[i].add(new ArrayList<>());
                         ans[i].get(ans[i].size()-1).add(s.substring(i,j+1));
                    }
                }
            }
            System.out.println(ans[i]);
        }
        return ans[0];
    }
}
