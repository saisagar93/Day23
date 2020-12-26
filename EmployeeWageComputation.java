public class EmployeeWageComputation						//Main class
{
	public static void main(String[] args)					//Main method
	{

		System.out.println("Welcome to employee wage computation");
		int fullTime=1;
		int empCheck=(int)Math.floor(Math.random()*10)%2;		//To generate a random valueof 0 or 1
		int empHrs=0;
		int empRatePerHr=20;
		int salary=0;
		if(empCheck==fullTime)						//Checking for employee is fullTime or absent 
		{
			empHrs=8;
		}
		else
		{
			salary=0;
		}
		salary=empHrs*empRatePerHr;					//salary of an employee
		System.out.println("Employee Wage: "+salary);			//To print daily salary of an employee 
	}
}
