import java.util.*;
public class Editteachingassistant {
	static ArrayList<Teachingassistants> listofTeachingassistants = new  ArrayList<Teachingassistants>();
	static Scanner input = new Scanner(System.in);
	
	static void addTeachingassistant() {

		Teachingassistants teachingassistantObject = new Teachingassistants();
		 System.out.println("Please enter teachingassistant first name");
		 String firstName = input.next();
		 teachingassistantObject.setFirstName(firstName);
		 System.out.println("Please enter teachingassistant last name");
		 String lastName = input.next();
		 teachingassistantObject.setLastName(lastName);
		 System.out.println("Please enter teachingassistant national ID");
		 try {
			 String nationalID = input.next();
			 teachingassistantObject.setNationalID(nationalID);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid National ID must be equal 14 numbers , please enter it again ");
			 String nationalID = input.next();
			 teachingassistantObject.setNationalID(nationalID);
		 }
		 System.out.println("Please enter teachingassistant birth year");
		 int year =input.nextInt();
		 System.out.println("Please enter teachingassistant birth month");
		 int month =input.nextInt();
		 System.out.println("Please enter teachingassistant birth day");
		 int day =input.nextInt();
		 teachingassistantObject.setDateOfBirth(year, month, day);
		 System.out.println("Please enter teachingassistant age");
		 int age = input.nextInt();
		 teachingassistantObject.setAge(age);
		 System.out.println("Please enter teachingassistant gender  \" male or female \" ");
		 try {
			 String gender = input.next();
			 teachingassistantObject.setGender(gender);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Please enter a valid value");	 
	       }   
		 System.out.println("Please enter teachingassistant PhoneNumber");
		 try{
			 String phoneNumber = input.next();
			 teachingassistantObject.setPhoneNumber(phoneNumber);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
		 }
		 
		 System.out.println("Please enter teachingassistant Address");
		 String address = input.next();
		 teachingassistantObject.setAddress(address);
		 System.out.println("Please enter number of working hours per day");
		 int noWorkingHours = input.nextInt();
		 teachingassistantObject.setNoWorkingHours(noWorkingHours);
		 System.out.println("Please enter  teachingassistant bachalorUniversity");
		 String bachalorUniversity = input.next();
		 teachingassistantObject.setBachalorUniversity(bachalorUniversity);
		 System.out.println("Please enter  teachingassistant masterSubject ");
		 String masterSubject = input.next();
		 teachingassistantObject.setMasterSubject(masterSubject);
		 System.out.println("Please enter  teachingassistant masterUniversity ");
		 String masterUniversity = input.next();
		 teachingassistantObject.setMasterUniversity(masterUniversity);
		 listofTeachingassistants.add( teachingassistantObject);
		 System.out.println("Teachingassistant added");
	}
    static void deleteTeachingassistant() {
		
		System.out.println("Please enter the National ID number of The Teachingassistant you want to delete");
		String IDNumber = input.next(); 
		for(int i=0;i<listofTeachingassistants.size();i++)
		{
			if( listofTeachingassistants.get(i).getNationalID().equals(IDNumber))
			{
				listofTeachingassistants.remove(i);
				System.out.println("Teachingassistant deleted");
				break;
			}
				
			else
			{
				System.out.println("This value is not valid ");
				break;
			}
		}
	}	
    static void displayTeachingassistantInformation() {
	
	System.out.println("Please enter the National ID number of The Teachingassistant you want to display his information ");
	String nationalID = input.next();
	boolean test=false;
	int testCounter=0;
	int size = listofTeachingassistants.size() ;
	for(int i=0;i<size;i++)
	{
		if(listofTeachingassistants.get(i).getNationalID().equals(nationalID))
		{
			test=true;
			System. out.println("Teachingassistant name:\t" +listofTeachingassistants.get(i).getFirstName() + listofTeachingassistants.get(i).getLastName());
			System. out.println("Teachingassistant national ID:\t" + listofTeachingassistants.get(i).getNationalID());
			System. out.println("Teachingassistant Date Of Birth:\t" + listofTeachingassistants.get(i).getDateOfBirth());
			System. out.println("Teachingassistant age:\t" + listofTeachingassistants.get(i).getAge());
			System. out.println("Teachingassistant PhoneNumber:\t" + listofTeachingassistants.get(i).getPhoneNumber());
			System. out.println("Teachingassistant Address:\t" + listofTeachingassistants.get(i).getAddress());
			System. out.println("Teachingassistant gender:\t" + listofTeachingassistants.get(i).getGender());
			System. out.println("Teachingassistant salary:\t" +listofTeachingassistants.get(i).getSalary());
			System. out.println("Number of yearly vacations:\t" + listofTeachingassistants.get(i).getYearlyVacations());
			System. out.println("Teachingassistant bachalorUniversity:\t" + listofTeachingassistants.get(i).getBachalorUniversity());
			System. out.println("Teachingassistant masterSubject:\t" + listofTeachingassistants.get(i).getMasterSubject());
			System. out.println("Teachingassistant masterUniversity:\t" + listofTeachingassistants.get(i).getMasterUniversity());
			System. out.println("Number of all Teachingassistants is:\t" + listofTeachingassistants.get(i).getnoTeachingassistants());
		}
		else
			System.out.println("This value is not valid Please enter a valid value");
		testCounter++;
		if(test==true)
			break;
	}
	if(testCounter==0)
		System.out.println("This Teachingassistant has been deleted");
	
	
	
}

} // end class	


