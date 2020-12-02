class Solution {
    public boolean canReach(int[] arr, int start) {
        int len = arr.length;
      boolean[] vis = new boolean[len];
        Stack<Integer> s = new Stack<>();
        s.add(start);
        while(!s.empty())
        {
          int x = s.pop();
            vis[x] = true;
          if(arr[x]==0)
              return true;
            if(x+arr[x]<len && !vis[x+arr[x]])
                s.add(x+arr[x]);
             if(x-arr[x]>=0 && !vis[x-arr[x]])
                s.add(x-arr[x]);
        }
        return false;
    }
}
