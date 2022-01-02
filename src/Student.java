public class Student extends People {
    // Data Types
    private String academicMail;
    private String academicNumber;
    private int Level;
    private float GPA;
    private int noGroup;
    private int noSection;
    private String Semester;
    private String Department;
    private static int noStudents = 0;
    //Default Constructor

    public Student() {
        academicMail =null;
        academicNumber = null;
        Level = 0;
        GPA = 0;
        Semester = null;
        noGroup = 0;
        Department = null;
        noSection = 0;
        noStudents++;
    }

    //Parameterized Constructor

    public Student(String firstName, String lastName, String address, String gender, String email, int age, String phoneNumber, String nationalID,
    		int year, int month, int day,
    		String academicMail,String academicNumber, int level, float GPA, String semester, String department, int noGroup, int noSection) {
    	super( firstName , lastName , address , gender , email , age, phoneNumber , nationalID , year , month, day);
        this.academicMail = academicMail;
        this.Semester = semester;
        this.Department = department;
        if (noGroup <= 0)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.noGroup = noGroup;
        if (noSection <= 0)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.noSection = noSection;
        int academicNumbersize = academicNumber.length() ;
        for(int i=0 ; i<academicNumbersize ; i++)
        {
        	if(academicNumber.charAt(i)<'0' || academicNumber.charAt(i)>'9' )
                throw new IllegalArgumentException("This value is not valid Please enter a valid value");
            this.academicNumber = academicNumber;
        }
        
        if (Level <= 0)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.Level = level;
        if (GPA <= 0 && GPA >= 4)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.GPA = GPA;
        
        noStudents++;

    }

    //Setter and Getter

    public String getAcademicMail() {
        return academicMail;
    }

    public void setAcademicMail(String academicMail) {
    	if(!(academicMail.contains("@")))
    		throw new IllegalArgumentException("This value is not valid Please enter a valid value"); 
        this.academicMail = academicMail;
    }

    public String getAcademicNumber() {
        return academicNumber;
    }

    public void setAcademicNumber(String academicNumber) {
    	int academicNumbersize = academicNumber.length();
        for(int i=0 ; i< academicNumbersize ; i++)
        {
        	if(academicNumber.charAt(i)<'0' || academicNumber.charAt(i)>'9' )
        		 throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        }
           
        this.academicNumber = academicNumber;

    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        if (Level <= 0 && Level >4)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.Level = level;

    }
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        if (GPA < 0 || GPA > 4)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.GPA = GPA;

    }

    public int getNoGroup() {
        return noGroup;
    }

    public void setNoGroup(int noGroup) {
        if (noGroup <= 0)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.noGroup = noGroup;
    }

    public int getNoSection() {
        return noSection;
    }

    public void setNoSection(int noSection) {
        if (noSection <= 0)
            throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.noSection = noSection;

    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
    	Semester.toLowerCase();
    	if(!(Semester.equalsIgnoreCase("fall") || Semester.equalsIgnoreCase("spring") ||Semester.equalsIgnoreCase("summer")))
    	throw new IllegalArgumentException("This value is not valid Please enter a valid value");
        this.Semester = Semester;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    public int getNoStudents() {
    	return noStudents;
    }
    public static int decrNoStudents() {
    	return noStudents - 1 ;
    }


}


