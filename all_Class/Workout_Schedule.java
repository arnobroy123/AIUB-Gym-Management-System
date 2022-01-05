package all_Class;
import java.lang.*;
public class Workout_Schedule extends Workout_Plan
{
  private String workout_time;
  private String session_time;
  
  public Workout_Schedule()
  {
	  
  }
  public Workout_Schedule(String plan_id, String workout_type, String instructor_id, String workout_time, String session_time)
  {
	  super(plan_id, workout_type, instructor_id);
	  this.workout_time = workout_time;
	  this.session_time = session_time;
  }
 
	public void setWorkout_time(String workout_time)
	{
		this.workout_time = workout_time;
	}
	public void setSession_time(String session_time)
	{
		this.session_time = session_time;
	}
	
	public String getWorkout_time()
	{
		return workout_time;
	}
	
	public String getSession_time()
	{
		return session_time;
	}

	public void showInfo()
	{
		System.out.println("Plan Id: " +plan_id);
		System.out.println("Workout Time: "+workout_time);
		System.out.println("Session Time: "+session_time);
		System.out.println("Type: "+workout_type);
		System.out.println("Instructor Id: "+instructor_id);
		System.out.println();
	}
}