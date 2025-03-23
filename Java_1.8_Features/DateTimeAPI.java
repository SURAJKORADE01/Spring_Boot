import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeAPI 
{
    public static void main(String arg[])
    {
        // Date dobj = new Date();
        // System.out.println(dobj);

        // LocalDate date = LocalDate.now();
        // System.out.println(date);

        // date = LocalDate.of(2005, Month.FEBRUARY, 29);
        // System.out.println(date);

        // LocalTime time = LocalTime.now();
        // System.out.println(time);

        // LocalTime time = LocalTime.now(ZoneId.of("GMT"));
        // System.out.println(time);

        // for(String str : ZoneId.getAvailableZoneIds())
        // {
        //     System.out.println(str);
        // }
        
        // Time for machine readable time
        Instant ist = Instant.now();
        System.out.println(ist);
        
        // Human Readble Time
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }    
}
