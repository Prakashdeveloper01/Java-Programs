public abstract class Vehicle{
private String make;
private String model;
private int year;

public Vehicle(String make,String model, int year)
{
this.make=make;
this.model=model;
this.year=year;
}

public String getmake()
{
return make;
}
public String getmodel()
{
return model;
}
public int getyear()
{
return year;
}
}
class Truck extends Vehicle{
public void Truck(String make,String model,int year)
{
super(make,model,year);
}
}





