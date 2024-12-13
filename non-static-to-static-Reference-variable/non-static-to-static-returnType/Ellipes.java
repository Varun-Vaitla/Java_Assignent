class Ellipes
{
double area()
{
double  pi=3.14;
double a=10;
double b=15;
double res=pi*a*b;
return res;
}
public static void main(String[] args)
{
Ellipes e=new Ellipes();
double x=e.area();
System.out.println(x);
}
}