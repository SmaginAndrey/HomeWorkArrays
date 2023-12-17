package Task1.test;

import Task1.getDate.DatesRange;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

class DatesRangeTest {

    @Test
    void getDate() {
        LocalDate startDate = LocalDate.of(2023, 11, 12);
        LocalDate endDate = LocalDate.of(2023, 11, 11);
        String[] localDate = {};
        String[] result = DatesRange.getDate(startDate, endDate);
        for(int i = 0; i < localDate.length; i++){
            assertEquals(localDate[i], result[i]);
        }
        startDate = LocalDate.of(2023, 02, 28);
        endDate = LocalDate.of(2023, 02, 28);
        String[] localDateTwo = {"2023-02-28"};
        String[] resultTwo = DatesRange.getDate(startDate, endDate);
        for(int i = 0; i < localDateTwo.length; i++){
            assertEquals(localDateTwo[i], resultTwo[i]);
        }
        startDate = LocalDate.of(2020, 05, 28);
        endDate = LocalDate.of(2020, 06, 02);
        String[] localDateThree = {"2020-05-28", "2020-05-29", "2020-05-30", "2020-05-31",
                "2020-06-01", "2020-06-02"};
        String[] resultThree = DatesRange.getDate(startDate, endDate);
        for(int i = 0; i < localDateThree.length; i++){
            assertEquals(localDateThree[i], resultThree[i]);
        }
    }
}