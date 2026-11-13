class Solution {
    public int count(int nums[], int a){
        String num=Integer.toString(nums[a]);
        int count=num.length();
        
        return count;}

    public int findNumbers(int[] nums) {
        int evencount=0;
        for(int i =0;i<nums.length;i++){
            if((count(nums,i))%2==0){
                evencount++; 
            }
        }return evencount;
    }
    }