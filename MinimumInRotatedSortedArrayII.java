class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if(len==0)
             return 0;
        if(len==1)
            return nums[0];
        if(len==2)
            return Math.min(nums[0],nums[1]);
        int i = 0;
        int j = len-1;
        int escape = Integer.MAX_VALUE;
        while(i<j)
        {
            if(nums[i]==nums[j])
            {
                 escape = Math.min(escape,nums[i]);
                i++;
                j--;
            }
            else
                break;
        }
        if(escape<nums[j])
            return escape;
        return this.mini(nums,i,j);
        
    }
    public int mini(int[] nums,int from,int to)
    {
        if(nums[from]<=nums[to])
             return nums[from];
        if(to==from)
            return nums[from];
        if(to-from==1)
            return Math.min(nums[to],nums[from]);
        int mid = (from+to)/2;
        if(nums[mid]<nums[from])
            return mini(nums,from,mid);
        return mini(nums,mid,to);           
    }
}
