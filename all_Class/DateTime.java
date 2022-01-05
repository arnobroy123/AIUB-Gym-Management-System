package all_Class;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

public class DateTime {
	public DateTime()
	{
		
	}
	
	public String dateTime()
	{
		
    LocalDateTime localDate = LocalDateTime.now();
    DateTimeFormatter localFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");

    String datetime = localDate.format(localFormat);
	return datetime;
	}
}
