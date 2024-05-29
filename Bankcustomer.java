public class Bankcustomer01
{
int accno;
String acctype;
String amtfields;

public Bankcustomer(int accno,String acctype,String amtfields)
{
this.accno=accno;
this.acctype=acctype;
this.amtfields=amtfields;
}
void display()
{
System.out.println("accno:  "+ accno);
System.out.println("acctype:  "+ acctype);
System.out.println("amtfields:  "+ amtfields);

}

public static void main(String args[])
{
Bankcustomer b1=new Bankcustomer(1656562,"Saving","NEFT");
Bankcustomer b2=new Bankcustomer(122345,"Current","Online");
b1.display();
b2.display();
}
}
