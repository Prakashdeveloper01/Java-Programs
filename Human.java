class Human
{
void sleep()
{
System.out.println("Sleeping");
}
}
class Boy extends Human
{
void sleep()
{
System.out.println("Boy is sleeping");
}

public static void main(String args[])
{
Human obj=new Boy();
obj.sleep();
}

}