import java.util.*;
public class CollegeProgramController {
	  // displaying static methods 
	public static String Startdisplaying  ()
	{
		String s1 = "\t\t\t\t\t\t Welcome in FCI Asyut\n  ";
		String s2 = " choose one of this to make your operation at by Enter number of element  \n"
				+ " 1- Students \n"
				+ " 2- Administrators \n "
				+ "3- Professors \n "
				+ "4- Teachingassistants \n "
				+ "5- Technicians \n "
				+ "6- Workers \n ";
		return s1 + s2 ;
	}
	public static String Studentoperations () 
	{
		String s1 = "choose one of this - by enter its number - to make your operation at by Enter number of element \n "
				+ "1- add a Student "
				+ "\n 2- delete a Student "
				+ "\n 3- display Student information \n ";
		
		return s1;
	}
	public static String Administratoroperations () 
	{
		String s1 = "choose one of this - by enter its number - to make your operation at by Enter number of element \n "
				+ "1- add a Administrator "
				+ "\n 2- delete a Administrator "
				+ "\n 3- display Administrator information \n ";
		
		return s1;
	}
	public static String Professoroperations () 
	{
		String s1 = "choose one of this - by enter its number - to make your operation at by Enter number of element \n "
				+ "1- add a professor "
				+ "\n 2- delete a professor "
				+ "\n 3- display professor information \n ";
		return s1;
	}
	public static String Teachingassistantoperations () 
	{
		String s1 = "choose one of this - by enter its number - to make your operation at by Enter number of element \n "
				+ "1- add a Teachingassistant "
				+ "\n 2- delete a Teachingassistant "
				+ "\n 3- display Teachingassistant information \n ";
		return s1;
	}
	public static String technicianoperations () 
	{
		String s1 = "choose one of this - by enter its number - to make your operation at by Enter number of element \n "
				+ "1- add a Technician "
				+ "\n 2- delete a Technician "
				+ "\n 3- display Technician information \n ";
		return s1;
	}
	public static String Workeroperations () 
	{
		String s1 = "choose one of this - by enter its number - to make your operation at by Enter number of element \n "
				+ "1- add a Worker "
				+ "\n 2- delete a Worker "
				+ "\n 3- display Worker information \n ";
		return s1;
	}
	// Start main 
	public static void main(String[] args) {
		System.out.println( Startdisplaying  ());
		Scanner input = new Scanner(System.in);
		int numberofElement2=0;
		int numberofElement = input.nextInt();
		if(numberofElement==1 || numberofElement==2 ||
		   numberofElement==3 || numberofElement==4 ||
		   numberofElement==5 || numberofElement==6) {		
			numberofElement2=numberofElement;
		} 
		else
		{
			System.out.println("This value is not valid Please enter a valid value");
		}
		if (numberofElement2==1 )
		{
			System.out.println("Please add student ");
			Editstudent es = new Editstudent();
			 es.addStudent();	 
			 while (true) {
			 System.out.println(Studentoperations ());
			 int numberofelementstudent = input.nextInt();	 
			if(numberofelementstudent == 1 || numberofelementstudent == 2 || numberofelementstudent == 3) {
					if(numberofelementstudent == 1)
						es.addStudent();
					if(numberofelementstudent == 2)
					    es.deleteStudent();
					if(numberofelementstudent == 3)
						es.displayStudentInformation();
				} 
			else
				System.out.println("This value is not valid ");	
			 } // end while 	     
		} // end if 1 		
		if (numberofElement2==2) {
			System.out.println("Please add Administrator");
			Editadmin ea = new Editadmin();
			ea. addAdmin();
			while (true) {
				 System.out.println(Administratoroperations ());
				 int numberofelementAdministrator = input.nextInt();			 
				if(numberofelementAdministrator == 1 || numberofelementAdministrator == 2 || numberofelementAdministrator == 3) {
						if(numberofelementAdministrator == 1)
							ea. addAdmin();
						if(numberofelementAdministrator == 2);
						    ea.deleteAdmin();
						if(numberofelementAdministrator == 3);
							ea.displayAdminInformation();
					} 
				else
					System.out.println("This value is not valid Please enter a valid value");	
				 } // end while 			
		} // end if 2 		
        if (numberofElement2==3) {			
        	System.out.println("Please add professor ");
        	Editprofessor ep = new Editprofessor();
        	ep.addProfessor();			 
			 while (true) {
			 System.out.println( Professoroperations () );
			 int numberofelementprofessor = input.nextInt();			 
			if(numberofelementprofessor == 1 || numberofelementprofessor == 2 || numberofelementprofessor == 3) {
					if(numberofelementprofessor == 1)
						ep.addProfessor();
					if(numberofelementprofessor == 2)
					    ep.deleteProfessor();
					if(numberofelementprofessor == 3)
						ep.displayProfessorInformation();
				} 
			else
				System.out.println("This value is not valid Please enter a valid value");	
			 } // end while 	     
		} // end if 3				
        if (numberofElement2==4) {      	
    			System.out.println("Please add teachingassistant");
    			Editteachingassistant eta = new Editteachingassistant();
    			eta.addTeachingassistant();			 
    			 while (true) {
    			 System.out.println(Teachingassistantoperations ());
    			 int numberofelementteachingassistant = input.nextInt();			 
    			if(numberofelementteachingassistant == 1 || numberofelementteachingassistant == 2 || numberofelementteachingassistant == 3) {
    					if(numberofelementteachingassistant == 1)
    						eta.addTeachingassistant();
    					if(numberofelementteachingassistant == 2)
    						eta.deleteTeachingassistant();
    					if(numberofelementteachingassistant == 3)
     						eta. displayTeachingassistantInformation();
    				} 
    			else
    				System.out.println("This value is not valid Please enter a valid value");	
    			 } // end while 			
		} // end if 4				
        if (numberofElement2==5) {
        	System.out.println("Please add technician ");
        	Edittechnician et = new Edittechnician();
        	et.addTechnician();			 
			 while (true) {
			 System.out.println(technicianoperations () );
			 int numberofelementtechnician = input.nextInt();			 
			if(numberofelementtechnician == 1 || numberofelementtechnician == 2 || numberofelementtechnician == 3) {
					if(numberofelementtechnician == 1)
						et.addTechnician();
					if(numberofelementtechnician == 2)
					    et.deleteTechnician();
					if(numberofelementtechnician == 3)
						et.displayTechnicianInformation();
				} 
			else
				System.out.println("This value is not valid Please enter a valid value");	
			 } // end while 			
			} // end if 5				
        if (numberofElement2==6) {
        	System.out.println("Please add worker ");
			Editworker ew = new Editworker();
			 ew.addWorker();
			 while (true) {
			 System.out.println(Workeroperations ());
			 int numberofelementworker = input.nextInt();
			 
			if(numberofelementworker == 1 || numberofelementworker == 2 || numberofelementworker == 3) {
					if(numberofelementworker== 1)
						ew.addWorker();
					if(numberofelementworker == 2)
					    ew.deleteWorker();
					if(numberofelementworker  == 3)
						ew.displayWorkerInformation();
				} 
			else
				System.out.println("This value is not valid Please enter a valid value");	
			 } // end while 	     
        } // end if 6																															 
	} // end main 	 
} // end class CollegeProgramController    