import java.util.*;
public class Edittechnician {

	static ArrayList<Technicians> listofTechnicians = new  ArrayList<Technicians>();
	static Scanner input = new Scanner(System.in);
	
	static void addTechnician() {
		Technicians technicianObject = new Technicians();
		 System.out.println("Please enter technician first name");
		 String firstName = input.next();
		 technicianObject.setFirstName(firstName);
		 System.out.println("Please enter technician last name");
		 String lastName = input.next();
		 technicianObject.setLastName(lastName);
		 System.out.println("Please enter technician national ID");
		 try {
			 String nationalID = input.next();
			 technicianObject.setNationalID(nationalID);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid National ID must be equal 14 numbers , please enter it again ");
			 String nationalID = input.next();
			 technicianObject.setNationalID(nationalID);
		 }
		 System.out.println("Please enter technician birth year");
		 int year =input.nextInt();
		 System.out.println("Please enter technician birth month");
		 int month =input.nextInt();
		 System.out.println("Please enter technician birth day");
		 int day =input.nextInt();
		 technicianObject.setDateOfBirth(year, month, day);
		 System.out.println("Please enter technician age");
		 int age = input.nextInt();
		 technicianObject.setAge(age);
		 System.out.println("Please enter technician gender  \" male or female \" ");
		 try {
			 String gender = input.next();
			 technicianObject.setGender(gender);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Please enter a valid value");	 
	       }   
		 System.out.println("Please enter technician PhoneNumber");
		 try{
		 String phoneNumber = input.next();
		 technicianObject.setPhoneNumber(phoneNumber);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
	       }
		 System.out.println("Please enter technician Address");
		 String address = input.next();
		 technicianObject.setAddress(address);
		 System.out.println("Please enter number of working hours per day");
		 int noWorkingHours = input.nextInt();
		 technicianObject.setNoWorkingHours(noWorkingHours);
		 System.out.println("Please enter number of Labs for technician");
		 int nolabs = input.nextInt();
		 technicianObject.setNolabs(nolabs);
		 listofTechnicians.add(technicianObject);
		 System.out.println("Technician added");
	}	
	
	
static void deleteTechnician() {
		
		System.out.println("Please enter the National ID number of The Technician you want to delete");
		String IDNumber = input.next(); 
		for(int i=0;i<listofTechnicians.size();i++)
		{
			if(listofTechnicians.get(i).getNationalID().equals(IDNumber))
			{
				listofTechnicians.remove(i);
				System.out.println("Technician deleted");
				break;
			}
				
			else
			{
				System.out.println("This value is not valid ");
				break;
			}
		}
	}		
	
	
static void displayTechnicianInformation() {
	
	System.out.println("Please enter the National ID number of The Technician you want to display his information ");
	String nationalID = input.next();
	boolean test=false;
	int testCounter=0;
	int size = listofTechnicians.size() ;
	for(int i=0;i<size;i++)
	{
		if(listofTechnicians.get(i).getNationalID().equals(nationalID))
		{
			test=true;
			System. out.println("Technician name:\t" +listofTechnicians.get(i).getFirstName() + listofTechnicians.get(i).getLastName());
			System. out.println("Technician national ID:\t" + listofTechnicians.get(i).getNationalID());
			System. out.println("Technician Date Of Birth:\t" + listofTechnicians.get(i).getDateOfBirth());
			System. out.println("Technician age:\t" + listofTechnicians.get(i).getAge());
			System. out.println("Technician PhoneNumber:\t" + listofTechnicians.get(i).getPhoneNumber());
			System. out.println("Technician Address:\t" + listofTechnicians.get(i).getAddress());
			System. out.println("Technician gender:\t" + listofTechnicians.get(i).getGender());
			System. out.println("Technician salary:\t" +listofTechnicians.get(i).getSalary());
			System. out.println("Number of yearly vacations:\t" + listofTechnicians.get(i).getYearlyVacations());
			System. out.println("Number of all Labs for Technician is:\t" + listofTechnicians.get(i).getNolabs());
			System. out.println("Number of all Technicians is:\t" + listofTechnicians.get(i).getNoTechnicians());
		}
		else
			System.out.println("This value is not valid Please enter a valid value");
		testCounter++;
		if(test==true)
			break;
	}
	if(testCounter==0)
		System.out.println("This Technician has been deleted");	
}

} // end class	

