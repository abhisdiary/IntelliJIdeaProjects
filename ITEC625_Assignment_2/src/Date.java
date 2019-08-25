
public class Date {
    private int day, month, year;

    //DO NOT MODIFY
    public int getDay() {
        return day;
    }

    //DO NOT MODIFY
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @param month
     */
    public void setMonth(int m) {
        // to be completed
        if (m > 0 && m < 13) {
            this.month = m;
        } else if (m <= 0) {
            this.month = 1;
        } else {
            this.month = 12;
        }
    }

    /**
     * ASSUMPTION: month and year are already set
     *
     * @param day
     */
    public void setDay(int d) {
        int[] days = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                day = Math.max(1, Math.min(29, d));
            } else {
                day = Math.max(1, Math.min(28, d));
            }
        } else {
            day = Math.max(1, Math.min(days[month], d));
        }
    }

    //DO NOT MODIFY
    public int getMonth() {
        return month;
    }

    //DO NOT MODIFY
    public int getYear() {
        return year;
    }

    //DO NOT MODIFY
    public Date(int day, int month, int year) {
        setMonth(month);
        setYear(year);
        setDay(day);
    }

    //DO NOT MODIFY
    public Date(Date d) {
        setMonth(d.month);
        setYear(d.year);
        setDay(d.day);
    }

    //DO NOT MODIFY
    public Date() {
        setYear(1);
        setMonth(1);
        setDay(1);
    }

    //DO NOT MODIFY
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    /**
     * @param other
     * @return 1 if the date represented by calling object is AFTER date represented by parameter object
     * -1 if the date represented by calling object is BEFORE date represented by parameter object
     * 0 if the date represented by calling object is THE SAME AS date represented by parameter object
     */
    public int compareTo(Date other) {
        // to be completed
        if ((other.getYear() == this.getYear()) && (other.getMonth() == this.getMonth()) && (other.getDay() == this.getDay())) {
            return 0;
        } else {
            if (other.getYear() < this.getYear()) {
                return 1;
            } else {
                if (other.getMonth() < this.getMonth()) {
                    return 1;
                } else {
                    if (other.getDay() < this.getDay()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }
}
