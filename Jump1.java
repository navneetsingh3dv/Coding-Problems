class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
       boolean[] reach = new boolean[len];
       reach[len-1] = true;
        int prev = len-1;
        for(int i = len-2;i>=0;i--)
        {
            if(nums[i]+i>=prev)
            {
                reach[i] = true;
                prev = i;
            }
        }
        return reach[0];
    }
}
