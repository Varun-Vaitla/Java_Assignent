class Sector
{
void area(double t,double r)
{
double pi=3.14;
double res=pi*r*r*t;
System.out.println(res);
}
public static void main(String[] args)
{
Sector s=new Sector();
s.area(30,5);
}
}