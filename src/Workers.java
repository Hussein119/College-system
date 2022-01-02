public class Workers extends Instructors {
    private String jobDescription;
    private static int noWorkers = 0;
    
    //Constructors...
    
    // defulte Constructor 
    
    public Workers () {
    	 jobDescription=null;
    	 noWorkers++;
    }
    //Parametrized Constructor...
    
    public Workers(String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
    		int year, int month, int day,
    		float salary, int noWorkingHours, int noRoom, String degree, int yearlyVacations, String graduatedUniversity,String jobDescripition, String jobDescription) {
    	super(firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day,
				salary, noWorkingHours, noRoom, degree, yearlyVacations, graduatedUniversity);
    	
        this.jobDescription=jobDescription;
        noWorkers++;
    }
    //Methods (getter & setter)...

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Workers_Tech{" + "jobDescription=" + jobDescription + '}';
    } 
    @Override
    public float getSalary() {
		return (super.getNoWorkingHours())*1000;
	}
    public int getNoWorkers() {
    	return noWorkers;
    }
}
