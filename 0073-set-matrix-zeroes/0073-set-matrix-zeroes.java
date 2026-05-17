class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int[]>q=new LinkedList<>();
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int curr[]=q.poll();
            for(int i=0;i<n;i++){
                matrix[i][curr[1]]=0;
            }
            for(int i=0;i<m;i++){
                matrix[curr[0]][i]=0;
            }
        }
    }
}