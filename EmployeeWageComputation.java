public class EmployeeWageComputation							//Main class
{
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public int companyCount=0;
        public CompanyWage[] companyWageArray;

        public EmployeeWageComputation()
        {
                companyWageArray=new CompanyWage[4];
        }

        public void addCompanyWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)
        {
                companyWageArray[companyCount]=new CompanyWage(company,empRatePerHr,numOfWorkingDays,maxWorkingHrs);
                companyCount++;
        }

        public void computeWage()							//Compute method for storing wages in array
        {
                for(int i=0;i<companyCount;i++)
                {
                        computeEmpWage(companyWageArray[i]);
                }
        }

        public void computeEmpWage(CompanyWage company)					//computes employee wages
        {
                int empHrs=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<=company.maxWorkingHrs && totalWorkingDays<=company.numOfWorkingDays)
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
                totalEmpWage=totalEmpHrs*company.empRatePerHr;
                System.out.println("Company: "+company.company+" Total Employee Wage: "+totalEmpWage);

        }

        public static void main(String[] args)						//main method
        {
                EmployeeWageComputation builder=new EmployeeWageComputation();
                builder.addCompanyWage("Dmart",12,34,56);
                builder.addCompanyWage("Reliance",22,14,26);
		builder.addCompanyWage("Deloitte",62,44,26);
                builder.computeWage();
        }
}

class CompanyWage
{
        public String company;
        public int empRatePerHr;
        public int numOfWorkingDays;
        public int maxWorkingHrs;

        public CompanyWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)	//Parameterized constructor
        {
                this.company=company;
                this.empRatePerHr=empRatePerHr;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxWorkingHrs=maxWorkingHrs;
        }

}
