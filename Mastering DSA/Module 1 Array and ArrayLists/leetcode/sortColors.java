public class sortColors {//sort 0s,1s,2s(leetcode75 mid)
    public void sort(int[] nums) {
        int n = nums.length;
        int mid = 0, hi = n - 1, lo = 0;
        while (mid <= hi) {
            if (nums[mid] == 1)
                mid++;
            else if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[lo];
                nums[lo] = temp;
                lo++;
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi] = temp;
                hi--;
            }
        }
    }
}
