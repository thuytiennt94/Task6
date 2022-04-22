public class Circle1_2 {
    private double radius;
    public Circle1_2(){
        radius = 1.0;
    }
    public Circle1_2(double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumferece(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle1_2{" + "radius=" + radius + '}';
    }
}
