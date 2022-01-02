public class Teachingassistants extends Instructors {
	
	// Define variables   
	private String bachalorUniversity ;
	private String masterSubject;
	private String masterUniversity;
	private static int noTeachingassistants = 0;
	
	//Default Constructor
	
	public Teachingassistants () {
		bachalorUniversity=null;
		masterSubject=null;
		masterUniversity=null;
		noTeachingassistants++;
	}
	
	//Parametrized Constructor...
	
	public Teachingassistants (String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
    		int year, int month, int day,
    		float salary, int noWorkingHours, int noRoom, String degree, int yearlyVacations, String graduatedUniversity,
    		String bachalorUniversity,String masterSubject,String masterUniversity) {
		super(firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day,
				salary, noWorkingHours, noRoom,degree, yearlyVacations, graduatedUniversity);
		
		this.bachalorUniversity=bachalorUniversity;
		this.masterSubject=masterSubject;
		this.masterUniversity=masterUniversity;
		noTeachingassistants++;

	}
	
	//Methods (getter & setter)...
	
		// setters
	
	public void setBachalorUniversity(String bachalorUniversity) {
		this.bachalorUniversity=bachalorUniversity;
	}
	public void setMasterSubject(String masterSubject ) {
		this.masterSubject=masterSubject;
	}
	public void setMasterUniversity(String masterUniversity) {
		this.masterUniversity=masterUniversity;
	}
	
	// getters 
	
	public String getBachalorUniversity(){
		return bachalorUniversity;
	}
	public String getMasterSubject() {
		return masterSubject;
	}
	public String getMasterUniversity() {
		return masterUniversity;
	}
	@Override
    public float getSalary() {
		return (super.getNoWorkingHours())*2000;
	}
	public int getnoTeachingassistants() {
		return noTeachingassistants++;
	}

}
