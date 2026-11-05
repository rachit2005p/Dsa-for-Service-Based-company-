class Solution {
    void swap(int nums[] ,int a , int b){
     int temp = nums[a] ;
    nums[a]=nums[b];
    nums[b]=temp;
    }
    public void moveZeroes(int[] nums) {
        int j=0,i=0;
        while(i<nums.length){
                if(nums[i]!=0){
                swap(nums,i,j);
                j++; 
                i++;          
            }
            else{
                i++;
            }
        } 
    }
}