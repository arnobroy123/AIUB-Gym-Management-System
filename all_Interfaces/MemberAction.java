package all_Interfaces;
import all_Class.*;
import java.lang.*;


public interface MemberAction
{
	void insertMember(Member m);
	void removeMember(Member m);
	Member getMember(String memberId);
	void showAllMembers();
}