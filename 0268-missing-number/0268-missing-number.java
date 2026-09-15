class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size*(size+1)/2;
        // int ans=0;
          int result=0;
        for(int ele:nums){
          
            result+=ele;
        }return sum-result;
    }
}