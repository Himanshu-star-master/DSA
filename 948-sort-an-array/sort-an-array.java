class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quicksort(int nums[], int low, int high) {
        if (low >= high){ 
            return;
        }

        int left = low;
        int right = high;
        int mid = low + (high - low) / 2;
        int pivot = nums[mid];

        while (left <= right) {
            while (nums[left] < pivot) {
                left++;
            }
            while (nums[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        quicksort(nums, low, right);
        quicksort(nums, left, high);
    }
}