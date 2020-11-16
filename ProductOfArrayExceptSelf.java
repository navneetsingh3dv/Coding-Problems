class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length<=1 )
            return nums;
        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        int[] res = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            if(i==0)
            {
               forward[i] = nums[i];
               backward[nums.length-i-1] = nums[nums.length-i-1];
            }
            else
            {
                forward[i] = forward[i-1]*nums[i];
                backward[nums.length-i-1] = backward[nums.length-i]*nums[nums.length-i-1];
            }
        }
        res[0] = backward[1];
        res[nums.length-1] = forward[nums.length-2];
         for(int i = 1;i<nums.length-1;i++)
        {
             res[i] = forward[i-1]*backward[i+1];
        }
        return res;
    }
}
