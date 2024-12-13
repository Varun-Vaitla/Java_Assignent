class Ellipes
{
void area(double b,double a)
{

double pi=3.14;

double res=pi*a*b;
System.out.println(res);
}
}
class ElliRunner
{
public static void main(String[] args)
{
Ellipes e=new Ellipes();
e.area(10,15);
}
}