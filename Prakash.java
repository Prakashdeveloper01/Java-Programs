class Prakash
{


public Prakash(int age,String degree)
{
this.age=age;
this.degree=degree;
}

public Prakash(int age,String degree,int number)
{
this.age=age;
this.degree=degree;
this.number=number;
}

void display()
{
System.out.println("Age   :   "+age);
System.out.println("Degree   :  "+degree);
System.out.println("Number  :  "+number);
}

public static void main(String args[])
{
Prakash a=new Prakash(23,"BCA,MCA",63);
a.display();
}
}