import java.util.LinkedList;							//Linked list package
import java.util.HashMap;							//Hash map package

interface IEmployeeWageComputation						//Interface method
{
        public void addCompanyWage(String company,int empRatePerHr, int numOfWorkingDays, int maxWorkingHrs);
        public void computeEmpWage();
}
	
class EmployeeWageComputation implements IEmployeeWageComputation		//Main class
{
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;

        public LinkedList<CompanyWage> companyWageArray;
        public HashMap<String,CompanyWage> companyToEmpWageMap;
        public EmployeeWageComputation()					//constructo for Linked list and Hash map
        {
                companyWageArray=new LinkedList<>();
                companyToEmpWageMap=new HashMap<>();
        }

        public void addCompanyWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)	//Add company wages with add and put
        {
                CompanyWage companyName=new CompanyWage(company,empRatePerHr,numOfWorkingDays,maxWorkingHrs);
                companyWageArray.add(companyName);
                companyToEmpWageMap.put(company,companyName);
        }

        public void computeEmpWage()
        {
                for(int i=0;i<companyWageArray.size();i++)
                {
                        CompanyWage companyName=companyWageArray.get(i);
                        companyName.setTotalEmpWage(this.computeEmpWage(companyName));
                        System.out.println(companyName);
                }
        }

        public int computeEmpWage(CompanyWage companyEmpWage)				//Method to compute total employee wages
        {
                int empHrs=0;
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
                return totalEmpHrs*companyEmpWage.empRatePerHr;
        }

        public static void main(String[] args)						//Main method
        {
                EmployeeWageComputation builder=new EmployeeWageComputation();
                builder.addCompanyWage("Dmart",12,34,56);
                builder.addCompanyWage("Reliance",22,14,26);
		builder.addCompanyWage("Deloitte",62,44,26);
                builder.computeEmpWage();
        }
}

class CompanyWage									//class for variables of a company								
{
        public String company;
        public int empRatePerHr;
        public int numOfWorkingDays;
        public int maxWorkingHrs;
        public int totalEmpWage;
        public CompanyWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)
        {
                this.company=company;
                this.empRatePerHr=empRatePerHr;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxWorkingHrs=maxWorkingHrs;
                totalEmpWage=0;
        }
        public void setTotalEmpWage(int totalEmpWage)					//Set method for total employee wage
        {
                this.totalEmpWage=totalEmpWage;
        }
        @Override
        public String toString()
        {
                return "Total emp wage for company : "+company+" is: "+totalEmpWage;
        }
}
