
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele:a){
            if(map.containsKey(ele)){
            map.put(ele, map.get(ele)+1);
            }
            else{map.put(ele,1);
        }
        
    }
    for(int i =0;i<b.length;i++){
        if(map.containsKey(b[i])&&map.get(b[i])>0){
            map.put(b[i],map.get(b[i])-1);
        
        }
        else{
            return false;
        }
    }return true;
    
    }
}
