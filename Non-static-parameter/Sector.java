class Sector
{
void area(double r,double t)
{
final double pi=3.14;
double res= pi*r*r*t;
System.out.println(res);
}
public static void main(String[] args)
{
new Sector().area(10,5);
}
}