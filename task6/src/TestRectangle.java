public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(7);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.getArea() + " and "+ r1.getPerimeter());
        //
        Rectangle r2 = new Rectangle(2, 5);
        System.out.println("Length: " + r2.getLength());
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Area: " + r2.getArea() + " and "+ r2.getPerimeter());

    }
}
