
public class patientInformationMain 
{

	public static void main(String[] args) 
	{
		PatientInformation patient = new PatientInformation();
		
		patient.setName("bob");
		patient.setAddress("21 corbin drive");
		System.out.println(patient.getAddres());
		System.out.println(patient.getName());
		patient.setBalanceowed(50000);
		System.out.println(patient.getRemainingBalanceOwed(20000));

	}

}
