public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second= second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<=23 ){
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >=0 && minute <=59 ){
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second >=0 && second <=59 ){
            this.second = second;
        }
    }
    public void setTime(int hour, int minute, int second){
        if (hour>=0 && hour<=23 ){
            this.hour = hour;
        }
        if (minute >=0 && minute <=59 ){
            this.minute = minute;
        }
        if (second >=0 && second <=59 ){
            this.second = second;
        }
    }
    public Time nextSecond(){
        if(second == 59 && minute ==59 && hour ==23) {
            setTime(0,0,0);
        }else if (second==59 && minute==59){
            setTime(hour+1, 0,0);
        }else if (second==59){
            setTime(hour, minute+1,0);
        }else {
            second+=1;
        }
        return this;
    }
    public Time previousSecond(){
        if(second == 0 && minute ==0 && hour ==0) {
            setTime(23,59,59);
        }else if (second==0 && minute==0){
            setTime(hour-1, 59,59);
        }else if (second==59){
            setTime(hour, minute-1,59);
        }else {
            second-=1;
        }
        return this;
    }
    @Override
    public String toString() {
        return "Time: " +  hour + ":" + minute + ":" + second + '.';
    }

}
