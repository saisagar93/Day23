public class EmployeeWageComputation
{
	public static void main(String[] args)					//Main method
	{

		System.out.println("Welcome to employee wage computation");
		int fullTime=1;
		int partTime=2;
		int empCheck=(int)Math.floor(Math.random()*10)%3;		//To generate a random valueof 0 to 2
		int empHrs=0;
		int empRatePerHr=20;
		int salary=0;

		if(empCheck==fullTime)						//Checking if employee is fullTime
		{
			empHrs=8;
		}
		else if(empCheck==partTime)					//Checking if Employee is part time
		{
			empHrs=4;
		}
		else								//Checking if employee is absent
		{
			empHrs=0;
		}
		salary=empHrs*empRatePerHr;					//salary of an employee
		System.out.println("Employee Wage: "+salary);			//To print daily salary of an employee
	}
}
