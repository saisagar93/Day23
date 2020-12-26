interface IEmployeeWageComputation						//Interface 
{
        public void addCompanyWage(String company,int empRatePerHr, int numOfWorkingDays, int maxWorkingHrs);
        public void computeEmpWage();
}

class EmployeeWageComputation implements IEmployeeWageComputation
{
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public int companyCount=0;
        public CompanyWage[] companyWageArray;

        public EmployeeWageComputation()					//Constructor
        {
                companyWageArray=new CompanyWage[4];
        }

        public void addCompanyWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)	//Add company wages and storing in an array
        {
                companyWageArray[companyCount]=new CompanyWage(company,empRatePerHr,numOfWorkingDays,maxWorkingHrs);
                companyCount++;
        }

        public void computeEmpWage()						//for computing wages for a company
        {
                for(int i=0;i<companyCount;i++)
                {
                        computeEmpWage(companyWageArray[i]);
                        System.out.println(companyWageArray[i]);
                }
        }

        public void computeEmpWage(CompanyWage companyEmpWage)			//Compute method for giving total employee wages
        {
                int empHrs=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while(totalEmpHrs<=companyEmpWage.maxWorkingHrs && totalWorkingDays<=companyEmpWage.numOfWorkingDays)
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
                totalEmpWage=totalEmpHrs*companyEmpWage.empRatePerHr;
                System.out.println("Company: "+companyEmpWage.company+" Total Employee Wage: "+totalEmpWage);
        }

        public static void main(String[] args)					//Main class
        {
                EmployeeWageComputation builder=new EmployeeWageComputation();
                builder.addCompanyWage("Dmart",12,34,56);
                builder.addCompanyWage("Reliance",22,14,26);
		builder.addCompanyWage("Deloitte",62,44,26);
                builder.computeEmpWage();
        }
}

class CompanyWage								//class for variables of a company
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
