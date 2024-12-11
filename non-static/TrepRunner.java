class Trep
{
double area(double a,double b,double h)
{

double res=0.5*a+b*h;

return res;
}
}
class TrepRunner
{
public static void main(String[] args)
{
double x=new Trep().area(5,7,2);
System.out.println(x);
}
}