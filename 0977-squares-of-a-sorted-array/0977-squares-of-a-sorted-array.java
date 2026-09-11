class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int p = nums.length-1;
    
    while(left<=right){
    if((nums[left]*nums[left])>(nums[right]*nums[right])){
        ans[p--]=(nums[left]*nums[left]);
          left++;
    }
    else{
        ans[p--]=(nums[right]*nums[right]);
        right--;
    }
  
    
    }return ans;
    
    }

}