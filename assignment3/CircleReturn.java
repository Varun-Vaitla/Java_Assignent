class CircleReturn
{
static double area()
{
final double pi=3.14;
double r=10;

double res=pi*r*r;
return res;
}
public static void main(String[] args)
{
double x=area();
System.out.println(x);
}
}