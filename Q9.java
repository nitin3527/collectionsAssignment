import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q9 {
    public static void main(String[] args) {
        Date d = new Date();
        Locale list[] = DateFormat.getAvailableLocales();
        for (Locale aLocale : list) {
            System.out.println(DateFormat.getDateInstance(DateFormat.FULL,aLocale).format(d));
        }
    }
}
