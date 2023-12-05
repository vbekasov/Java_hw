package hw13.opencv_tutorial.methods;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class LoadSaveImg {
    public static Mat loadImage(String imgPath) {
        try {
            Imgcodecs imgCodecs = new Imgcodecs();
            return Imgcodecs.imread(imgPath);
        } catch (Exception e) {
            throw new RuntimeException("Image not found.");
        }
    }

    public static boolean saveImage(Mat matrix, String savePath) {
        try {
            Imgcodecs.imwrite(savePath, matrix);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Wrong path.");
        }
    }
}
