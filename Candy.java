class Solution {
    public int candy(int[] ratings) {
      int len = ratings.length;
      int[] ltr = new int[len];
      int[] rtl = new int[len];
      Stack<Integer> s = new Stack<Integer>();
      for(int i = 0;i<len;i++)
      {
          if(!s.empty() && s.peek()>=ratings[i])
            s.clear();
          s.add(ratings[i]);
          ltr[i] = s.size();
      }
    s.clear();
      for(int i = len-1;i>=0;i--)
      {
          if(!s.empty() && s.peek()>=ratings[i])
            s.clear();
          s.add(ratings[i]);
          rtl[i] = s.size();
      }
      int x = 0;
      for(int i = 0;i<len;i++)
     {
        x += Math.max(ltr[i],rtl[i]);    
      }
        return x;
  }
}
