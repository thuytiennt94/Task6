public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(15,50,03);
        System.out.println(t1.toString());
        t1.setHour(3);
        t1.setMinute(30);
        t1.setSecond(40);
        System.out.println(t1);
        System.out.println("-----------");
        t1.setTime(22,49,49);
        System.out.println(t1);
        System.out.println("-----------");
        System.out.println(t1.nextSecond());
        Time t2 = new Time(0,0,0);
        System.out.println(t2.previousSecond());
    }
}
