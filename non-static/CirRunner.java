class Cir
{
double area(double r)
{
double pi=3.14;
double res=pi*r*r;

return res;
}
}
class CirRunner
{
public static void main(String[] args)
{
double x=new Cir().area(5);
System.out.println(x);
}
}
