package chart_tutorial.scatter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.Locale;

public class ScatterPlot extends JFrame {
    private static final long serialVersionUID = 12345L;

    public ScatterPlot (String title) {
        super(title);

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createScatterPlot(
                "B vs G",
                "X-ass", "Y-ass", dataset);

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    public ScatterPlot (String title, XYDataset inputDataset) {
        super(title);

        XYDataset dataset = inputDataset;

        JFreeChart chart = ChartFactory.createScatterPlot(
                "B vs G",
                "X-ass", "Y-ass", dataset);

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries series1 = new XYSeries("Boys");
        series1.add(1, 72.9);
        series1.add(2, 81.6);
        series1.add(3, 88.9);
        series1.add(4, 96);
        series1.add(5, 102.1);
        series1.add(6, 108.5);
        series1.add(7, 113.9);
        series1.add(8, 119.3);
        series1.add(9, 123.8);
        series1.add(10, 124.4);

        dataset.addSeries(series1);

        XYSeries series2 = new XYSeries("Girls");
        series2.add(1, 72.5);
        series2.add(2, 80.1);
        series2.add(3, 87.2);
        series2.add(4, 94.5);
        series2.add(5, 101.4);
        series2.add(6, 107.4);
        series2.add(7, 112.8);
        series2.add(8, 118.2);
        series2.add(9, 122.9);
        series2.add(10, 123.4);
        dataset.addSeries(series2);

        return dataset;
    }

    private static XYDataset staticDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries series1 = new XYSeries("Boys");
        series1.add(1, 72.9);
        series1.add(2, 81.6);
        series1.add(3, 88.9);
        series1.add(4, 96);

        dataset.addSeries(series1);

        XYSeries series2 = new XYSeries("Girls");
        series2.add(1, 72.5);
        series2.add(2, 80.1);
        series2.add(3, 87.2);
        series2.add(4, 94.5);

        dataset.addSeries(series2);

        return dataset;
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> {
                ScatterPlot ex = new ScatterPlot("Scatter Chart Example",
                        ScatterPlot.staticDataset());
                ex.setSize(800, 400);
                ex.setLocationRelativeTo(null);
                ex.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                ex.setVisible(true);

                });
    }
}
