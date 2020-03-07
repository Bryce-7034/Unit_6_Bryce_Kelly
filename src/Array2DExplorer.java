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
    public int[] allRowSums(int[][] data){
        int[] sumArr = new int[data.length];
        for(int[] row:data){
            int i = 0;
            int sum = 0;
            for(int num:row){
                sum+=num;
            }
            sumArr[i]=sum;
            i++;
        }
        return sumArr;
    }
    public double[] averageCol(int[][] nums){
        double[] avgArr = new double[nums.length];
        for(int[]row:nums){
            double sum = 0;
            int i = 0;
            for(int num: row){
                sum+=num;
            }
            avgArr[i] = sum/nums[i].length;
            i++;
        }
        return avgArr;
    }
    public int smallEven(int[][] matrix){
        int min = 9999999;
        for(int[]row:matrix){
            for(int num:row){
                if(num<min){
                    min = num;
                }
            }
        }
        return min;
    }
    public int biggestRow(int[][] nums){
        int[] sums = allRowSums(nums);
        int big = 0;
        int index = 0;
        int i = 0;
        for(int num: sums){
            if(num>big){
                i++;
                big = num;
                index = i;
            }
        }
        return index;
    }

}
