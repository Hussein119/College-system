import java.util.*;
public class Editworker {
	static ArrayList<Workers> listofWorkers = new  ArrayList<Workers>();
	static Scanner input = new Scanner(System.in);
	
	static void addWorker() {
		 Workers workerObject = new Workers();
		 System.out.println("Please enter worker first name");
		 String firstName = input.next();
		 workerObject.setFirstName(firstName);
		 System.out.println("Please enter worker last name");
		 String lastName = input.next();
		 workerObject.setLastName(lastName);
		 System.out.println("Please enter worker national ID");
		 try {
			 String nationalID = input.next();
			 workerObject.setNationalID(nationalID);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid National ID must be equal 14 numbers , please enter it again ");
			 String nationalID = input.next();
			 workerObject.setNationalID(nationalID);
		 }
		 System.out.println("Please enter worker birth year");
		 int year =input.nextInt();
		 System.out.println("Please enter worker birth month");
		 int month =input.nextInt();
		 System.out.println("Please enter worker birth day");
		 int day =input.nextInt();
		 workerObject.setDateOfBirth(year, month, day);
		 System.out.println("Please enter worker age");
		 int age = input.nextInt();
		 workerObject.setAge(age);
		 
		 System.out.println("Please enter worker gender  \" male or female \" ");
		 try {
			 String gender = input.next();
			 workerObject.setGender(gender);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Please enter a valid value");	 
	       }   
		 System.out.println("Please enter worker PhoneNumber");
		 try{
		 String PhoneNumber = input.next();
		 workerObject.setPhoneNumber(PhoneNumber);
		 }
		 catch(IllegalArgumentException e ) {
			 System.out.println("This value is not valid Phone Number must be equal 11 numbers");	 
	 }
		 System.out.println("Please enter worker Address");
		 String address = input.next();
		 workerObject.setAddress(address);
		 System.out.println("Please enter  worker jobDescription ");
	   	 String jobDescription = input.next();
		 workerObject.setJobDescription(jobDescription);
		 System.out.println("Please enter number  working hours per day");
		 int nohours = input.nextInt();
		 workerObject.setNoWorkingHours(nohours);
		 listofWorkers.add(workerObject);
		 System.out.println("Worker added");
}
    static void deleteWorker() {
		
		System.out.println("Please enter the National ID number of the worker you want to delete");
		String IDNumber = input.next(); 
		for(int i=0;i<listofWorkers.size();i++)
		{
			if(listofWorkers.get(i).getNationalID().equals(IDNumber))
			{
				listofWorkers.remove(i);
				System.out.println("Worker deleted");
				break;
			}
				
			else
			{
				System.out.println("This value is not valid ");
				break;
			}
				
				
		}
	}

static void displayWorkerInformation() {
	
	System.out.println("Please enter the National ID number of the worker you want to display his information ");
	String nationalID = input.next();
	boolean test=false;
	int testCounter=0;
	int size = listofWorkers.size() ;
	for(int i=0;i<size;i++)
	{
		if(listofWorkers.get(i).getNationalID().equals(nationalID))
		{
			test=true;
			System. out.println("Worker name:\t" + listofWorkers.get(i).getFirstName() + listofWorkers.get(i).getLastName());
			System. out.println("Worker national ID:\t" + listofWorkers.get(i).getNationalID());
			System. out.println("Worker Date Of Birth:\t" + listofWorkers.get(i).getDateOfBirth());
			System. out.println("Worker age:\t" + listofWorkers.get(i).getAge());
			System. out.println("Worker PhoneNumber:\t" + listofWorkers.get(i).getPhoneNumber());
			System. out.println("Worker Address:\t" + listofWorkers.get(i).getAddress());
			System. out.println("Worker gender:\t" + listofWorkers.get(i).getGender());
			System. out.println("Worker jobDescription:\t" + listofWorkers.get(i).getJobDescription());
			System. out.println("Worker salary:\t" + listofWorkers.get(i).getSalary());
			System. out.println("Number of yearly vacations:\t" + listofWorkers.get(i).getYearlyVacations());
			System. out.println("Number of all Workers is:\t" + listofWorkers.get(i).getNoWorkers());
		}
		else
			System.out.println("This value is not valid Please enter a valid value");
		testCounter++;
		if(test==true)
			break;
	}
	if(testCounter==0)
		System.out.println("This Worker has been deleted");
	
	
	
}

} // end class

