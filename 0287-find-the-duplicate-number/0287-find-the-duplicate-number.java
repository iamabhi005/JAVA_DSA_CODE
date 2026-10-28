class Solution {
    public int findDuplicate(int[] nums) {
        int lo = nums[0];
        int hi = nums[0];
        do{
            lo = nums[lo];
            hi = nums[nums[hi]];
        }
        while(lo != hi);
        lo = nums[0];
         while(lo != hi){
            lo = nums[lo];
            hi = nums[hi];
         }
         return lo;
    }
}