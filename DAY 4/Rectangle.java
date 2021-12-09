class Rect {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }
}

class Cuboid extends Rect {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.length = 5;
        cuboid.breadth = 4;
        cuboid.height = 4;
        System.out.println(cuboid.volume());

    }
