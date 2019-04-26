import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoomOne extends Room{

	static int roomNumber = 1;
//	Date date;
	 
	public RoomOne(double rate, boolean vacant){
		super(rate, vacant);
	}
	
		
	public RoomOne(){
		super();
	}
	
//	public void createDate(int mon, int date, int)
	
	
	public static void main(String[] args) {

		String day = "04/02/2017";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date;
		try {
			date = sdf.parse(day);
			long milli = date.getTime();
			System.out.println("Milliseconds = " + milli);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
