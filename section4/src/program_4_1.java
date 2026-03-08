import java.time.DayOfWeek;
import java.time.LocalDate;

public class program_4_1 {
    public static void main(String[] args) {
        drawCalendar();
        int const1 =0;
    }


    public static void drawCalendar() {
        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();
        int today = now.getDayOfMonth();

        now = now.minusDays((today - 1));
        DayOfWeek weekDay = now.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("周一 周二 周三 周日 周五 周六 周日");
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }

        while (now.getMonthValue() == month) {
            System.out.printf("%3d", now.getDayOfMonth());
            if (now.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            now = now.plusDays(1);
            if (now.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (now.getDayOfWeek().getValue() != 1) System.out.println();
    }

}
