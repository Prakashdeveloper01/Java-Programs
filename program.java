class Program{
static int plusMethod(int x,int y){
return x + y;
}
static double plusMethod(double x, double y){
return x+ y;
}
public static void main(String args[]){
int myNum1=plusMethod(9,2);
double myNum3=plusMethod(9.1,6.3);
System.out.println("int:"+myNum1);
System.out.println("double:"+myNum3);
}
}
