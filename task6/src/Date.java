public class Date {
    private int day ;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day >= 1 && day<=31){
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month>=1 && month<=12){
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year>=1900 && year<=9999){
            this.year = year;
        }
    }
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date: " +  day + "/" + month +"/" + year + '.';
    }
}
