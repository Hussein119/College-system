import java.time.LocalDate;
abstract class People {
    //Data Members
private String firstName;
private String lastName;
private String nationalID;
private String address;
private String phoneNumber;
private String gender ;
private String email;
private int age;
private LocalDate dateOfBirth;
    //Constructors
public People()
{  
	firstName=null;
	lastName=null;
	address=null;
	email=null;
	gender=null;
	nationalID=null;
	phoneNumber=null;
	age=0;	
}
   //Parameterized Constructor
public People(String firstName,String lastName,String address,String gender,String email,int age,String phoneNumber,String nationalID,int year, int month, int day)
{  
	this.firstName=firstName;
	this.lastName=lastName;
	this.address=address;
	this.email=email;
    dateOfBirth = LocalDate.of(year, month, day);
    
    this.gender=gender;
    
    for(int i=0 ; i<nationalID.length() ; i++)
    {
    	if(nationalID.charAt(i)<'0' || nationalID.charAt(i)>'9' )
    		throw new IllegalArgumentException("National ID must be integer numbers only");
    }
  
	if(nationalID.length()!=14)
       throw new IllegalArgumentException("National ID must be equal 14 numbers");
    	
    this.nationalID=nationalID;	
    
    for(int i=0 ; i<phoneNumber.length() ; i++)
    {
    	if(phoneNumber.charAt(i)<'0' || phoneNumber.charAt(i)>'9' )
    		throw new IllegalArgumentException("PhoneNumber must be integer numbers only");
    }
    if(phoneNumber.length()!=11)
      throw new IllegalArgumentException("Phone Number must be equal 11 numbers");
    	
    this.phoneNumber=phoneNumber;
    
    if(age<0)
      throw new IllegalArgumentException("Age cannot be less than or equal zero ");
	
    this.age=age;
}
      //Methods (getter & setter)
public void setFirstName(String firstName){
	this.firstName=firstName;
}
public String getFirstName(){
	return firstName;
}
public void setLastName(String lastName){
	this.lastName=lastName;
}
public String getLastName(){
	return lastName;
}
public void setAge(int age){
	if(age<0)
		throw new IllegalArgumentException("Age cannot be less than or equal zero ");
		
	this.age=age;
}
public int getAge(){
	return age;
}
public void setNationalID(String nationalID){
	for(int i=0 ; i<nationalID.length() ; i++)
    {
    	if(nationalID.charAt(i)<'0' || nationalID.charAt(i)>'9' )
    		throw new IllegalArgumentException("National ID must be integer numbers only");
    }
	 if(nationalID.length()!=14 )
	   throw new IllegalArgumentException("National ID must be 14 numbers");
	    	
	 this.nationalID=nationalID;	
}
public String getNationalID(){
	return nationalID;
}
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
     return address;
}
public void setPhoneNumber(String phoneNumber){
	for(int i=0 ; i<phoneNumber.length() ; i++)
    {
    	if(phoneNumber.charAt(i)<'0' || phoneNumber.charAt(i)>'9' )
    		throw new IllegalArgumentException("PhoneNumber must be integer numbers only");
    }
	if(phoneNumber.length()!=11)
	  throw new IllegalArgumentException("Phone Number must be 11 numbers");
	    	
	this.phoneNumber=phoneNumber;
}
public String getPhoneNumber(){
	return phoneNumber;
}
public void setGender (String gender)
{
	gender.toLowerCase();
	if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")))
		throw new IllegalArgumentException("This value is not valid Please enter a valid value");
	this.gender=gender;
}
public String getGender(){       
	return gender;
}
public void setEmail(String email){
	this.email=email;
}
public String getEmail(){
	return email;
}
public void setDateOfBirth(int year , int month , int day ) {
	dateOfBirth = LocalDate.of(year, month, day);
	this.dateOfBirth=dateOfBirth;
}
public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}