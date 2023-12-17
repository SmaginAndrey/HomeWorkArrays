package Task1.getDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatesRange {
    public static String[] getDate(LocalDate startDate, LocalDate endDate) {
        long cnt = ChronoUnit.DAYS.between(startDate, endDate) + 1;
        String[] localDates = new String[(int)cnt];
        for (int i = 0; i < cnt; i++) {
            localDates[i] = startDate.toString();
            startDate = startDate.plusDays(1);
        }
        return localDates;
    }
}
