class Trep
{
double area()
{

double a=10;
double b=15;
double h=10;
double res=0.5*a+b*h;
return res;
}
}
class TrepRunner
{
public static void main(String[] args)
{
Trep t=new Trep();
double x=t.area();
System.out.println(x);
}
}