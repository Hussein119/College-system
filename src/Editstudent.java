import java.util.*;
public class Editstudent {
	static ArrayList<Student> listofStudents = new  ArrayList<Student>();
	static Scanner input = new Scanner(System.in);
	
	static void addStudent() {
		 Student studentObject = new Student();
		 System.out.println("Please enter student first name");
		 String firstName = input.next();
		 studentObject.setFirstName(firstName);
		 System.out.println("Please enter student last name");
		 String lastName = input.next();
		 studentObject.setLastName(lastName);
		 System.out.println("Please enter student national ID");
		 try {
			 String nationalID = input.next();
			 studentObject.setNationalID(nationalID);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid National ID must be equal 14 numbers , please enter it again ");
			 String nationalID = input.next();
			 studentObject.setNationalID(nationalID);
		 }
		 System.out.println("Please enter student birth year");
		 int year =input.nextInt();
		 System.out.println("Please enter student birth month");
		 int month =input.nextInt();
		 System.out.println("Please enter student birth day");
		 int day =input.nextInt();
		 studentObject.setDateOfBirth(year, month, day);
		 System.out.println("Please enter student age");
		 int age = input.nextInt();
		 studentObject.setAge(age);
		 System.out.println("Please enter student gender  \" male or female \" ");
		 try {
			 String gender = input.next();
		     studentObject.setGender(gender);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Please enter a valid value");	 
	       }   
		 System.out.println("Please enter student semester  \" fall , spring , summer \"  " );
		 try {
			 String semester = input.next();
			 studentObject.setSemester(semester);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
	       }
		 System.out.println("Please enter student Academic mail");
		try{
		 String academicMail = input.next();
		 studentObject.setAcademicMail(academicMail);
		}
		 catch(IllegalArgumentException e ) {
			 System.out.println("Academic Mail is not correct ");
		 }
		 System.out.println("Please enter student PhoneNumber");
		 try{
			 String PhoneNumber = input.next();
		     studentObject.setPhoneNumber(PhoneNumber);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
	       }
		 System.out.println("Please enter student Address");
		 String address = input.next();
		 studentObject.setAddress(address);
		 System.out.println("Please enter student Academic number ");
		 try{
		 String academicNumber = input.next();
		 studentObject.setAcademicNumber(academicNumber);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("Academic Number is not correct , please enter it again ");
			 String academicNumber = input.next();
			 studentObject.setAcademicNumber(academicNumber);
		 }
		 System.out.println("Please enter student Level ");
		 int level = input.nextInt();
		 studentObject.setLevel(level);
		 if(level<3)
			 studentObject.setDepartment("General");
		 else
		 {
			 System.out.println("Please enter student department ");
			 String department = input.next();
			 studentObject.setDepartment(department);
		 }
		 System.out.println("Please enter student GPA ");
		 try {
			 float gpa = input.nextFloat();
			 studentObject.setGPA(gpa);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
	       }
		 System.out.println("Enter student group number");
	     int NoGroup = input.nextInt();
	     studentObject.setNoGroup(NoGroup);
		 System.out.println("Please enter student section number ");
		 int  noSection =input.nextInt();
		 studentObject.setNoSection(noSection);
		 listofStudents.add(studentObject);
		 System.out.println("Student added");
	 }
	
	static void deleteStudent() {

		
		System.out.println("Please enter the academic number of the student you want to delete");
		String academicNumber = input.next(); 
		int listofStudentssize = listofStudents.size();
		for(int i=0;i<listofStudentssize;i++)
		{
			if(listofStudents.get(i).getAcademicNumber().equals(academicNumber))
			{
				listofStudents.remove(i);
				System.out.println("Student deleted");
				break;
			}
				
			else
			{
				System.out.println("This value is not valid ");
				break;
			}
		}	
	}
	static void displayStudentInformation() {
		
		System.out.println("Please enter the academic number of the student you want to display his information ");
		String academicNumber = input.next();
		boolean test=false;
		int testCounter=0;
		int size = listofStudents.size() ;
		for(int i=0;i<size;i++)
		{
			if(listofStudents.get(i).getAcademicNumber().equals(academicNumber))
			{
				test=true;
				System. out.println("Student name:\t" + listofStudents.get(i).getFirstName() + listofStudents.get(i).getLastName());
				System. out.println("Student national ID:\t" + listofStudents.get(i).getNationalID());
				System. out.println("Student Date Of Birth:\t" + listofStudents.get(i).getDateOfBirth());
				System. out.println("Student age:\t" + listofStudents.get(i).getAge());
				System. out.println("Student gender:\t" + listofStudents.get(i).getGender());
				System. out.println("Student semester:\t" + listofStudents.get(i).getSemester());
				System. out.println("Student Academic mail:\t" + listofStudents.get(i).getAcademicMail());
				System. out.println("Student PhoneNumber:\t" + listofStudents.get(i).getPhoneNumber());
				System. out.println("Student Address:\t" + listofStudents.get(i).getAddress());
				System. out.println("Student Academic number:\t" + listofStudents.get(i).getAcademicNumber());
				System. out.println("Student Level:\t" + listofStudents.get(i).getLevel());
				System. out.println("Student department:\t" + listofStudents.get(i).getDepartment());
				System. out.println("Student GPA:\t" + listofStudents.get(i).getGPA());
				System. out.println("Student group number:\t" + listofStudents.get(i).getNoGroup());
				System. out.println("Student section number:\t" + listofStudents.get(i).getNoSection());
				System. out.println("Number of all students is:\t" + listofStudents.get(i).getNoStudents());
			}	
			else
				System.out.println("This value is not valid");
			testCounter++;
			if(test==true)
				break;
		}
		if(testCounter==0)
		{
			System.out.println("This studend has been deleted");
			 Student.decrNoStudents();
		}
			
		
		
		
	}
	
} // end class 
