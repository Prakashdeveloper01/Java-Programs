import java.util.Scanner;
class Userid
{
public static void main(String args[])
{
String x="Raj";
String y="123";
Scanner s=new Scanner(System.in);
System.out.println("Enter username:");
String upid=s.nextLine();
System.out.println("Enter Password:");
String uppas=s.nextLine();
if((upid.equals(x) && uppas.equals(y)))
{
System.out.println("----------Welcome Raj-----------");
}
else{
System.out.println("-------Invalid User------");
}
}
}