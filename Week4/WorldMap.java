public class WorldMap {
    public static void main(String[] args) {
        // read in bounding box and rescale
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        // plot points, one at a time
        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int vert = StdIn.readInt();
            double[] arrX = new double[vert];
            double[] arrY = new double[vert];

            for (int i = 0; i < vert; i++) {
                arrX[i] = StdIn.readDouble();
                arrY[i] = StdIn.readDouble();
            }
            StdDraw.polygon(arrX, arrY);
        }
    }
}
