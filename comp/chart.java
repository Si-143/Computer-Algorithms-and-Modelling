/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp;

import static comp.Comp.*;
import static comp.Comp1.*;
import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Collections;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYLineAnnotation;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author ts348
 */
public class chart {

    public static void main(String[] args) {

    }

    //create a dataset...
    public static void CreateGraph() {
        jPanel2.removeAll();
        jPanel2.revalidate();
        
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Graph", // chart title
                "X", // x axis label
                "Y", // y axis label
                createDataset(), // data  ***-----PROBLEM------***
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
        );
//double a = Collections.min(Arrays.asList(list), null); 
        XYPlot plot = chart.getXYPlot();//-
        XYLineAnnotation plotLine
                = new XYLineAnnotation(Collections.min(arrayToArrayList(X)),Collections.min(arrayToArrayList(Y)), Collections.max(arrayToArrayList(X)), Collections.max(arrayToArrayList(Y)));// 
        plot.addAnnotation(plotLine);
        
        // create and display a frame...
        ChartPanel frame = new ChartPanel(chart);
        frame.setDomainZoomable(true);
        jPanel2.add(frame, BorderLayout.CENTER);
        jPanel2.validate();
        Comp1.jPanel2.add(frame);
        frame.setVisible(true);
    }

    private static XYDataset createDataset() {
        XYSeriesCollection name = new XYSeriesCollection();
        XYSeries name2 = new XYSeries("(name2)");
        for (int i = 0; i < a2.size(); i++) {
            double x = a2.get(i);// arraylist
            double y = Y[i];//array list
            name2.add(x, y);

        }

        name.addSeries(name2);

        return name;
    }
}
