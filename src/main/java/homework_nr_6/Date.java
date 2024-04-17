package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month > 0) {
            if (month <= 12) {
                this.month = month;
            } else {
                System.out.println("Such a month does not exist");
            }
        }
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        switch (getMonth()) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (day <= 31) {
                    this.day = day;
                }
                break;
            case 2:
                if (getYear() % 4 == 0) {
                    if (day < 29) {
                        this.day = day;
                    }
                    if (day <= 29) {
                        this.day = day;
                    }
                }
                break;
            default:
                if (day <= 30) {
                    this.day = day;
                }
        }
        
    }
    
    public void displayDate() {
        String getDate = Integer.toString(getDay()) + '.' + Integer.toString(getMonth()) + '.' + Integer.toString(getYear());
        System.out.println(getDate);
        
    }
}