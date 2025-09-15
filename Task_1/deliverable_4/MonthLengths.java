import java.time.Year;
import java.time.Month;

public class MonthLengths {
    public static void main(String[] args) {
        int year = 2025;
        Year y = Year.of(year);

        System.out.println("Month lengths in " + year + ":");
        for (Month month : Month.values()) {
            int length = month.length(y.isLeap());
            System.out.println(month + " -> " + length + " days");
        }
    }
}
