class Solution {
    public int[] sortedSquares(int[] nums) {
         int i =0;
         int j=nums.length-1;
         int result []= new int [nums.length];
          int s = nums.length-1;
         while(i<=j){
            
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                    result[s]=nums[i]*nums[i];
                    i++;
            }
            else{
                result[s]=nums[j]*nums[j];
                j--;
            }
            s--;
         }return result;
    }
}