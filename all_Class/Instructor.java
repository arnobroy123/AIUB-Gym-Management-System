package all_Class;
import java.lang.*;

public class Instructor
{
     String name;
     String instructor_ID;
	 String gender;
     int contact_info;  
     String address;
     String workout_time;

       
	public void setName(String name)
	{
          		this.name=name;
	}
	public void setGender(String gender)
	{
          		this.gender=gender;
	}
	 public void setInstructor_ID(String instructor_ID) 
	{
                	this.instructor_ID= instructor_ID;
	}
	public void setContact_info( int contact_info) 
	{ 
          		this.contact_info=contact_info;
	}
	public void setAddress(String address) 
	{
          		this.address= address;
	}
	public void setWorkout_time(String workout_time) 
	{
          		this.workout_time= workout_time;
	}
	
	
	public String getInstructor_ID()
	{
	          	return instructor_ID;
	} 
	public String getName()
	{
          		return name;
	}
	public int getContact_info()
	{
	          	return contact_info;
	} 
	public String getAddress()
	{
	return address;
	}
	public String getWorkout_time()
	{
	return workout_time;
	}
	public String getGender()
	{
          		return gender;
	}
    

public void showDetails()
	{
		System.out.println("Instructor Name: " +name);
                System.out.println("Instructor_ID: " +instructor_ID);
		System.out.println("Instructor contact information: "+contact_info);
		System.out.println("Instructor Work out time: " +workout_time);
                System.out.println("Instructor address: " +address);
				System.out.println("Gender: " +gender);
		
	}
}