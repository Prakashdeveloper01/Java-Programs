class Employee5
{
private int empId;
private String empName;
private int empAge;
private int empSalary;

public Employee5(int id, String name, int age, int salary) 
{
this.empId = id;
this.empName = name;
this.empAge = age;
this.empSalary = salary;
}

public void setEmpId(int id)
{
this.empId=id;
}
public int getEmpid()
{
return empId;
}
public void setEmpName(String name)
{
this.empName=name;
}
public String getEmpName()
{
return empName;
}
public void setEmpAge(int age)
{
this.empAge=age;
}
public int getEmpAge()
{
return empAge;
}
public void setEmpSalary(int salary)
{
this.empSalary=salary;
}
public int getEmpSalary()
{
return empSalary;
}
}
