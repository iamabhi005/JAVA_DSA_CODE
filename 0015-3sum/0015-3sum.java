class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int tar = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            // Duplicate first element skip
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int ntar = tar - nums[i];

            int li = i + 1;
            int ri = nums.length - 1;

            while (li < ri) {

                int sum = nums[li] + nums[ri];

                if (sum < ntar) {
                    li++;
                } 
                else if (sum > ntar) {
                    ri--;
                } 
                else {
                    ans.add(Arrays.asList(
                        nums[i],
                        nums[li],
                        nums[ri]
                    ));

                    // Duplicate left values skip
                    while (li < ri && nums[li] == nums[li + 1]) {
                        li++;
                    }

                    // Duplicate right values skip
                    while (li < ri && nums[ri] == nums[ri - 1]) {
                        ri--;
                    }

                    li++;
                    ri--;
                }
            }
        }

        return ans;
    }
}