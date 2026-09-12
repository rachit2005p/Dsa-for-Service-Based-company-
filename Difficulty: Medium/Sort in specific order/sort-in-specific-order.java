class Solution {
    public void sortIt(int[] arr) {
        // code here
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=-arr[i];
            }
        }
        Arrays.sort(arr);
    for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                if(arr[i]<0){
                arr[i]=-arr[i];
            }
            }
        
    }
    
}}
