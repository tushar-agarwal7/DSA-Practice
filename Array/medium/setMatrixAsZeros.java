public class setMatrixAsZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int n=3;
        int m=3;
         int[] rows=new int[n];
         int[] cols=new int[m];
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;

                 }
             }
         }
         for (int i = 0; i < n; i++) {
             if(rows[i]==1){
                for (int j = 0; j < m; j++) {
                    matrix[i][j]=0;
                }
             }
         }

         for (int i = 0; i < m; i++) {
            if(cols[i]==1){
               for (int j = 0; j < n; j++) {
                   matrix[j][i]=0;
               }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
     
}