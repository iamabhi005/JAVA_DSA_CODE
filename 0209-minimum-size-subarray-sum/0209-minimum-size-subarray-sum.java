class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int lo =0;
      int sum =0;
      int minLength = Integer.MAX_VALUE;
      for(int hi=0;hi<nums.length;hi++){
        sum += nums[hi];
        while(sum>=target){
            minLength=Math.min(minLength,hi - lo +1);
            sum -= nums[lo];
            lo++;
        }
      }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}