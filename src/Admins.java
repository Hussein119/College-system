public class Admins extends Instructors {
	
	// Define variables  
	private String Position ;
	private static int noAdmins = 0;
	
	//Default Constructor 
	
	public Admins() {
		Position=null;
		noAdmins++;
	}
	public Admins (String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
			int year, int month, int day,
			float salary, int noWorkingHours, int noRoom, String degree, int yearlyVacations, String graduatedUniversity,String Position)
	{
		super(firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day,
				salary, noWorkingHours, noRoom, degree, yearlyVacations, graduatedUniversity);
		this.Position=Position;
		noAdmins++;
	}
	
	//Methods (getter & setter)...
	
	// setters
	public void setposition(String Position) {
		this.Position=Position;
	}
	
	// getters 
	public String getposition() {
		return Position;
	}
	@Override
    public float getSalary() {
		return (super.getNoWorkingHours())*2500;
	}
	public int getNoAdmins() {
		return noAdmins;
	}
	

}
