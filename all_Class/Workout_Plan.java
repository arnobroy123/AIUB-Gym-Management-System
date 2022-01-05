package all_Class;
import java.lang.*;
public class Workout_Plan
{
   protected String plan_id;
   protected String workout_type;
   protected String instructor_id;
   
   public Workout_Plan()
   {
	   
   }
   public Workout_Plan(String plan_id, String workout_type, String instructor_id)
   {
	   this.plan_id = plan_id;
	   this.workout_type = workout_type;
	   this.instructor_id = instructor_id;
	   
   }
 
 	public void setPlan_id(String plan_id)
	{
		this.plan_id = plan_id;
	}
	public void setWorkout_type(String workout_type)
	{
		this.workout_type = workout_type;
	}
	public void setInstructor_id(String instructor_id)
	{
		this.instructor_id = instructor_id ;
	}
	public String getPlan_id()
	{
	    return plan_id;
    }
	
	public String get()
	{ 
	   return workout_type;
	}
	
	public String getInstructor_id()
	{return instructor_id;}
	
	public void showInfo()
	{
		System.out.println("Plan Id: "+plan_id);
		System.out.println("Workout Type: "+workout_type);
		System.out.println("Instructor Id: "+instructor_id);
		System.out.println();
	}
	
}