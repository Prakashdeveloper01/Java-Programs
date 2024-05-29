public class Employees
{
static int eid;
static String ename;
static String companyname; 

public Employees(int eid,String ename,String companyname)
{ 
this.eid=eid;
this.ename=ename;
this.companyname=companyname;
}
public  void display() 
{
System.out.println("empid:  "+ eid);
System.out.println("ename:  "+ ename);
System.out.println("comapanyname:  "+ companyname);
}
public static void main(String args[])
{
Employees emp1=new Employee(1,"Saving","xyz");
Employees emp2=new Employee(122345,"Current","Online");
emp1.display();
emp2.display();
}
}

 