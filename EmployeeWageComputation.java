public class EmployeeWageComputation
{
	//Constants
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;

	public static void main(String[] args)					//Main method
	{

		System.out.println("Welcome to employee wage computation");
		//Variables
		int empHrs=0;
		int totalEmpWage=0;
		int empWage=0;

		for(int day=0;day<NUM_OF_WORKING_DAYS;day++)			//for loop for 20 working days
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;	//To generate a random valueof 0 to 2

			switch(empCheck)					//switch case for employee fulltime,parttime and absent 
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
			empWage=empHrs*EMP_RATE_PER_HR;				//salary of an employee for a day
			totalEmpWage+=empWage;
		}

		System.out.println("Total Employee Wage: "+totalEmpWage);	//salary for a month
	}
}
