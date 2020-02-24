package ru.ssau.tk.tatyanna.tatyanna;

public class NamedPoint extends Point {
    private String name;

    public NamedPoint() {
        super(0, 0, 0);
        this.name = "Origin";
    }

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (name == null) {
            return super.toString();
        }
        return name + " " + super.toString();
    }

}

