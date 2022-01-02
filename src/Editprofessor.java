import java.util.*;
public class Editprofessor {
	static ArrayList<Professors> listofProfessors = new  ArrayList<Professors>();
	static Scanner input = new Scanner(System.in);
	
	static void addProfessor() {
		Professors professorObject = new Professors();
		 System.out.println("Please enter professor first name");
		 String firstName = input.next();
		 professorObject.setFirstName(firstName);
		 System.out.println("Please enter professor last name");
		 String lastName = input.next();
		 professorObject.setLastName(lastName);
		 System.out.println("Please enter professor national ID");
		 try {
			 String nationalID = input.next();
			 professorObject.setNationalID(nationalID);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid National ID must be equal 14 numbers , please enter it again ");
			 String nationalID = input.next();
			 professorObject.setNationalID(nationalID);
		 }
		 System.out.println("Please enter professor birth year");
		 int year =input.nextInt();
		 System.out.println("Please enter professor birth month");
		 int month =input.nextInt();
		 System.out.println("Please enter professor birth day");
		 int day =input.nextInt();
		 professorObject.setDateOfBirth(year, month, day);
		 System.out.println("Please enter professor age");
		 int age = input.nextInt();
		 professorObject.setAge(age);
		 System.out.println("Please enter professor gender  \" male or female \" ");
		 try {
			 String gender = input.next();
			 professorObject.setGender(gender);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Please enter a valid value");	 
	       }   
		 System.out.println("Please enter professor PhoneNumber");
		 try{
		 String PhoneNumber = input.next();
		 professorObject.setPhoneNumber(PhoneNumber);
		 }
		 catch(IllegalArgumentException e ) {
				 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
		 }
		 System.out.println("Please enter professor Address");
		 String address = input.next();
		 professorObject.setAddress(address);
		 System.out.println("Please enter number of Working hours per day");
		 int nohours = input.nextInt();
		 professorObject.setNoWorkingHours(nohours);
		 System.out.println("Please enter  professor phd Subject ");
		 String phdSubject = input.next();
		 professorObject.setPhdSubject(phdSubject);
		 listofProfessors.add(professorObject);
		 System.out.println("Please enter  professor Phd University ");
		 String phdUniversity = input.next();
		 professorObject.setPhdUniversity(phdUniversity);
		 listofProfessors.add(professorObject);
		 System.out.println("Please enter  professor Bachalor University ");
		 String bachalorUniversity = input.next();
		 professorObject.setBachalorUniversity(bachalorUniversity);
		 listofProfessors.add(professorObject);
		 System.out.println("Please enter  professor Master Subject");
		 String masterSubject = input.next();
		 professorObject.setMasterSubject(masterSubject);
		 listofProfessors.add(professorObject);
		 System.out.println("Please enter  professor Master University ");
		 String masterUniversity = input.next();
		 professorObject.setMasterUniversity(masterUniversity);
		 listofProfessors.add(professorObject);
		 System.out.println("Professor added");
}
	
      static void deleteProfessor() {

	
	System.out.println("Please enter the academic number of the Professor you want to delete");
	String nationalID = input.next();
	for(int i=0;i<listofProfessors.size();i++)
	{
		if(listofProfessors.get(i).getNationalID().equals(nationalID))
		{
			listofProfessors.remove(i);
			System.out.println("Professor deleted");
			break;
		}
			
		else
		{
			System.out.println("This value is not valid ");
			break;
		}
	}
	
}
      
      
      static void displayProfessorInformation() {
  		
  		System.out.println("Please enter the national number of the Professor you want to display his information ");
  		String nationalID = input.next();
  		boolean test=false;
  		int testCounter=0;
  		int size = listofProfessors.size() ;
  		for(int i=0;i<size;i++)
  		{
  			if(listofProfessors.get(i).getNationalID().equals(nationalID))
  			{
  				test=true;
  				System. out.println("Professors name:\t" + listofProfessors.get(i).getFirstName() + listofProfessors.get(i).getLastName());
  				System. out.println("Professors national ID:\t" + listofProfessors.get(i).getNationalID());
  				System. out.println("Professors Date Of Birth:\t" + listofProfessors.get(i).getDateOfBirth());
  				System. out.println("Professors age:\t" +  listofProfessors.get(i).getAge());
  				System. out.println("Professors gender:\t" + listofProfessors.get(i).getGender());
  				System. out.println("Professors PhoneNumber:\t" +  listofProfessors.get(i).getPhoneNumber());
  				System. out.println("Professors Address:\t" +  listofProfessors.get(i).getAddress());
  				System.out.println("Professor phdSubject:\t" + listofProfessors.get(i).getPhdSubject());
  				System.out.println("Professor Phd University:\t"+ listofProfessors.get(i).getPhdUniversity());
  				System.out.println("Professor Bachalor University:\t"+ listofProfessors.get(i).getBachalorUniversity());
  				System.out.println("Professor Master Subject:\t"+ listofProfessors.get(i).getMasterSubject());
  				System.out.println("Professor Master University:\t"+ listofProfessors.get(i).getMasterUniversity());
  				System. out.println("Number of all Professors is:\t" + listofProfessors.get(i).getNoProfessors());
  			}	
  			else
  				System.out.println("This value is not valid Please enter a valid value");
  			testCounter++;
  			if(test==true)
  				break;
  		}
  		if(testCounter==0)
  			System.out.println("This Professor has been deleted");
  		
  		
  		
  	}
      
}// end class 