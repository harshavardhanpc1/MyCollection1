import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

/**
 * Created by intelliswift on 5/21/18.
 */
public class EpochToCronExpression {
    public static void main(String[]args){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        LocalDateTime dateTime = LocalDateTime.now().plusMinutes(5);
      //LocalDate localDate = LocalDate.now(ZoneId.of("GMT"));
       System.out.println(dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
       System.out.println(System.currentTimeMillis());
        System.out.println(toCron(String.valueOf(dateTime.getSecond()),
                String.valueOf(dateTime.getMinute()),
                String.valueOf(dateTime.getHour()),
                String.valueOf(dateTime.getDayOfMonth()),
                String.valueOf(dateTime.getMonthValue()),
                "?", String.valueOf(dateTime.getYear())));

//        Calendar cal = Calendar.getInstance();
//        // You cannot use Date class to extract individual Date fields
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);      // 0 to 11
//        int day = cal.get(Calendar.DAY_OF_MONTH);
//        int hour = cal.get(Calendar.HOUR_OF_DAY);
//        int dayof = cal.get(Calendar.DAY_OF_WEEK);
//        int minute = cal.get(Calendar.MINUTE);
//        int second = cal.get(Calendar.SECOND);
//        System.out.println(year+" "+month+" "+" "+dayof+" "+hour+" "+minute+" "+second);
    }


    public static String toCron(final String sec,final String mins, final String hrs, final String dayOfMonth, final String month, final String dayOfWeek, final String year) {
        return String.format("%s %s %s %s %s %s %s",sec, mins, hrs, dayOfMonth, month, dayOfWeek, year);
    }
}
