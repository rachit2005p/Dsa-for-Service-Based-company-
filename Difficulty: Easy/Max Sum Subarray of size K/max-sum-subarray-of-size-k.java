class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=arr[i];
        }
        int maxsum=0;maxsum=ans;
        for(int j=k;j<arr.length;j++){
                
                ans=ans-arr[j-k];
                ans=ans+arr[j];
                maxsum=Math.max(maxsum,ans);
            
        }return maxsum;
    }
}