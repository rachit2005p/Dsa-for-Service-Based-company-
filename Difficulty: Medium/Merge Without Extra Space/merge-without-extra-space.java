class Solution {
    public static void swap(int []a , int b[] , int i ,int j ){
        int temp = a[i];
        a[i]=b[j];
        b[j]=temp;
    }
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i=a.length-1 ,j=0;
    while(i>=0&&j<b.length){
            if(a[i]>b[j]){
                swap(a,b,i,j);
                i--;j++;
            }
            else{
                break;
            }
        
    }Arrays.sort(a);
    Arrays.sort(b);
        
    }
}
