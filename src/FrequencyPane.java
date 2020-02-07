import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.chart.XYChart;

public class FrequencyPane {
    int[] nums = new int[1];
    int zero10 = 0;
    int one10 = 0;
    int two10 = 0;
    int three10 = 0;
    int four10 = 0;
    int five10 = 0;
    int six10 = 0;
    int seven10 = 0;
    int eight10 = 0;
    int nine10 = 0;
    int ten10 = 0;
    XYChart.Series dataSeries1 = new XYChart.Series();

    @FXML
    private AnchorPane pane1;

    @FXML
    private TextField input;

    @FXML
    private BarChart<?, ?> bar;

    @FXML
    private NumberAxis barNumber;

    @FXML
    private CategoryAxis barCategory;

    @FXML
    private Button chartLoad;

    @FXML
    private Label title;

    @FXML
    private Button update;

    @FXML
    private Button clear;

    @FXML
    void addInput(ActionEvent event) {
        int[] keep = new int[nums.length];
        int i = 1;
        int n = 0;
        for(int s=0;s<nums.length;s++){
            keep[s]=nums[s];
        }
        nums = new int[i];
        for(int num: keep){
            nums[n]=num;
            n++;
        }
        nums[i-1]=Integer.parseInt(input.getText());
        input.clear();
        for(int num : nums){
            if(num>=90){
                nine10++;
            }
            else if(num>=80){
                eight10++;
            }
            else if(num>=70){
                seven10++;
            }
            else if(num>=60){
                six10++;
            }
            else if(num>=50){
                five10++;
            }
            else if(num>=40){
                four10++;
            }
            else if(num>=30){
                three10++;
            }
            else if(num>=20){
                two10++;
            }
            else if(num>=10){
                one10++;
            }
            else if(num>=0){
                zero10++;
            }
        }
        i++;
    }

    @FXML
    void createChart(ActionEvent event) {


        dataSeries1.setName("Numbers");

        dataSeries1.getData().add(new XYChart.Data("0_9", zero10));
        dataSeries1.getData().add(new XYChart.Data("10_19", one10));
        dataSeries1.getData().add(new XYChart.Data("20_29", two10));
        dataSeries1.getData().add(new XYChart.Data("30_39", three10));
        dataSeries1.getData().add(new XYChart.Data("40_49", four10));
        dataSeries1.getData().add(new XYChart.Data("50_59", five10));
        dataSeries1.getData().add(new XYChart.Data("60_69", six10));
        dataSeries1.getData().add(new XYChart.Data("70_79", seven10));
        dataSeries1.getData().add(new XYChart.Data("80_89", eight10));
        dataSeries1.getData().add(new XYChart.Data("90_100", nine10));
        bar.getData().clear();
        bar.layout();
         bar.getData().add(dataSeries1);
    }
    @FXML
    void clear(ActionEvent event){
        bar.getData().clear();
        dataSeries1.getData().clear();
        bar.layout();
    }

}
