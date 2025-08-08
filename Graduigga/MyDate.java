public class MyDate {
    private int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year < 1 ? 1 : year; }
    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month < 1 || month > 12 ? 1 : month; }
    public int getDay() { return day; }
    public void setDay(int day) { 
        if ((day < 1 || day > 31) || (month == 2 && day > 28)) {
            this.day = 1;
        } else {
            this.day = day;
        }
    }

    public String dateToString() {
        return "%04d-%02d-%02d".formatted(year, month, day);
    }
}