import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String inputString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);
        System.out.println("OffsetDateTime: " + offsetDateTime);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy HH:mm:ss O");
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy HH:mm:ss O");
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm O");

        String formattedFull = offsetDateTime.format(fullFormatter);
        String formattedMedium = offsetDateTime.format(mediumFormatter);
        String formattedShort = offsetDateTime.format(shortFormatter);

        System.out.println("FULL: " + formattedFull);
        System.out.println("MEDIUM: " + formattedMedium);
        System.out.println("SHORT: " + formattedShort);

    }
}