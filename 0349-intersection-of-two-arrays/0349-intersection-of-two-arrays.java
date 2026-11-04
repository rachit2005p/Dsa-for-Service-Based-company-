class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> s1 = new HashSet<>();
        HashSet <Integer> s2 = new HashSet<>();
        
        for(int ele : nums1){
            s1.add(ele);
        }
        for(int ele : nums2){
            s2.add(ele);
        }
        int res[] = new int[Math.min(s1.size(),s2.size())];
    int j =0;
        for(int i : s1){
            if(s2.contains(i)){
                res[j++]=i;
            }
        }return Arrays.copyOf(res,j);

    }
}