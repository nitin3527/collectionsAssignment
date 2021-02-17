import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Q8 {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int day = localDate.getDayOfMonth();
        Month month = Month.from(LocalDate.now());
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("formatted date is: " + day + "-" + month.name() + "-" + year );
    }
}
