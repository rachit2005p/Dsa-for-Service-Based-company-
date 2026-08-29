class Solution {
    boolean twoSum(int arr[], int target) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            int rem = target - i;
            if(set.contains(rem))return true;
            else{
                set.add(i);
            }
        }
        return false;
        
        
    }
}