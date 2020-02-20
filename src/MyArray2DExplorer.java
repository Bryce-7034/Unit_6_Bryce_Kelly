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


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

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









}