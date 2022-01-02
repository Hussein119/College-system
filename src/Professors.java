public class Professors  extends Instructors{
	
	// Define variables  
	private String bachalorUniversity ;
	private String phdSubject;
	private String phdUniversity;
	private String masterSubject;
	private String masterUniversity;
	private static int noProfessors = 0;
	
	//Default Constructor
	public Professors() {
		bachalorUniversity = null;
		phdSubject = null;
	    phdUniversity = null;
		masterSubject = null;
		masterUniversity = null;
		noProfessors++;
	}
	
	//Parametrized Constructor...
	public Professors (String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
    		int year, int month, int day,
    		float salary, int noWorkingHours, int noRoom, String degree, int yearlyVacations, String graduatedUniversity,
    		String bachalorUniversity,String phdSubject,String phdUniversity,String masterSubject,String masterUniversity) {
		super(firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day,
				salary, noWorkingHours, noRoom,degree, yearlyVacations, graduatedUniversity);
		
		this.bachalorUniversity=bachalorUniversity;
		this.phdSubject=phdSubject;
		this.phdUniversity=phdUniversity;
		this.masterSubject=masterSubject;
		this.masterUniversity=masterUniversity;
		noProfessors++;
	}
	
	//Methods (getter & setter)...
	
	// setters 

	public void setBachalorUniversity( String bachalorUniversity) {
		this.bachalorUniversity=bachalorUniversity;
	}
	public void setPhdSubject(String phdSubject) {
		this.phdSubject=phdSubject;
	}
	public void setPhdUniversity(String phdUniversity) {
		this.phdUniversity=phdUniversity;
	}
	public void setMasterSubject(String masterSubject) {
		this.masterSubject=masterSubject;
	}
	public void setMasterUniversity(String masterUniversity) {
		this.masterUniversity=masterUniversity;
	}
	
	// getters 
	
	public String getBachalorUniversity() {
        return bachalorUniversity;
    }

    public String getPhdSubject() {
        return phdSubject;
    }

    public String getPhdUniversity() {
        return phdUniversity;
    }

    public String getMasterSubject() {
        return masterSubject;
    }

    public String getMasterUniversity() {
        return masterUniversity;
    }
    @Override
    public float getSalary() {
    	return (super.getNoWorkingHours())*2250;
    }
    public int getNoProfessors() {
    	return noProfessors;
    }
    
}
