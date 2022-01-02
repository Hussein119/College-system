import java.util.*;
public class Editadmin {
	static ArrayList<Admins> listofAdmins = new  ArrayList<Admins>();
	static Scanner input = new Scanner(System.in);
	
	
	static void addAdmin() {
		Admins adminObject = new Admins();
		 System.out.println("Please enter administrator first name");
		 String firstName = input.next();
		 adminObject.setFirstName(firstName);
		 System.out.println("Please enter administrator last name");
		 String lastName = input.next();
		 adminObject.setLastName(lastName);
		 System.out.println("Please enter administrator national ID");
		 try {
			 String nationalID = input.next();
			 adminObject.setNationalID(nationalID);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid National ID must be equal 14 numbers , please enter it again ");
			 String nationalID = input.next();
			 adminObject.setNationalID(nationalID);
		 }
		 System.out.println("Please enter administrator birth year");
		 int year =input.nextInt();
		 System.out.println("Please enter administrator birth month");
		 int month =input.nextInt();
		 System.out.println("Please enter administrator birth day");
		 int day =input.nextInt();
		 adminObject.setDateOfBirth(year, month, day);
		 System.out.println("Please enter administrator age");
		 int age = input.nextInt();
		 adminObject.setAge(age);
		 System.out.println("Please enter administrator gender  \" male or female \" ");
		 try {
			 String gender = input.next();
			 adminObject.setGender(gender);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Please enter a valid value");	 
	       }   
		 System.out.println("Please enter administrator PhoneNumber");
		 try {
		 String phoneNumber = input.next();
		 adminObject.setPhoneNumber(phoneNumber);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
		 }
		 System.out.println("Please enter administrator Address");
		 String address = input.next();
		 adminObject.setAddress(address);
		 System.out.println("Please enter administrator Position ");
		 String position = input.next();
		 adminObject.setposition(position);
		 System.out.println("Please enter number of  working hours per day");
		 int noWorkingHours = input.nextInt();
		 adminObject.setNoWorkingHours(noWorkingHours);
		 System.out.println("Please enter graduated university name of administrator");
		 String graduatedUniversity = input.next();
		 adminObject.setGraduatedUniversity(graduatedUniversity);
		 System.out.println("Please enter degree of administrator");
		 String degree = input.next();
		 adminObject.setDegree(degree);
		 System.out.println("Please enter number of administrator office ");
		 int noRoom = input.nextInt();
		 adminObject.setNoRoom(noRoom);
		 System.out.println("Please enter number of administrator yearly vacations  ");
		 int yearlyVacations = input.nextInt();
		 adminObject.setYearlyVacations(yearlyVacations);
		 listofAdmins.add(adminObject);
		 System.out.println("Administrator added");
	}
	
	
	static void deleteAdmin() {
		
		System.out.println("Please enter the National ID number of the administrator you want to delete");
		String IDNumber = input.next(); 
		for(int i=0;i<listofAdmins.size();i++)
		{
			if(listofAdmins.get(i).getNationalID().equals(IDNumber))
			{
				listofAdmins.remove(i);
				System.out.println("Admin deleted");
				break;
			}
				
			else
			{
				System.out.println("This value is not valid ");
				break;
			}
		}
	}
	
	
	static void displayAdminInformation() {
		
		System.out.println("Please enter the ID number of the administrator you want to display his information ");
		String nationalID = input.next();
		boolean test=false;
		int testCounter=0;        
		int size = listofAdmins.size() ;
		for(int i=0;i<size;i++){
			
			if(listofAdmins.get(i).getNationalID().equals(nationalID))
			{
				test=true;
				System. out.println("Administrator name:\t" + listofAdmins.get(i).getFirstName() + listofAdmins.get(i).getLastName());
				System. out.println("Administrator national ID:\t" + listofAdmins.get(i).getNationalID());
				System. out.println("Administrator Date Of Birth:\t" + listofAdmins.get(i).getDateOfBirth());
				System. out.println("Administrator age:\t" + listofAdmins.get(i).getAge());
				System. out.println("Administrator gender:\t" + listofAdmins.get(i).getGender());
				System. out.println("Administrator PhoneNumber:\t" + listofAdmins.get(i).getPhoneNumber());
				System. out.println("Administrator Address:\t" + listofAdmins.get(i).getAddress());
				System. out.println("Administrator degree:\t" + listofAdmins.get(i).getDegree());
				System. out.println("Administrator graduated university name:\t " + listofAdmins.get(i).getGraduatedUniversity());
				System. out.println("Administrator position:\t" + listofAdmins.get(i).getposition());
				System. out.println("Administrator salary:\t" + listofAdmins.get(i).getSalary());
				System. out.println("Number of yearly vacations:\t" + listofAdmins.get(i).getYearlyVacations());
				System. out.println("Administrator number of office:\t" + listofAdmins.get(i).getNoRoom());
				System. out.println("Number of all Administrators is:\t" + listofAdmins.get(i).getNoAdmins());
			}
			else
				System.out.println("This value is not valid Please enter a valid value");
			testCounter++;
			if(test==true)
				break;
		}
		if(testCounter==0)
			System.out.println("This administrator has been deleted");
		}
	

	}// end class 