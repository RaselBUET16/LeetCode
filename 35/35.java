class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if ( nums[mid] == target)
                return mid;
            if (i == j && nums[i] != target){
                return (target > nums[i]) ? i+1 : i;
            }
            if (nums[mid] < target) 
                i = mid+1 ;
            else 
                j = mid;
            
        }

        return 0;
    }
}
