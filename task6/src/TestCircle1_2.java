public class TestCircle1_2 {
    public static void main(String[] args) {
        Circle1_2 c1 = new Circle1_2();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " ,Circumference of " + c1.getCircumferece());
        //gtr set radius
        c1.setRadius(2.0);
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " ,Circumference of " + c1.getCircumferece());
        //
        Circle1_2 c2 = new Circle1_2(1.2);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() + " ,Circumference of " + c2.getCircumferece());
    }
}
