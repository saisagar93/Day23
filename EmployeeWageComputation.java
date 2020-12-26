public class EmployeeWageComputation
{
	//Constants
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_WORKING_HRS=100;

	public static void main(String[] args)					//Main method
	{

		System.out.println("Welcome to employee wage computation");
		//Variables
		int empHrs=0;
		int totalEmpWage=0;
		int empWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		//while loop for less than 20 working days and less than 100 working hours
		while(totalEmpHrs<=MAX_WORKING_HRS && totalWorkingDays<=NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;	//To generate a random valueof 0 to 2

			switch(empCheck)
			{
				case FULL_TIME:
				empHrs=8;
				break;

				case PART_TIME:
				empHrs=4;
				break;

				default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;					//Total working hours
		}
		totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;                       //Salary of an employee
		System.out.println("Total Employee Wage: "+totalEmpWage);
	}
}
