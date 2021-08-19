package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import java.net.URL;
import java.util.ResourceBundle;

public class barchart_controller implements Initializable {

    @FXML
    public BarChart barchart_view;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        XYChart.Series series_1 = new XYChart.Series();
        series_1.setName("Java");
        series_1.getData().add(new XYChart.Data("Boston",15));
        series_1.getData().add(new XYChart.Data("Pittsburgh",25));
        series_1.getData().add(new XYChart.Data("Philadelphia",20));
        series_1.getData().add(new XYChart.Data("New Orleans",50));
        series_1.getData().add(new XYChart.Data("Chicago",30));
        series_1.getData().add(new XYChart.Data("Houston",45));
        series_1.getData().add(new XYChart.Data("San Diego",21));
        series_1.getData().add(new XYChart.Data("Memphis",38));
        barchart_view.getData().addAll(series_1);

        XYChart.Series series_2 = new XYChart.Series();
        series_2.setName("Oracle");
        series_2.getData().add(new XYChart.Data("Boston",20));
        series_2.getData().add(new XYChart.Data("Pittsburgh",30));
        series_2.getData().add(new XYChart.Data("Philadelphia",40));
        series_2.getData().add(new XYChart.Data("New Orleans",15));
        series_2.getData().add(new XYChart.Data("Chicago",60));
        series_2.getData().add(new XYChart.Data("Houston",35));
        series_2.getData().add(new XYChart.Data("San Diego",19));
        series_2.getData().add(new XYChart.Data("Memphis",12));
        barchart_view.getData().addAll(series_2);

        XYChart.Series series_3 = new XYChart.Series();
        series_3.setName("SAP");
        series_3.getData().add(new XYChart.Data("Boston",30));
        series_3.getData().add(new XYChart.Data("Pittsburgh",10));
        series_3.getData().add(new XYChart.Data("Philadelphia",20));
        series_3.getData().add(new XYChart.Data("New Orleans",25));
        series_3.getData().add(new XYChart.Data("Chicago",6));
        series_3.getData().add(new XYChart.Data("Houston",5));
        series_3.getData().add(new XYChart.Data("San Diego",35));
        series_3.getData().add(new XYChart.Data("Memphis",48));
        barchart_view.getData().addAll(series_3);

        XYChart.Series series_4 = new XYChart.Series();
        series_4.setName("ODOO");
        series_4.getData().add(new XYChart.Data("Boston",50));
        series_4.getData().add(new XYChart.Data("Pittsburgh",35));
        series_4.getData().add(new XYChart.Data("Philadelphia",20));
        series_4.getData().add(new XYChart.Data("New Orleans",10));
        series_4.getData().add(new XYChart.Data("Chicago",4));
        series_4.getData().add(new XYChart.Data("Houston",15));
        series_4.getData().add(new XYChart.Data("San Diego",25));
        series_4.getData().add(new XYChart.Data("Memphis",2));
        barchart_view.getData().addAll(series_4);


    }
}
