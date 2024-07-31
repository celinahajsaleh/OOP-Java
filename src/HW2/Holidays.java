
package HW2;
public class Holidays extends MyDate {
    public String holidayName;
    public String getHolidayName() {
        return holidayName;
    }
    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }
    public Holidays() {
    }
    public Holidays(String holidayName, int year, int month, int day) {
        super(day, month, year);
        this.holidayName = holidayName;
    }

    @Override
    public String toString() {
        return "Holidays{" +
                "holidayName='" + holidayName + '\'' +
                "} " + super.toString();
    }
public boolean sameMonth(Holidays holiday) {
    return getMonth() == holiday.getMonth();
}
}



