class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] jumps = new int[len];
        Stack<Integer> s = new Stack<Integer>();
        jumps[len-1] = 0;
        s.add(len-1);
        for(int i = len-2;i>=0;i--)
        {
            jumps[i] = Integer.MAX_VALUE;
            int max = i+nums[i];
            if(max>=len-1)
            {
                s.clear();
                s.add(i);
                jumps[i] = 1;
            }
            else
            {
               int prev = -1;
               while(!s.empty())
               {
                   int x = s.pop();
                   if(x<=max)
                   {
                       prev = x;
                       jumps[i] = Math.min(jumps[x]+1,jumps[i]);
                   }
                   else
                   {
                       s.add(x);
                       break;
                   }
               }
                if(prev>=0)
                s.add(prev);
                while(!s.empty() && jumps[s.peek()]>=jumps[i])
                    s.pop();
                if(jumps[i]>0 && jumps[i]<Integer.MAX_VALUE)
                s.add(i);
            }
        }
        return jumps[0];
    }
}
