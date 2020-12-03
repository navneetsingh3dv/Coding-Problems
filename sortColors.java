class Solution {
    public void sortColors(int[] nums) {
       int i = 0;
        int j = nums.length;
        int start = 0;
        int last = nums.length-1;
        while(i<=j && start<last)
        {
            boolean rep = true;
            while(rep && start<last)
            {
                boolean s = true;
                boolean l = true;
                if(nums[start]==0)
                    start++;
                else
                    s = false;
                if(nums[last]==2)
                    last--;
                else
                    l = false;
                rep = s || l;
            }
            i = Math.max(i,start);
            j = Math.min(j,last);
            if(i<=j && start<last)
            {
              if(nums[i]==0)
                {
                  int temp = nums[i];
                  nums[i] = nums[start];
                  nums[start] = temp;
                  start++;
                }
              else if(nums[i]==1)
              {
                 i++; 
              }
               else
               {
                  int temp = nums[i];
                  nums[i] = nums[last];
                  nums[last] = temp;
                  last--;  
               }
            }
             i = Math.max(i,start);
            j = Math.min(j,last);
              if(i<=j && start<last)
            {
                if(nums[j]==0)
                {
                   int temp = nums[j];
                  nums[j] = nums[start];
                  nums[start] = temp;
                  start++;
                }
              else if(nums[j]==1)
              {
                  j--;
              }
               else
               {
                   int temp = nums[j];
                  nums[j] = nums[last];
                  nums[last] = temp;
                  last--; 
               }
            }
             i = Math.max(i,start);
            j = Math.min(j,last);
        }
    }
}
