class Sector
{
void area()
{
double t=10;
double pi=3.14;
double r=2;
double res=pi*r*r*t;
System.out.println(res);
}
public static void main(String[] args)
{
Sector s=new Sector();
s.area();
}
}