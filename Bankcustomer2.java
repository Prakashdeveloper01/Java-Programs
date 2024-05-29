public class Bankcustomer02
{
int accno;
String acctype;
String amtfields;

public Bankcustomer02(int accno,String acctype)
{
this.accno=accno;
this.acctype=acctype;
}
public Bankcustomer02(int accno,String acctype,String amtfields){
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

Bankcustomer02 b1=new Bankcustomer02(1656562,"Saving");
Bankcustomer02 b2=new Bankcustomer02(122345,"Current","Online");
b1.display();
b2.display();
}
}
