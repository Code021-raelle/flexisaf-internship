import java.time.LocalDate;
import java.time.DayOfWeek;

public class FridayThe13th {
    public static void main(String[] args) {
        // Example test date
        LocalDate date = LocalDate.of(2025, 6, 13);

        if (isFridayThe13th(date)) {
            System.out.println(date + " is Friday the 13th!");
        } else {
            System.out.println(date + " is not Friday the 13th.");
        }
    }

    public static boolean isFridayThe13th(LocalDate date) {
        return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
