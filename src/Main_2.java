//import java.util.ArrayList;
//
//class Shape{
//    private double valume;
//    Shape(double valume) {
//        this.valume = valume;
//    }
//    double getValume() {
//        return valume;
//    }
//}
//
//class SolidOfRevolution extends Shape{
//    private double radius;
//
//    SolidOfRevolution(double valume, double radius) {
//        super(valume);
//        this.radius = radius;
//    }
//}
//
//class Sylinder extends SolidOfRevolution{
//   private double height;
//
//    Sylinder(double height, double radius) {
//        super(Math.PI * radius*radius * height, radius);
//        this.height = height;
//    }
//}
//
//class Ball extends SolidOfRevolution{
//    Ball(double radius) {
//        super(Math.PI*Math.pow(radius, 3)*4/3, radius);
//    }
//}
//
//class Piramid extends Shape {
//    private double s;
//    private double h;
//
//    Piramid(double s, double h) {
//        super(h * s * 4 / 3);
//        this.h = h;
//        this.s = s;
//    }
//
//}
//
//class Box extends Shape {
//
//    ArrayList<Shape> shapes = new ArrayList<>();
//    private double available;
//
//    Box(double available) {
//        super(available);
//        this.available = available;
//    }
//
//  public boolean add(Shape shape) {
//        if(available>= shape.getValume()) {
//            shapes.add(shape);
//            available -= shape.getValume();
//            return true;
//        }else return false;
//  }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Piramid piramid = new Piramid(2, 3);
//        Ball ball = new Ball(2);
//        Sylinder sylinder = new Sylinder(2, 2);
//
//        Box box = new Box(100);
//
//
//        System.out.println(box.add(piramid));
//        System.out.println(box.add(sylinder));
//        System.out.println(box.add(ball));
//
//
//
//    }
//}
