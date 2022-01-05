package all_Class;
import java.lang.*;

public abstract class Payment
{
	protected String paymentId;
	protected double amount;
	
	public Payment()
	{
		
	}
	public Payment(String paymentId, double amount)
	{
		this. paymentId = paymentId;
		this.amount = amount;
	}
	
	public abstract void showDetails();

	public void setPaymentId(String paymentId)
	{
		this.paymentId = paymentId;
	}
	public String getPaymentId()
	{
		return paymentId;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return amount;
	}

}