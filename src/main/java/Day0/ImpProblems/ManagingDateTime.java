package Day0.ImpProblems;

import org.joda.time.DateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ManagingDateTime {
    public static void main(String[] args) {
        DateTime curTime = new DateTime();
        System.out.println("Current time:" + curTime);
        LocalDateTime curTimeUTC = LocalDateTime.ofInstant(Instant.ofEpochMilli(curTime.toInstant().getMillis()), ZoneOffset.UTC);
        LocalDateTime curTimeIST = LocalDateTime.ofInstant(Instant.ofEpochMilli(curTime.toInstant().getMillis()), ZoneOffset.systemDefault());
        System.out.println("Current time in UTC:" + curTimeUTC);
        System.out.println("Current time in IST:" + curTimeIST);
    }
}
