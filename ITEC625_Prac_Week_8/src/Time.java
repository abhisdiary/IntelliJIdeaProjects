public class Time {
    private int hour, minute, second;

    public Time(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public Time(int h, int m) {
        setHour(h);
        setMinute(m);
        setSecond(0);
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
        if ((hour >= 0) && (hour <= 23)) {
            this.hour = hour;
        } else if (hour < 0) {
            this.hour = 0;
        } else {
            this.hour = 23;
        }
    }

    public void setMinute(int minute) {
        if ((minute >= 0) && (minute <= 59)) {
            this.minute = minute;
        } else if (minute < 0) {
            this.minute = 0;
        } else {
            this.minute = 59;
        }
    }

    public void setSecond(int second) {
        if ((second >= 0) && (second <= 59)) {
            this.second = second;
        } else if (second < 0) {
            this.second = 0;
        } else {
            this.second = 59;
        }
    }
}
