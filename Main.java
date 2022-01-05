import java.lang.*;
import all_Class.*;
import all_Interfaces.*;
import java.util.*;
import readwrite.*;

public class Main
{
	public static void main(String args[])
	{
		System.out.println("AIUB Gym Management System");
		boolean condition = true;
		Scanner s = new Scanner(System.in);
		Admin a = new Admin();
		ReadWrite rw = new ReadWrite();
		DateTime dt = new DateTime();
		
		while(condition)
		{
			System.out.println("Please choose your option: \n");
			System.out.println("	1. Member");
			System.out.println("	2. Instructor");
			System.out.println("	3. Payment");
			System.out.println("	4. Workout plan & scheduling");
			System.out.println("	5. Show Workout Schedule");
			System.out.println("	6. Exit the Application\n");
			System.out.print("What do you want to do? : ");
			
			int one = s.nextInt();
			
			switch(one)
			{
				case 1:
					
					System.out.println("Manage Member");
					System.out.println("Choose an option: \n");
					System.out.println("	1. Add New Member");
					System.out.println("	2. Remove Existing Member");
					System.out.println("	3. All Member List");
					System.out.println("	4. Go Back\n");
					System.out.print("What do you want to do? : ");
					int two1 = s.nextInt();
					
					switch(two1)
					{
						case 1:
							
							System.out.println("Provide Member Details\n");
							System.out.print("Member Id: ");
							String memberId = s.next();
							System.out.print("Member Name: ");
							String memberName = s.next();
							System.out.print("Member Address: ");
							String address = s.next();
							System.out.print("Member Contact: ");
							String contactno = s.next();
							System.out.print("Member Email: ");
							String email = s.next();
							System.out.print("Gender: ");
							String gender = s.next();
							System.out.print("DOB: ");
							String date_of_birth = s.next();
							System.out.print("Joining Date: ");
							String joining_date = s.next();
							

						
							
							Member m = new Member();
							m.setMemberId(memberId);
							m.setMembername(memberName);
							m.setAddress(address);
							m.setContactno(contactno);
							m.setEmail(email);
							m.setGender(gender);
							m.setDate_of_birth(date_of_birth);
							m.setJoining_date(joining_date);
							
							a.insertMember(m);
							
							
							break;
							
						case 2:
							
							System.out.println("To remove an existing Member");
							System.out.print("Enter Member Id: ");
							
							
							a.removeMember(a.getMember(s.next()));
							
							break;
							
						case 3:
							
							System.out.println("Here is the List of All Members");
							
						    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
							
							a.showAllMembers();
							
							System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
							
							break;
						
						case 4:
							
							System.out.println("Going Back");
							break;
						
						default:
							
							System.out.println("Your input is wrong!!!");
							System.out.println("Please select a number from 1 to 4");
							break;
					}
					
					break;
					
				case 2:
				
					System.out.println("Manage Instructor");
					System.out.println("Choose an option: \n");
					System.out.println("	1. Add New Instructor");
					System.out.println("	2. Remove Existing Instructor");
					System.out.println("	3. All Instructor List");
					System.out.println("	4. Go Back\n");
					System.out.print("What do you want to do? : ");
					int two2 = s.nextInt();
					
					switch(two2)
					{
						case 1:
						
							System.out.print("Instructor Id: ");
							String instructor_ID = s.next();
							System.out.print("Instructor Name: ");
							String name = s.next();
							System.out.print("Instructor Contact: ");
							int contact_info = s.nextInt();
							System.out.print("Instructor Address: ");
							String address = s.next();
							System.out.print("Gender: ");
							String gender = s.next();
							System.out.print("Workout Time: ");
							String workout_time = s.next();
							
							Instructor i = new Instructor();
							i.setInstructor_ID(instructor_ID);
							i.setName(name);
							i.setContact_info(contact_info);
							i.setAddress(address);
							i.setGender(gender);
							i.setWorkout_time(workout_time);
							
							a.insertInstructor(i);
							break;
							
						case 2:
						
							System.out.println("To remove an existing Instructor");
							System.out.print("Enter Instructor Id: ");
							
							
							a.removeInstructor(a.getInstructor(s.next()));
							
							break;
						
						case 3:
						
							a.showAllInstructor();
							break;
						
						case 4:
						
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Your input is wrong!!!");
							System.out.println("Please select a number from 1 to 4");
							break;
					}
					
					break;
				
				case 3:
					
					System.out.println("		************Payment*************");
					
					System.out.println("Choose an option: \n");
					System.out.println("	1. Cash Payment");
					System.out.println("	2. Creditcard Payment");
					System.out.println("	3. Show Transaction History");
					System.out.println("	4. Go Back\n");
					System.out.print("What do you want to do? : ");
					int two3 = s.nextInt();
					
					switch(two3)
					{
						case 1: 
						
							Cashpayment cp = new Cashpayment();
							
						    System.out.print("Payment Id: ");
							String pi1 = s.next();
						    System.out.print("Cashpayment amount: ");
							double ca1 = s.nextDouble();
							System.out.print("Member Id: ");
							String mi1 = s.next();
							
							cp.setPaymentId(pi1);
							cp.setAmount(ca1);
							cp.setM_id(mi1);
							String d1 = dt.dateTime();
							cp.setDate(d1);
							System.out.println("\n This is your current transaction details:\n ");
							
							cp. showDetails();
							rw.writeInFile("Tk : "+ca1+", Payment Id : "+pi1+", Member Id: "+mi1+", at "+d1 );
						    
							break;
							
						case 2:
						
						    Creditcardpayment ccp = new Creditcardpayment();
							
						    System.out.print("Payment Id: ");
							String pi2 = s.next();
						    System.out.print("Amount: ");
							double ca2 = s.nextDouble();
							System.out.print("CreditcardNo: ");
							String cn = s.next();
							System.out.print("Member Id: ");
							String mi2 = s.next();
							
							ccp.setPaymentId(pi2);
							ccp.setAmount(ca2);
							ccp.setCreditcardNo(cn);
							ccp.setM_id(mi2);
							String d2 = dt.dateTime();
							ccp.setDate(d2);
							System.out.println("\n This is your current transaction details:\n ");
							
							ccp. showDetails();
							rw.writeInFile("Tk : "+ca2+", Payment Id : "+pi2+", CCNo: "+cn+", Member Id: "+mi2+", at "+d2);
							
							break;
						
						case 3:
							System.out.println("		----------------------------");
							System.out.println("		Read From File Successful!!!");
							System.out.println("		----------------------------");
							rw.readFromFile("Member_Payment_Transaction.txt");
							break;
							
						case 4:
						
							System.out.println("Going Back . . .");
							break;
							
						default:
						
							System.out.println("Invalid Input");
							break;
					}
					
					break;
					
				case 4:
				

					Workout_Schedule ws = new Workout_Schedule();
					
					System.out.println("		********Set workout plan**********");
					System.out.println("");
					System.out.print("Enter plan Id: ");
					String pl1 = s.next();
					System.out.print("Enter workout type: ");
					String wt = s.next();
					System.out.print("Instructor Id: ");
					String ii = s.next();
					System.out.print("Workout time: ");
					String wt1 = s.next();
					System.out.print("Workout session time: ");
			        String wst = s.next();
					
					
					ws.setPlan_id(pl1);
					ws.setWorkout_type(wt);
					ws.setInstructor_id(ii);
					ws.setWorkout_time(wt1);
					ws.setSession_time(wst);
					
					System.out.println("");
					System.out.println("\nWorkout Schedule Details: ");
					System.out.println("----------------------------");
					ws.showInfo();
					
					rw.writeInWorkout("Plan ID: "+pl1+", Workout Type: "+wt+", Instructor ID: "+ii+", Workout Time: "+wt1+", Session Time: "+wst);
					
					
					break;
					
				case 5:
					System.out.println("\n		!!!!!!!!!Reading Workout Plan!!!!!!!!!!!!");
					System.out.println("		-----------------------------------------");
					rw.readFromFile("Workout_Schedule.txt");
					System.out.println("");
					
					break;
				case 6:
					
					System.out.println("Exiting Application........");
					
					condition = false;
					break;
					
				default:
				
				            System.out.println("Your input is wrong!!!");
							System.out.println("Please select a number from 1 to 6");
					break;
			}
		}
		
	}
}
