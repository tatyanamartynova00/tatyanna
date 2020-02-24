package ru.ssau.tk.tatyanna.tatyanna;

public class Points {
    private static double ACCURACY = 0.00005;

    public static Point sum(Point firstPoint, Point secondPoint) {
        Point sumPoints = new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
        return sumPoints;
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        Point subtractPoints = new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
        return subtractPoints;
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        Point multiplyPoints = new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
        return multiplyPoints;
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        Point dividePoints = new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
        return dividePoints;
    }

    public static Point enlarge(Point firstPoint, double multiplier) {
        Point enlargePoint = new Point(firstPoint.x * multiplier, firstPoint.y * multiplier, firstPoint.z * multiplier);
        return enlargePoint;
    }

    public static double length(Point firstPoint) {
        double lengthVector = firstPoint.length();
        return lengthVector;
    }

    public static Point opposite(Point firstPoint) {
        Point oppositePoint = new Point(firstPoint.x * (-1), firstPoint.y * (-1), firstPoint.z * (-1));
        return oppositePoint;
    }

    public static Point inverse(Point firstPoint) {
        Point inversePoint = new Point(1 / firstPoint.x, 1 / firstPoint.y, 1 / firstPoint.z);
        return inversePoint;

    }

    public static double scalarProduct(Point firstPoint, Point secondPoint) {
        double scalarProductOfPoints = firstPoint.x * secondPoint.x + firstPoint.y * secondPoint.y + firstPoint.z * secondPoint.z;
        return scalarProductOfPoints;

    }

    public static Point vectorProduct(Point firstPoint, Point secondPoint) {
        Point vectorProductOfPoints = new Point(firstPoint.y * secondPoint.z - secondPoint.y * firstPoint.z, secondPoint.x * firstPoint.z - firstPoint.x * secondPoint.z, firstPoint.x * secondPoint.y - secondPoint.x * firstPoint.y);
        return vectorProductOfPoints;

    }

    private static boolean equalsApproximately(double firstPount, double secondPoint) {
        return Math.abs(firstPount - secondPoint) < ACCURACY;
    }

    static boolean equalsApproximately(Point firstPoint, Point secondPoint) {
        return equalsApproximately(firstPoint.x, secondPoint.x) & equalsApproximately(firstPoint.y, secondPoint.y) & equalsApproximately(firstPoint.z, secondPoint.z);
    }

    private Points() {

    }
}

