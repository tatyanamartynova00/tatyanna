package ru.ssau.tk.tatyanna.tatyanna;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        double lengthVector = Math.sqrt(x * x + y * y + z * z);
        return lengthVector;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}

