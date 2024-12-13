class Circle
{
void area(double r)
{

double pi=3.14;
double res=pi*r*r;
System.out.println(res);
}
}
class CirRunner
{
public static void main(String[] args)
{
Circle c=new Circle();
c.area(10);
}
}