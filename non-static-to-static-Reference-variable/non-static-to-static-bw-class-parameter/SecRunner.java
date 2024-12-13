class Sector
{
void area(double r,double t)
{

double pi=3.14;

double res=pi*r*r*t;
System.out.println(res);
}
}
class SecRunner
{
public static void main(String[] args)
{
Sector s=new Sector();
s.area(10,5);
}
}