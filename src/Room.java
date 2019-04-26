
public abstract class Room {

	protected static int roomNumber;	
	protected double dailyRate;
	protected Boolean vacantStatus;	
	
	
	public Room(double rate, boolean vacant){
		dailyRate = rate;
		vacantStatus = vacant;
	}
	
	protected Room(){
		dailyRate = 0;
		vacantStatus = true;
	}
	
	
	
	
	protected int getRoomNumber(){
		return roomNumber;
	}
	
	protected double getDailyRate(){
		return dailyRate;
	}
	
	protected void setDailyRate(double rate){
		dailyRate = rate;
	}
	
	protected Boolean isRoomVacant(){
		return vacantStatus;
	}
	
	protected void setVacancyStatus(Boolean vacant){
		vacantStatus = vacant;
	}
}
