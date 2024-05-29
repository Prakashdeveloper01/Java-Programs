import java.util.*;
class Leapyear
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter a year to find the leap year");
int a=obj.nextInt();
if(a\4==0){
System.out.println("Its a leap year");
}
else{
System.out.println("Its not a leap year");
}
}
}