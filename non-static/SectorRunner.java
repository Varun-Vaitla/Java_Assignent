class Sector
{
double area(double r,double t)
{
double pi=3.14;
double res=pi*r*r*t;

return res;
}
}
class SectorRunner
{
public static void main(String[] args)
{
double x=new Sector().area(5,7);
System.out.println(x);
}
}