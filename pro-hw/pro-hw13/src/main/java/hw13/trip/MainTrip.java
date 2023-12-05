package hw13.trip;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class MainTrip {
    public static Mat loadImage(String imgPath) {
        Imgcodecs imgCodecs = new Imgcodecs();
        return imgCodecs.imread(imgPath);
    }
    public static void main(String[] args) {
        System.out.println("Works");

        //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        nu.pattern.OpenCV.loadLocally();
        Mat m = loadImage("src/main/resources/map_ber_ist.png");
        System.out.println(m.rows() + "  " + m.cols());
    }
}
