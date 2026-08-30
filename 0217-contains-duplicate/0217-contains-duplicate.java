class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map= new HashSet<>();
    for(int ele:nums){
        if(map.contains(ele)){
            return true;
        }
        map.add(ele);
    }return false;
    }
}