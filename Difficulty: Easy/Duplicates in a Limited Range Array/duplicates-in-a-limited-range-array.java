class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map =new  HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int ele:map.keySet()){
           if(map.get(ele)>1){
                ans.add(ele);
        }
        
        
        
    }return ans;
}
}