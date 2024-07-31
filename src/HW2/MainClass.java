package HW2;
import java.io.FileWriter;
import java.io.IOException;
public class MainClass {
    public static void main(String[] args) {
        MyDate[] dates = {
                new MyDate(10, 8, 2020),
                new Holidays("New Year", 2025, 1, 1),
                new MyDate(20, 5, 2021),
                new Holidays("Christmas", 2020, 12, 25),
                new MyDate(20, 3, 2023),
                new Holidays("Labor Day", 2023, 5, 1)
        };
        System.out.println("Sorted dates from oldest to newest:{");

        MyDate.sort(dates);
        for (MyDate date : dates) {
            System.out.println(date.toString());
        }
        System.out.println("}");

        try (FileWriter writer = new FileWriter("sorted_dates.txt")) {
            for (MyDate date : dates) {
                writer.write(date.toString() + "\n");
            }
            System.out.println("Dates have been written to sorted_dates.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


        Holidays holiday1 = new Holidays("Eid Al-Adha", 2024, 6, 16);
        Holidays holiday2 = new Holidays("Mother's Day", 2023, 5, 12);
        System.out.println(holiday1.sameMonth(holiday2));
    }
}
