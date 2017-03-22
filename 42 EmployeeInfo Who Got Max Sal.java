/*Program To Find Employee Info Who Got Max Salary*/
import java.util.*;
class Employee
{
	int id;
	double sal;
	String name;
	static Employee empInfo;
	
	Employee(int id,double sal,String name)
	{
	  this.id=id;
	  this.sal=sal;
	  this.name=name;
	}

	
	public static Employee empInformation(Employee[] emp)
	{
	 double maxSal=emp[0].sal;
	 for (int i=1;i<emp.length;i++)
	 {
	   if (emp[i].sal>maxSal)
	   {
		maxSal=emp[i].sal;
	   }
	 }
	 for (int j=0;j<emp.length;j++)
	 {
	  if (emp[j].sal==maxSal)
	  {
		empInfo=emp[j];
	  }
	 }  
	  return empInfo;
	}
	
	public static void main(String[] args) 
	{
		Scanner sr=new Scanner(System.in);
		System.out.print("Number Of Employees :");
	    int empNum=sr.nextInt();
		Employee emp[]=new 	Employee[empNum];
		for (int i=0;i<empNum;i++)
		{
		  System.out.println("Enter The Employee ID:");
		  int empID=sr.nextInt();
		  System.out.println("Enter The Employee Salary:");
		  double empSal=sr.nextDouble();
		  System.out.println("Enter The Employee Name:");
		  String empName=sr.next();
		  emp[i]=new Employee(empID,empSal,empName);
		 

       }

	    empInfo=empInformation(emp);
		
		System.out.println("Employee Name Is :"+empInfo.name);
		System.out.println("Employee Name Is :"+empInfo.name);
		System.out.println("Employee Name Is :"+empInfo.name);
		System.out.println("Employee ID Is:"+empInfo.id);
		System.out.println("Employee Salary Is:"+empInfo.sal);
   }
}
