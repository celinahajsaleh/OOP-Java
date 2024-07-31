
package HW2;
import java.util.*;
import java.util.Scanner;
public class MyDate {
        private int day;
        private int month;
        private int year;
        Scanner in= new Scanner(System.in);

        public MyDate() {
            this.day = 1;
            this.month = 1;
            this.year = 1970;
        }

        public MyDate(int day, int month, int year) {
            while(!(day >= 1 && day <=31 && month >= 1 && month <=12)){

                System.out.println("invalid, Enter again:");
                day=in.nextInt();
                month=in.nextInt();
                year=in.nextInt();
            }
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

        public void setDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public static void getAge(MyDate birthDate){
            int y=2024-birthDate.year;
            int m=4-birthDate.month;
            int d=7-birthDate.day;

            if(d<0){m--;d+=30;}
            if(m<0){y--;m+=12;}

            System.out.println("the age is: "+ d + "Days, " + m +"Months, " + y + "Years" );
        }

        public void printFormat(){
            String arr[] = {"January", "February", "March", "April",
                    "May", "June", "July", "August", "September",
                    "October", "November", "December"};

            System.out.println(arr[this.month - 1] + " " + this.day + ", " + this.year);
        }

        public static boolean isLeapYear(MyDate date) {
            if(date.year % 4 == 0 && date.year % 100 != 0){
                return true;
            }else
                return false;
        }
        public void addDays(int days){
            int ds = days;
            int a[]={31, 29, 31, 30, 31, 30, 31, 31, 30 , 31, 30, 31};
            // one year = 366 day

            year+=days/366;
            days%=366;
            while(days > 0){
                if(days >= (a[month-1] - day + 1)){
                    days-= a[month-1] - day + 1;
                    day = 1;
                    month++;
                    if(month==13){
                        month = 1;
                        year++;
                    }
                } else{
                    day+= days;
                    days = 0;
                }
            }
            System.out.println("the date after "+ ds + " is " + day + "/" + month + "/" + year);
        }

    public static void sort(MyDate[] dates) {
        int n = dates.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dates[j].compareTo(dates[j + 1]) > 0) {
                    // Swap dates[j] and dates[j + 1]
                    MyDate temp = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = temp;
                }
            }
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyDate date = (MyDate) obj;
        return day == date.day && month == date.month && year == date.year;
    }
    public int compareTo(MyDate date) {
        if (this.year != date.year) {
            return this.year - date.year;
        }
        if (this.month != date.month) {
            return this.month - date.month;
        }
        return this.day - date.day;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (day < 10) sb.append('0');
        sb.append(day).append('-');
        if (month < 10) sb.append('0');
        sb.append(month).append('-');
        sb.append(year);
        return sb.toString();
    }

}

