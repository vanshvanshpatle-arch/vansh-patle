class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;

            }else if (target> nums[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }

        return start;
    }
}




//dryb run
// nums = [1,3,5,6], target = 2

// | start | end | mid | nums[mid] | action    |
// | ----- | --- | --- | --------- | --------- |
// | 0     | 3   | 1   | 3         | end = 0   |
// | 0     | 0   | 0   | 1         | start = 1 |
