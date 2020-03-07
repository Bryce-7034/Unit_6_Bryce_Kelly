public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();

/*
        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");
        */

        System.out.println();

        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRow(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
        for(int weg: mat[row]){
                if(weg%2==1){
                    return false;
                }

        }
        return true;
    }

    //returns true if the sum of the numbers the given col is odd.
    public boolean oddColSum(int[][] mat, int row){
        int sum = 0;
        for(int egg: mat[row]){
            sum+=egg;
        }
        return(sum%2==1);
    }


    public int[] minRow(int [][] mat){
        int[] min = mat[0];
        int small = 100;
        for(int i = 0; i<mat.length; i++){
            for(int s = 0; s<mat[i].length;s++){
                int sum = 0;
                sum += mat[i][s];
                if(sum<small){
                    min = mat[i];
                    small = sum;
                }
            }
        }
        return min;
    }
    public int minRow(int[][] egg, int row){
        int min = 999999;
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
        int i = 0;
        for(int[] row:data){
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
        double[] avgArr = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++){
            int sum = 0;
            for(int t =0; t<nums.length;t++){
                sum += nums[t][i];
            }
            avgArr[i] = sum/((double)nums.length);
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
        int i = -1;
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