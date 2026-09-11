class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxarea = Integer.MIN_VALUE;
        while(left<=right){
            int area=0;
            int length=Math.min(height[left],height[right]);
            int breadth= right-left;
            area=length*breadth;
            maxarea=Math.max(maxarea,area);
           if(height[left]<height[right]){
            left++;
           }
           else{
            right--;
           }
        }return maxarea;

    }
}