package all_Interfaces;
import all_Class.*;
import java.lang.*;
public interface InstructorAction
{
	void insertInstructor(Instructor i);
	void removeInstructor(Instructor i);
	Instructor getInstructor(String instructor_ID);
	void showAllInstructor();
}