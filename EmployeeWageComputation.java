public class EmployeeWageComputation						//Main class
{
	//Constants
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public String company;
        public int empRatePerHr;
        public int numOfWorkingDays;
        public int maxWorkingHrs;

        public EmployeeWageComputation(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)//constuctor
        {
                this.company=company;
                this.empRatePerHr=empRatePerHr;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxWorkingHrs=maxWorkingHrs;
        }
        public void computeEmpWage()						//Compute method
        {
                int empHrs=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<=maxWorkingHrs && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random()*10)%3;

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
                        totalEmpHrs+=empHrs;
                }
                totalEmpWage=totalEmpHrs*empRatePerHr;
                System.out.println("Company: "+company+" Total Employee Wage: "+totalEmpWage);	//Total employee wage

        }

        public static void main(String[] args)						//Main method
        {
                EmployeeWageComputation dmart=new EmployeeWageComputation("Dmart",12,34,56);
                EmployeeWageComputation realiance=new EmployeeWageComputation("realiance",22,44,16);
                EmployeeWageComputation deloitte=new EmployeeWageComputation("Deloitte",62,44,26);
                dmart.computeEmpWage();
                realiance.computeEmpWage();
                deloitte.computeEmpWage();
        }
}
