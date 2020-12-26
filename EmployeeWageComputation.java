public class EmployeeWageComputation						//Main class
{
	public static void main(String[] args)					//Main method
	{
		System.out.println("Welcome to employee wage computation");
		int present=1;
		int empCheck=(int)Math.floor(Math.random()*10)%2;               //To generate a random valueof 0 or 1
		System.out.println("Random Value: "+empCheck);			//To print random value
		if(empCheck==present)						//Checking for employee present or absent
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
