public class Array2DExplorer {
    public static void main(String[] args) {
        int array [][] = {{0,2,4,6},
                {4,1,8,5},
                {6,6,2,2}};
    }
    public int minRow(int[][] egg, int row){
        int min = 0;
        for(int weg: egg[row]){
            if(weg<min)
                min = weg;
        }
        return min;
    }
    public int[] colMaxs(int[][] matrix){
        int[] maxArr = new int[matrix[0].length];
        for(int col = 0; col<matrix[0].length; col++){
            int max = matrix[0][col];
            for(int row = 0; row<matrix.length; row++){
                if(matrix[row][col]>max)
                    max = matrix[row][col];
            }
            maxArr[col]=max;
        }
        return maxArr;
    }
}
