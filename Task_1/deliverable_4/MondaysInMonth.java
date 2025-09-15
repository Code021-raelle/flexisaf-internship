import java.time.*;

public class MondaysInMonth {
    public static void main(String[] args) {
        int month = 9; // September
        YearMonth yearMonth = YearMonth.of(Year.now().getValue(), month);

        System.out.println("Mondays in " + yearMonth.getMonth() + " " + yearMonth.getYear() + ":");

        LocalDate date = yearMonth.atDay(1);
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}
