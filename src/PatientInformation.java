
public class PatientInformation 
{
	private String patientName;
	private String patientAddress;
	private float balanceOwed;
	
	public void setName(String arg1)
	{
		patientName = arg1;
	}
	
	public void setAddress(String arg1)
	{
		patientAddress = arg1;
	}
	
	public String getName()
	{
		return patientName;
	}
	
	public String getAddres()
	{
		return patientAddress;
	}
	
	public void setBalanceowed(float arg1)
	{
		balanceOwed = arg1;
	}
	
	public float getRemainingBalanceOwed(float arg1)
	{
		return balanceOwed - arg1;
	}
}
