//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//
//interface Shape extends Comparable<Shape>{
//    double getVolume();
//    @Override
//    default int compareTo(Shape other) {
//        return Double.compare(getVolume(), other.getVolume());
//    }
//}
//
//abstract class SolidOfRevolution implements Shape {
//    protected double radius;
//    SolidOfRevolution(double radius) {
//        this.radius = radius;
//    }
//    double getRadius() {
//    return radius;
//    }
//}
//
//class Cylinder extends SolidOfRevolution{
//    private double height;
//
//    Cylinder(double radius, double height) {
//        super(radius);
//        this.height = height;
//
//    }
//    @Override
//    public double getVolume(){
//    return Math.PI * radius*radius * height;
//    }
//}
//
//class Ball extends SolidOfRevolution {
//    @Override
//    public double getVolume(){
//    return Math.PI*Math.pow(radius, 3)*4/3;
//    }
//    Ball(double radius) {
//        super(radius);
//    }
//}
//
//class Pyramid implements Shape {
//    private double h;
//    private double s;
//    Pyramid(double h, double s) {
//        this.h = h;
//        this.s = s;
//    }
//    @Override
//    public double getVolume() {
//        return h * s *4 / 3;
//    }
//}
//
//class Box implements Shape{
//    private ArrayList<Shape> shapes = new ArrayList<>();
//    private double available;
//    private  double volume;
//
//    Box(double available) {
//        this.available = available;
//        this.volume = available;
//    }
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
//    public ArrayList<Shape> getShapes() {
//        return shapes;
//    }
//
//    public double getAvailable() {  // остаток места в боксе
//        return available;
//    }
//
//    public String toString(Shape shape) {
//        String s = shape.getClass() + " shape " + shape.getVolume();
//        return s;
//    }
//}
//
//public class Main_Interfece {
//    public static void main(String[] args) {
//
//    Pyramid pyramid = new Pyramid(2, 3);
//    Ball ball = new Ball(2);
//    Cylinder cylinder = new Cylinder(3, 2);
//
//    Box box = new Box(100);
//
////        System.out.println(box.getVolume());
//        System.out.println(box.getAvailable());
//        System.out.println(box.add(pyramid));
//        System.out.println(box.add(cylinder));
//        System.out.println(box.add(ball));
// //       System.out.println(box.getVolume());
//        System.out.println(box.getAvailable());
//        System.out.println(box.getShapes());
//
//
//        ArrayList<Shape> sh = box.getShapes();
//        Collections.sort(sh);
////        System.out.println(box.getShapes());
//        for(Shape shap: sh){
//            System.out.println(box.toString(shap));
//        }
//
//}
//}
