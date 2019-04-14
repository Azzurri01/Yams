package local.acids.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Misc {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static String getTodaysDate() {
        Date now = new Date();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String mysqlDateString = formatter.format(now);
        return mysqlDateString;
    }
}
