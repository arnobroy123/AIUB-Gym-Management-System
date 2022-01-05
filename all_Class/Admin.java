package all_Class;
import all_Interfaces.*;


public class Admin implements MemberAction, InstructorAction {
	
			private Member members[] = new Member [200];
			private Instructor instructors[] = new Instructor[100];
			
			public void insertMember(Member m)
			{
				int count = 0;
				for(int i=0;i<members.length;i++)
				{
					if(members[i]==null)
					{
						members[i] = m;
						count = 1;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("Member Inserted");
				}
				else
				{
					System.out.println("Cannot Insert Member");
				}
			}
			public void removeMember(Member m)
			{
				int count=0;
				for(int i=0;i<members.length;i++)
				{
					if(members[i]==m)
					{
						members[i]=null;
						count=1;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("Member Removed Successfully!!!");
				}
				else
				{
					System.out.println("!!!Cannot Remove Member!!!");
				}
			}
			public void showAllMembers()
			{
				for(Member m : members)
				{
					if(m!=null)
					{
						System.out.println("-----------------------");
						System.out.println("MemberId: " +m.getMemberId());
						System.out.println("Member Name: " +m.getMembername());
						System.out.println("Member Address: " +m.getAddress());
						System.out.println("Member Contact: " +m.getContactno());
						System.out.println("Member Email: " +m.getEamil());
						System.out.println("Gender: " +m.getGender());
						System.out.println("DOB: " +m.getDate_of_birth());
						System.out.println("Joining Date: " +m.getJoining_date());
						System.out.println("----------------------");
					}
					else
					{
						System.out.println("No Member Found");
						break;
					}
				}
			}
			public Member getMember(String m_Id)
			{
				Member m = null;
				for(int i=0;i<members.length;i++)
				{
					if(members[i]!=null)
					{
						if(members[i].getMemberId().equals(m_Id))
						{
							m = members[i];
							break;
						}
					}
				}	
					if(m!=null)
					{
						System.out.println("Member Found!!!");
					}
					else
					{
						System.out.println("Member Not Found!!!");
					}
					return m;
				    
				
			}
			
			
			public void insertInstructor(Instructor i)
			{
				int count = 0;
				for(int j=0;j<instructors.length;j++)
				{
					if(instructors[j]==null)
					{
						instructors[j] = i;
						count = 1;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("Instructor Inserted");
				}
				else
				{
					System.out.println("Cannot Insert Instructor");
				}
			}
			public void removeInstructor(Instructor i)
			{
				int count=0;
				for(int j=0;j<instructors.length;j++)
				{
					if(instructors[j]==i)
					{
						instructors[j]=null;
						count=1;
						break;
					}
				}
				if(count==1)
				{
					System.out.println("Instructor Removed Successfully!!!");
				}
				else
				{
					System.out.println("!!!Cannot Remove Instructor!!!");
				}
			}
			public void showAllInstructor()
			{
				for(Instructor i : instructors)
				{
					if(i!=null)
					{
						System.out.println("----------------------");
						System.out.println("InstructorId: " +i.getInstructor_ID());
						System.out.println("Instructor Name: " +i.getName());
						System.out.println("Instructor Contact: " +i.getContact_info());
						System.out.println("Instructor Address: " +i.getAddress());
						System.out.println("Instructor WorkoutTime: " +i.getWorkout_time());
						System.out.println("----------------------");
					}
					else
					{
						System.out.println("\nNo Instructor Found\n");
						break;
					}
					
				}
					
			}
			public Instructor getInstructor(String insId)
			{
				Instructor i = null;
				for(int j=0;j<instructors.length;j++)
				{
					if(instructors[j]!=null)
					{
						if(instructors[j].getInstructor_ID().equals(insId))
						{
							i = instructors[j];
							break;
						}
					}
				}
					if(i!=null)
					{
						System.out.println("Instructor Found!!!");
					}
					else
					{
						System.out.println("Instructor Not Found!!!");
					}
					return i;
			
			}
}