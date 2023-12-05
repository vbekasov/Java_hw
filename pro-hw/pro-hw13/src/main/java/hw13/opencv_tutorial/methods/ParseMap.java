package hw13.opencv_tutorial.methods;

import org.opencv.core.*;
import org.opencv.imgproc.Imgproc;

public class ParseMap {
    private ParseMap() {}

    public static Mat findRoads(final Mat m) {
        final Scalar ROAD = new Scalar(179, 177, 175);
        final Scalar WHITE =  new Scalar(255, 255, 255);
        final double[] xy = new double[2];
        final Scalar sc = new Scalar(0.);
        final Point point = new Point();
        final Mat parsed = new Mat(m.size(), m.type());
        for (int i = 0; i < m.cols() - 1; i++) {
            for (int j = 0; j < m.rows() - 1; j++) {
                xy[0] = i;
                xy[1] = j;
                point.set(xy);
                sc.set(m.get(j, i));
                if (sc.equals(ROAD))
                    Imgproc.drawMarker(parsed, point, WHITE);
            }
        }
        Imgproc.cvtColor(parsed, parsed, Imgproc.COLOR_BGR2GRAY);
        Core.bitwise_not(parsed, parsed);
        Imgproc.blur(parsed, parsed, new Size(10, 10),
                new Point(-1, -1));

        return parsed;
    }

    public static int[] blackWhiteToArr(Mat m) {
        

        return null;
    }
}
