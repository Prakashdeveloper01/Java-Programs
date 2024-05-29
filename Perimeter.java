import java.util.*;
class Perimeter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Square case 1,Rectangle case 2, Circle case 3");
int input=sc.nextInt();
switch(input){
case 1:
System.out.println("enter the sides:");
int sides=sc.nextInt();
int Square=4*sides;
System.out.println("perimeter of the square is:      "    +Square);
break;
case 2:
System.out.println("enter the length and breadth:");
int i=sc.nextInt();
int b=sc.nextInt();
int rect=2*(i+b);
System.out.println("perimeter of the rectangle is:      "    +rect);
break;
case 3:
System.out.println("enter the radius:");
int radius=sc.nextInt();
int circle=2*(22/7)*radius;
System.out.println("perimeter of the circle is:      "    +circle);
break;
default:
System.out.println("please enter the valid input");
break;
}
}
}




