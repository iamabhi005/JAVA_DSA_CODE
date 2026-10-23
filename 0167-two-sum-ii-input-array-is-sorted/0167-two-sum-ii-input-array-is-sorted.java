class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0 , hi = numbers.length -1;
        while(lo < hi){
             int mid = numbers[lo] + numbers[hi];
            if(mid == target){
                return new int[]{lo+1,hi+1};
            }
            else if (mid < target){
                lo++;
            }
            else{
                hi--;
            }
        }
        return new int[]{-1,-1};
    }
}