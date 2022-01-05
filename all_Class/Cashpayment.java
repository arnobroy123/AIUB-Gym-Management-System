package all_Class;
import java.lang.*;

public class Cashpayment extends Payment
{
	private String date;
	private String m_id;
	
   public Cashpayment()
  {
	
  }
  public Cashpayment(String paymentId, double amount, String date , String m_id)
  {
	  super(paymentId,amount);
	  this.date = date;
	  this.m_id = m_id;
  }
  public void showDetails()
	{
		System.out.println("payment Id:" +paymentId);
		System.out.println("Cashpayment amount:" +amount);
		System.out.println("Transaction date:" +date);
		System.out.println("Member Id:" +m_id);
		
	}
  public void setDate(String date)
  {
	  this.date = date;
  }
  public String getDate()
  {
	  return date;
  }
    public void setM_id(String m_id)
  {
	  this.m_id = m_id;
  }
  public String getM_id()
  {
	  return m_id;
  }
  
}