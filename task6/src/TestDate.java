public class TestDate {
    public static void main(String[] args) {
        Date dt = new Date(19, 4, 2022);
        System.out.println(dt.toString());
        dt.setDay(9);
        dt.setMonth(6);
        dt.setYear(2021);
        System.out.println("Day: " + dt.getDay() + "-Month: " + dt.getMonth() + "-Year: " + dt.getYear());
        dt.setDate(21,9,1999);
        System.out.println(dt);
    }
}
