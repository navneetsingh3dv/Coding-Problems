class Solution {
    public int findUnsortedSubarray(int[] nums) {
        boolean[] ltr = new boolean[nums.length];
        boolean[] rtl = new boolean[nums.length];
        int lowest = nums[nums.length-1];
        int heighest = nums[0];
        int start = 0;
        int end = -1;
        for(int i = 1;i<nums.length;i++)
        {
            heighest = Math.max(heighest,nums[i]);
            ltr[i] = heighest==nums[i]?false:true;
            lowest = Math.min(lowest,nums[nums.length-1-i]);
            rtl[nums.length-1-i] = lowest==nums[nums.length-1-i]?false:true;
            if(ltr[i])
                end = i;
            if(rtl[nums.length-1-i])
                start = nums.length-1-i;
        }
        return (end-start+1);
    }
}
