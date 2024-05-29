class Person
{
void display()
{
System.out.println("Hello Sir.....");
}

class Boy extends Person
{
void display()
{
System.out.println("Hi Boy...");
}
 
public static void main(String args[])
{
Boy a=new Boy();
a.display();
}
}