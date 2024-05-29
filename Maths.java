import java.util.*;
class Maths
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter A value:");
int a=s.nextInt();
System.out.println("Enter B value:");
int b=s.nextInt();

a+=b;
System.out.println("A+=B       :"+  a);
a-=b;
System.out.println("A-=B       :"+  a);
a*=b;
System.out.println("A*=B       :"+  a);
a/=b;
System.out.println("A/=B       :"+  a);
a%=b;
System.out.println("A%=B       :"+  a);
}
}