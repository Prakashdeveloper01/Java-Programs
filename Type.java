class Type
{
public static void main(String args[])
{
int a=5;
double b=3.11;
char c='S';
float f=555.666f;
short s=222;
long l=43535344445L;
boolean d=true;
System.out.println("Integer value: " + a);
System.out.println("Double value: " + b);
System.out.println("Character value: " + c);
System.out.println("Boolean value: " + d);
System.out.println("Float value: " + f);
System.out.println("Short value: " + s);
System.out.println("Long value:"+l);
System.out.println("-----------------------");
int sum = a + 5;
double product = b * 2;
char nextChar = (char) (c + 1);
System.out.println("Sum of integer value and 5: " + sum);
System.out.println("Product of double value and 2: " + product);
System.out.println("Next character after " + c + ": " + nextChar);
}
}
