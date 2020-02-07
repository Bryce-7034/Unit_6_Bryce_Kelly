import java.util.Scanner;
public class FrequencyChart {
    private int[] list;
    public FrequencyChart(int[] list){
        this.list = list;
    }
    public String makeChart(){
        int countMin = 0;
        int countMax = 10;
        int[] lengths = new int[10];
        return "";
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many valuse in your data set");
        int size = scan.nextInt();
        int[] data = new int[size];
        System.out.println("Enter data value one at a time, followed by enter");
        int val =0;
        for(int i=0; i<data.length; i++){
            val = scan.nextInt(); data[i] = val;
        }
        FrequencyChart chart = new FrequencyChart(data);
        //System.out.println(chart.FrequencyChart());
        }
}