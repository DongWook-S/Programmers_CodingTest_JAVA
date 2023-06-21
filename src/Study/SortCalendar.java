package Study;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SortCalendar {
    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2022, Calendar.NOVEMBER, 1),  // 2022년 11월 01일
                new GregorianCalendar(1963, Calendar.OCTOBER, 18),  // 1963년 10월 18일
                new GregorianCalendar(1985, Calendar.APRIL, 5),     // 1985년 04월 05일
        };

        Arrays.sort(x);

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%04d년 %02d월 %02d일\n", x[i].get(Calendar.YEAR), x[i].get(Calendar.MONTH), x[i].get(Calendar.DATE));
        }
    }
}
