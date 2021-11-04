//import java.util.ArrayList;
//
//class Shape {
//    private double volume;
//    public Shape(double volume) {
//        this.volume =  volume;
//    }
//    public double getVolume() {
//        return volume;
//    }
//}
//
//class SolidOfRevolution extends Shape{
//    private double radius;
//
//    public SolidOfRevolution(double volume, double radius) {
//        super(volume);
//        this.radius = radius;
//    }
//    public double getRadius() {
//        return radius;
//    }
//}
//
//class Ball extends SolidOfRevolution{
//    public Ball(double radius) {
//        super(Math.PI*Math.pow(radius, 3)*4/3, radius);
//    }
//}
//
//class Sylinder extends SolidOfRevolution{
//    private double height;
//
//    public Sylinder(double radius, double height) {
//        super(Math.PI * radius*radius * height, radius);
//        this.height = height;
//    }
//}
//
//class Pyramid extends Shape {
//    private double se;
//    private double he;
//
//    Pyramid(double h, double s) {
//        super(h * s * 4 / 3);
//        this.he = h;
//        this.se = s;
//    }
//}
//
//class Box extends Shape {
//    ArrayList<Shape> shapes = new ArrayList<>();
//    private double available;
//    Box(double available) {
//        super(available);
//        this.available = available;
//    }
//    public boolean addShape( Shape shape) {
//        if(available>= shape.getVolume()) {
//            shapes.add(shape);
//            available -=shape.getVolume();
//            return true;
//        } else return false;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Ball ball = new Ball(2);
//        Pyramid pyramid = new Pyramid(5, 1);
//        Sylinder sylinder = new Sylinder(200, 100);
//
//        Box box = new Box(1000);
//
//        System.out.println(box.addShape(ball));
//        System.out.println(box.addShape(pyramid));
//        System.out.println(box.addShape(sylinder));
//    }
//
//}
