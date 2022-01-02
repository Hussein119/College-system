public abstract class Instructors extends People {
    
    //Data Members...
    
    private int noWorkingHours;
    private int noRoom;
    private String degree;
    private int yearlyVacations;
    private String graduatedUniversity;
    
    //Constructors...
    
    // defult constructor 
    public Instructors () {
    }
    //Parametrized Constructor...

    public Instructors(String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
    		int year, int month, int day,
    		float salary, int noWorkingHours, int noRoom, String degree, int yearlyVacations, String graduatedUniversity)	
    {
    	super( firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day);
        if(noWorkingHours <= 0)
        {
            throw new IllegalArgumentException("Number of Working hours must be > 0");
        }
        this.noWorkingHours = noWorkingHours;
        if(noRoom < 0)
        {
            throw new IllegalArgumentException("Number of Room must be >= 0");
        }
        this.noRoom = noRoom;
        this.degree = degree;
        if(yearlyVacations < 0)
        {
            throw new IllegalArgumentException("Yearly vacations must be >= 0");
        }
        this.yearlyVacations = yearlyVacations;
        this.graduatedUniversity = graduatedUniversity;
    }
    
    //Methods (getter & setter)...

    public abstract float getSalary();

    public int getNoWorkingHours() {
        return noWorkingHours;
    }

    public void setNoWorkingHours(int noWorkingHours) {
        if(noWorkingHours <= 0)
        {
            throw new IllegalArgumentException("Number of Working hours must be > 0");
        }
        this.noWorkingHours = noWorkingHours;
    }

    public int getNoRoom() {
        return noRoom;
    }

    public void setNoRoom(int noRoom) {
       if(noRoom < 0)
        {
            throw new IllegalArgumentException("Number of Room must be >= 0");
        }
        this.noRoom = noRoom;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public int getYearlyVacations() {
        return yearlyVacations;
    }

    public void setYearlyVacations(int yearlyVacations) {
        if(yearlyVacations < 0)
        {
            throw new IllegalArgumentException("Yearly vacations must be >= 0");
        }
        this.yearlyVacations = yearlyVacations;
    }

    public String getGraduatedUniversity() {
        return graduatedUniversity;
    }

    public void setGraduatedUniversity(String graduatedUniversity) {
        this.graduatedUniversity = graduatedUniversity;
    }
}