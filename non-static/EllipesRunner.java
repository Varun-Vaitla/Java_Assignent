class Ellipes
{
double area(double a,double b)
{
double pi=3.14;
double res=pi*a*b;

return res;
}
}
class EllipesRunner
{
public static void main(String[] args)
{
double x=new Ellipes().area(5,7);
System.out.println(x);
}
}