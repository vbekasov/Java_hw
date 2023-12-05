package hw13.opencv_tutorial;

import hw13.opencv_tutorial.defaults.EPath;
import hw13.opencv_tutorial.methods.LoadSaveImg;
import hw13.opencv_tutorial.methods.ParseMap;
import nu.pattern.OpenCV;
import org.opencv.core.Mat;

public class MainOpenCV {
    public static void main(String[] args) {
        System.out.println("Works");

        OpenCV.loadLocally();
        Mat m = LoadSaveImg.loadImage(EPath.RESOURCES.getVal() + "map_ber_ist.png");
        System.out.println(m.rows() + "  " + m.cols());

        LoadSaveImg.saveImage(
                ParseMap.findRoads(m),
                EPath.RESOURCES.getVal() + "parsed.png");
    }
}
