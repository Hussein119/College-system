
public class Technicians extends Instructors  {
    //Data members...
    private int Nolabs;
    private static int noTechnicians = 0;
    
    //Default Constructor...
    
    public Technicians(){     
    	Nolabs=0;
    	noTechnicians++;
    }
    
     //Constructors...
    //Parametrized Constructor...
    
    public Technicians (String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
			int year, int month, int day,
			float salary, int noWorkingHours, int noRoom, String degree, int yearlyVacations, String graduatedUniversity,int Nolabs){
    	super(firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day,
				salary, noWorkingHours, noRoom, degree, yearlyVacations, graduatedUniversity);
        if(Nolabs>=0){
        this.Nolabs=Nolabs;
        }
        noTechnicians++;
    }
     //Methods (getter & setter)...

    public int getNolabs() {
        return Nolabs;
    }
    @Override
    public float getSalary() {
		return (super.getNoWorkingHours())*1500;
	}

    public void setNolabs(int Nolabs) {
        if(Nolabs>=0){
        this.Nolabs = Nolabs;
        }
    }
    public int getNoTechnicians() {
    	return noTechnicians;
    }

    
    
}
