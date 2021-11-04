//import java.util.ArrayList;
//
//abstract class Shape{
//    public abstract double getVolume();
//}
//
//abstract class SolidOfRevolution extends Shape{
//    protected double radius;
//
//    public SolidOfRevolution(double radius){
//        this.radius = radius;
//    }
//    public  double getRadius() {
//        return radius;
//    }
//}
//
//class Cylinder extends SolidOfRevolution{
//    private double height;
//
//    public Cylinder(double radius, double height) {
//        super(radius);
//        this.height = height;
//    }
//
//    @Override
//    public double getVolume() {
//        return Math.PI * radius*radius * height;
//    }
//}
//
//class Ball extends SolidOfRevolution{
//    Ball(double radius) {
//        super(radius);
//
//    }
//    @Override
//    public double getVolume() {
//        return Math.PI*Math.pow(radius, 3)*4/3;
//    }
//
//}
//
//class Pyramid extends Shape {
//    private double s;
//    private double h;
//
//    Pyramid(double s, double h) {
//        this.h = h;
//        this.s = s;
//    }
//@Override
//    public double getVolume() {
//        return h * s *4 / 3;
//}
//
//
//}
//
//class Box extends Shape {
//
//    ArrayList<Shape> shapes = new ArrayList<>();
//    private double available; // оставшийся объем бокса
//    private double volume; // объем всего бокса
//
//    Box(double available) {
//       this.available = available;
//        this.volume =available;
//    }
//
//    public boolean add(Shape shape) {
//        if(available>= shape.getVolume()) {
//            shapes.add(shape);
//            available -= shape.getVolume();
//            return true;
//        }else return false;
//    }
//
//    @Override
//    public double getVolume() { //изначальный объем данного бокса
//        return volume;
//    }
//
//    public double getAvailable() {  // остаток места в боксе
//        return available;
//    }
//}
//
//public class Main_Abstract {
//    public static void main(String[] args) {
//        Pyramid pyramid = new Pyramid(2, 3);
//        Ball ball = new Ball(2);
//        Cylinder cylinder = new Cylinder(20, 2);
//
//        Box box = new Box(100);
//
//        System.out.println(box.getVolume());
//        System.out.println(box.getAvailable());
//        System.out.println(box.add(pyramid));
//        System.out.println(box.add(cylinder));
//        System.out.println(box.add(ball));
//        System.out.println(box.getVolume());
//        System.out.println(box.getAvailable());
//
//
//
//    }
//}
