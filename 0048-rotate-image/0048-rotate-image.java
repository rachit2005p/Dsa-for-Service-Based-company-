class Solution {
    public void rotate(int[][] matrix) {
        for(int i =0;i<matrix.length;i++){
            for(int j =i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix [j][i];
                matrix[j][i]=temp;
            }
    }
        for(int i =0;i<matrix.length;i++){
           int left=0,j = matrix.length-1;
           while(left<j){
            int temp = matrix[i][left];
            matrix[i][left]=matrix[i][j];
            matrix[i][j]= temp;
            j--;
            left++;
           }
    }
    
    
    
    
    }


}