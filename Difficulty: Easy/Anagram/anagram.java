class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer> map= new HashMap<>();
    if (s1.length() != s2.length()) {
        return false;
    }
        for(char ele:s1.toCharArray()){
            
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(char ele:s2.toCharArray()){
            if(map.containsKey(ele)&&map.get(ele)>0){
                map.put(ele,map.get(ele)-1);
            }
            else{return false;}
        }
        return true;
    }
}