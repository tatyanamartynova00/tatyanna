package ru.ssau.tk.tatyanna.tatyanna;

public class Task4 {
    public static void main(String[] args) {
        Point p1 = new Point(6, 4, 8);
        Point p2 = new Point(2, -2, 4);
        double multiplier = -2;
        System.out.println("Sum is:" + "   (" + Points.sum(p1, p2).x + "   " + Points.sum(p1, p2).y + "   " + Points.sum(p1, p2).z + ")");
        System.out.println("Subtract is:" + "   (" + Points.subtract(p1, p2).x + "   " + Points.subtract(p1, p2).y + "   " + Points.subtract(p1, p2).z + ")");
        System.out.println("Multiply is:" + "   (" + Points.multiply(p1, p2).x + "   " + Points.multiply(p1, p2).y + "   " + Points.multiply(p1, p2).z + ")");
        System.out.println("Divide is:" + "   (" + Points.divide(p1, p2).x + "   " + Points.divide(p1, p2).y + "   " + Points.divide(p1, p2).z + ")");
        System.out.println("Enlarge is:" + "   (" + Points.enlarge(p1, multiplier).x + "   " + Points.enlarge(p1, multiplier).y + "   " + Points.enlarge(p1, multiplier).z + ")");
        System.out.println("Length is " + Points.length(p1));
        System.out.println("Opposite is" + "  (" + Points.opposite(p2).x + "   " + Points.opposite(p2).y + "   " + Points.opposite(p2).z + ")  ");
        System.out.println("Inverse is   (" + Points.inverse(p1).x + "   " + Points.inverse(p1).y + "   " + Points.inverse(p1).z + ")  ");
        System.out.println("Scalar product of p1 and p2 ="+"     " + Points.scalarProduct(p1,p2));
        System.out.println("Vector product of p1 and p2  = "+"  ("+Points.vectorProduct(p1,p2).x + "   "+Points.vectorProduct(p1,p2).y+"  "+Points.vectorProduct(p1,p2).z+" )  ");

    }
}