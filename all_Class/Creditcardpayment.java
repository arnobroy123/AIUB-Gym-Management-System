package all_Class;
import java.lang.*;

public class Creditcardpayment extends Payment
{
	public String creditcardNo;
	public String date;
	private String m_id;
	
	public Creditcardpayment()
	{
		
	}
	public Creditcardpayment(String paymentId, double amount, String creditcardNo, String date, String m_id)
	{
		super(paymentId,amount);
		this.creditcardNo = creditcardNo;
		this.date = date;
		this.m_id = m_id;
	}
	public void showDetails()
	{
		System.out.println("Creditcardpayment Id:" +paymentId);
		System.out.println("Creditcardpayment Amount:" +amount);
		System.out.println("creditcardNo:" +creditcardNo);
		System.out.println("Transaction date:" +date);
		System.out.println("Member Id:" +m_id);
		
	}
	public void setCreditcardNo(String creditcardNo)
  {
	  this.creditcardNo = creditcardNo;
  }
  public String getCreditcardNo()
  {
	  return creditcardNo;
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